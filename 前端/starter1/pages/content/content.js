// pages/content/content.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    concrete_data:{},
    pic_addr: app.globalData.serverUrl,
    post_id:"",
    serverUrl:app.globalData.serverUrl
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    // this.setData({
    //   post_id:postid
    // })
    var mydata = JSON.parse(options.value);
    var th = this;

    console.log(mydata)
    this.data.post_id = mydata.pId
    console.log(this.data.post_id);
    
    th.setData({
      concrete_data:mydata
    })
    var addr = this.data.pic_addr +"userPicture/"+this.data.concrete_data.pPic;
    th.setData({
      pic_addr:addr
    })

    console.log(this.data.pic_addr);
  },
  //点击立即报名按钮
  ontapapply: function () {
    console.log("Apply");
    // var inviterID = this.data.concrete_data.pUid;
    var invitedID = app.globalData.openId;//用户的openid
    var pID = this.data.post_id;
    
    wx.request({
      url: app.globalData.serverUrl +"/reply/addReply",
      method: "GET",
      header: { 'Content-Type': 'application/json' },
      data: {
        uid: app.globalData.openId,
        pid: pID
      },
      success: function (res) {
        console.log(res);
        if(res.data==true){
          wx.showToast({
            title: '报名成功',
            duration: 2000
          })
        }
        else{
          wx.showToast({
            title: "您已报名"
          })
        }
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

  },


})