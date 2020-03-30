// pages/list/list.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    data_list: {},
    keyword: "",
    serverurl: app.globalData.serverUrl,
    isMypost:0
  },


  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var th = this;
    this.data.keyword = options.keyword;
    //连接后台访问数据
    var url = "";
    if (this.data.keyword == "hot")//点击灯泡查看所有post，按照时间降序排列
      url = this.data.serverurl+'post/findPostByPostTimeDesc/';
    else if(this.data.keyword == "myjoin"){
      //映射url
      console.log("myjoin")
      url = this.data.serverurl + "post/iJoined"
      console.log(app.globalData.openId)
    }
    else if(this.data.keyword == "mypost"){
      //映射url
      console.log("mypost")
      this.data.isMypost = 1//若是我发布的列表页面，跳转会不同
      url = this.data.serverurl + "post/findPostByUID"
    }
    else if(this.data.keyword == "search"){
      url = this.data.serverurl + "post/searchPost"
    }
    else //按照类别进行访问
      url = this.data.serverurl +'post/findPostByKeyword/';
    console.log(url);
    wx.request({
      url: url,
      method: "GET",
      header: { 'Content-Type': 'application/json' },
      data:{
        keyword: this.data.keyword,
        uid:app.globalData.openId,
        searchword: options.key
      },
      success: function (res) {
        console.log(res.data);
        th.setData({
          data_list: res.data,//获取列表数据
        })
      } 
    })
    
    // console.log(this.data.data_list)
  },
  
  bindViewTap: function (event) {

    var postid = event.currentTarget.dataset.postid;
    var mydata = JSON.stringify(this.data.data_list[postid]);
    var url = "/pages/content/content?value=" + mydata;
    console.log(postid)

    //若是从“我发布的”进入，则会进入申请人列表，否则进入帖子详情页面
    if (this.data.isMypost){
      wx.navigateTo({
        url:"/pages/applylist/applylist?value=" + mydata
      })
    }
    else{
      wx.navigateTo({
        url: url
      })
    }
    
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   **/
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },

})