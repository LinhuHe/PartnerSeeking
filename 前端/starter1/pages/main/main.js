// pages/main/main.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {

  },
  onTapbasket() {
    var that = this
    wx.navigateTo({
      url: '/pages/list/list?keyword=运动',//运动
    })
  },
  onTapfriend() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=交友',//交友
    })
  },
  onTappencil() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=自习',//自习
    })
  },
  onTapfood() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=约饭',//约饭
    })
  },
  onTapbag() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=旅游',//旅游
    })
  },
  
  onTappc() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=电竞',//电竞
    })
  },

  onTapadd(){
    wx.navigateTo({
      // url: '/pages/fabu/fabu',
      url:"/pages/launch/launch"
    })
  },
  
  //最底下的灯泡
  onTapdp() {
    wx.navigateTo({
      url: '/pages/list/list?keyword=hot',
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    console.log(app.globalData.userInfo)
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