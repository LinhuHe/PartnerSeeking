import { $init, $digest } from '../../utils/common.util'
const app = getApp()
var dateTimePicker = require('../../utils/dateTimePicker.js');

Page({

  data: {
    titleCount: 0, //标题字数
    contentCount: 0, //正文字数
    title: '', //标题内容
    content: '', //正文内容

    serverurl: app.globalData.serverUrl,
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

    keyword: "",
    place: "",
    user_id: app.globalData.openId,
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

  handleTitleInput(e) {
    const value = e.detail.value
    this.data.title = value
    this.data.titleCount = value.length  //计算已输入的标题字数
    $digest(this)
  },

  handleContentInput(e) {
    const value = e.detail.value
    this.data.content = value
    this.data.contentCount = value.length  //计算已输入的正文字数
    $digest(this)
  },

  getinputplace: function (e) {
    // console.log(e.detail.value)
    this.setData({
      place: e.detail.value 
    })
  },

  bindPickerChange_hx: function (e) {
    // console.log('picker发送选择改变，携带值为', e.detail.value);
    console.log(app.globalData.openId);
    this.setData({
      hx_index: e.detail.value,
    })
    // console.log('自定义值:', this.data.hx_select);
  },

  onLoad() {
    $init(this)
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
  },

  submitForm:function(){
    //从类别选择器中取得关键字字段
    var keyword = this.data.pic_array[this.data.hx_index].name;
    var th = this;
    th.setData({
      keyword: keyword,
      content: "活动地点：" + this.data.place + "\n" + this.data.content,
    })

    console.log("标题：" + this.data.title);
    console.log("关键字：" + this.data.keyword);
    console.log("内容：" + this.data.content);
    console.log("用户选择的截止日期：" + this.data.date);
    console.log("用户的openid：" + app.globalData.openId);
    var that = this
    wx.chooseImage({
      success: function (res) {
        var tempFilePaths = res.tempFilePaths
        console.log('临时路径：' + res.tempFilePaths[0])
        wx.uploadFile({
          url: app.globalData.serverUrl + "/post/addPost",
          filePath: tempFilePaths[0],
          name: "Picfile",
          formData:{
            pTittle: th.data.title,
            pContent: th.data.content,
            pUid: app.globalData.openId,
            pKeyword: th.data.keyword,
            pEndtime: th.data.date,
          },
          success:function(res){
            console.log(res)
            wx.showToast({
              title: '上传成功',
              icon: 'success',
              duration: 3000
            })
            setTimeout(function(){
              wx.navigateBack({
              })
            },1000)
            
          }
        })
      }
    })
  }
})