const app = getApp()
var dateTimePicker = require('../../utils/dateTimePicker.js');

Page({
  data: {
    serverurl:app.globalData.serverUrl,
    //这是一个本地的对象，然后绑定到页面上
    pic_array: [
      { id: 13, name: '运动' },
      { id: 14, name: '交友' },
      { id: 15, name: '自习' },
      { id: 16, name: '约饭' },
      { id: 17, name: '旅游' },
      { id: 18, name: '电竞' },
    ],
    hx_index: 0,

    keyword:"",
    title:"",
    place:"",
    content:"",
    user_id:app.globalData.openId,
    images: [],

    date: '2020-1-01',
    time: '00:00',
    dateTimeArray: null,
    dateTime: null,
    dateTimeArray1: null,
    dateTime1: null,
    startYear: 2020,
    endYear: 2050
  },

  bindPickerChange_hx: function (e) {
    // console.log('picker发送选择改变，携带值为', e.detail.value);
    console.log(app.globalData.openId);
    this.setData({
      hx_index: e.detail.value,  
    })
    // console.log('自定义值:', this.data.hx_select);
  },

  getinputtitle:function(e){
    // console.log(e.detail.value)
    this.setData({
      title:e.detail.value
    })
  },
  getinputplace: function (e) {
    // console.log(e.detail.value)
    this.setData({
      place: e.detail.value
    })
  },
  getinputcontent: function (e) {
    // console.log(e.detail.value)
    this.setData({
      content: e.detail.value
    })
  },

  submitForm :function(){
    //从类别选择器中取得关键字字段
    var keyword = this.data.pic_array[this.data.hx_index].name;
    var th = this;
    th.setData({
      keyword: keyword,
      content: "活动地点："+this.data.place+"\n"+this.data.content,
    })

    console.log("标题：" + this.data.title);
    console.log("关键字：" + this.data.keyword);
    console.log("内容："+this.data.content);
    console.log("用户选择的截止日期："+this.data.date);
    console.log("用户的openid："+app.globalData.openId);
    wx.request({
      url: app.globalData.serverUrl +"/post/addPost",
      method: "POST",
      header: { 'Content-Type': 'application/json' },
      data: {
        pTittle: this.data.title,
        pContent:this.data.content,
        pUid: app.globalData.openId,
        pKeyword:this.data.keyword,
        pEndtime:this.data.date,
      },
    })
  },

  // chooseImage: function () {
  //   var that = this
  //   // 上传图片 获取路径
  //   console.log(app.globalData.serverUrl)
  //   wx.chooseImage({
  //     success: function (res) {
  //       console.log('临时路径：' + res.tempFilePaths[0])
  //       wx.uploadFile({
  //         url: ,
  //         filePath: res.tempFilePaths[0],
  //         name: 'file',
  //         header: { "Content-Type": "multipart/form-data" },
  //         formData: {
  //           'program': 'logs'
  //         },
  //         success: function (result) {
  //           wx.showLoading({
  //             title: '上传中...',
  //           })
  //           //上传成功后的路径：
  //           var img = "服务器域名" + JSON.parse(result.data).path
  //           that.setData({
  //             img: img
  //           })
  //           wx.hideLoading()
  //           //缓存图片
  //           wx.setStorageSync('img', img)
  //         }
  //       })
  //     }
  //   })
  // },

  onLoad() {
    // 获取完整的年月日 时分秒，以及默认显示的数组
    var obj = dateTimePicker.dateTimePicker(this.data.startYear, this.data.endYear);
    var obj1 = dateTimePicker.dateTimePicker(this.data.startYear, this.data.endYear);
    // 精确到分的处理，将数组的秒去掉
    var lastArray = obj1.dateTimeArray.pop();
    var lastTime = obj1.dateTime.pop();

    this.setData({
      dateTime: obj.dateTime,
      dateTimeArray: obj.dateTimeArray,
      dateTimeArray1: obj1.dateTimeArray,
      dateTime1: obj1.dateTime
    });
  },

  removeImage(e) {
    const idx = e.target.dataset.idx
    this.data.images.splice(idx, 1)
    $digest(this)
  },

  handleImagePreview(e) {
    const idx = e.target.dataset.idx
    const images = this.data.images
    wx.previewImage({
      current: images[idx],  //当前预览的图片
      urls: images,  //所有要预览的图片
    })
  },
  
  changeDate(e) {
    this.setData({ date: e.detail.value });
  },
  changeTime(e) {
    this.setData({ time: e.detail.value });
  },
  changeDateTime(e) {
    this.setData({ dateTime: e.detail.value });
  },
  changeDateTime1(e) {
    this.setData({ dateTime1: e.detail.value });
  },
  changeDateTimeColumn(e) {
    var arr = this.data.dateTime, dateArr = this.data.dateTimeArray;

    arr[e.detail.column] = e.detail.value;
    dateArr[2] = dateTimePicker.getMonthDay(dateArr[0][arr[0]], dateArr[1][arr[1]]);

    this.setData({
      dateTimeArray: dateArr
    });
  },
  changeDateTimeColumn1(e) {
    var arr = this.data.dateTime1, dateArr = this.data.dateTimeArray1;

    arr[e.detail.column] = e.detail.value;
    dateArr[2] = dateTimePicker.getMonthDay(dateArr[0][arr[0]], dateArr[1][arr[1]]);

    this.setData({
      dateTimeArray1: dateArr
    });
  }
})