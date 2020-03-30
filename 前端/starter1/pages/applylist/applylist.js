// pages/applylist/applylist.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    mydata:null,
    title:null,
    data_list:{},
    serverurl:app.globalData.serverUrl,
    select_data:{}
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.data.mydata = JSON.parse(options.value);
    console.log(this.data.mydata);
    console.log(this.data.mydata.pTittle);
    this.setData({
      title: this.data.mydata.pTittle
    })

    var th = this;

    //根据帖子编号找到对应的申请信息
    wx.request({
      url: app.globalData.serverUrl+"reply/getUserInfoByPid",
      method: "GET",
      header: { 'Content-Type': 'application/json' },
      data: {
        pid: this.data.mydata.pId
      },
      success: function (res) {
        th.setData({
          data_list: res.data,//获取列表数据
        })
        console.log(th.data.data_list)
      } 
    })
  },

  onTapacc: function (event){
    //获取选中的申请人在视图中的id
    var applyid = event.currentTarget.dataset.applyid;
    console.log(applyid)
    var mydata = this.data.data_list[applyid]
    console.log(mydata);
    //获取申请人数据
    this.data.select_data = this.data.data_list[applyid]

    wx.request({
      url: app.globalData.serverUrl + "/appointment/addAppointment",
      method: "GET",
      header: { 'Content-Type': 'application/json' },
      data: {
        aInviterid:app.globalData.openId,
        aInvitedid: this.data.select_data.uId,
        aPid: this.data.mydata.pId
      },
      success: function (res) {
        wx.showToast({
          title: '您已确认',
          icon: 'success',
          duration: 3000
        })
      } 
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