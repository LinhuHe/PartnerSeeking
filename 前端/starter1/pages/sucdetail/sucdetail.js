// pages/sucdetail/sucdetail.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    concrete_data:{},
    serverurl:app.globalData.serverUrl,
    pic_addr:""
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    var mydata = JSON.parse(options.value);
    var postid = mydata.aPid;
    var th = this;
    wx.request({
      url: this.data.serverurl +"post/selectByPrimaryKeyNoBan",
      method: "GET",
      header: { 'Content-Type': 'application/json' },
      data: {
        pid: postid
      },
      success: function (res) {
        console.log(res.data);
        var addr = th.data.serverurl + "userPicture/" + res.data.pPic;
        th.setData({
          concrete_data: res.data,
          pic_addr:addr
        })
      }
    })

  },

  ontapapply:function(){
    wx.showToast({
      title: '您已报名'
    })
  },
  /**
   * 生命周期函数--监听页面初次渲染完成
   */
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

  }
})