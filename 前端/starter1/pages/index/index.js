const app = getApp()

Page({
  data: {
    //判断小程序的API，回调，参数，组件等是否在当前版本可用。
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    isHide: false
  },

  onLoad: function () {
    var that = this;
    // 查看是否授权
    wx.getSetting({
      success: function (res) {
        if (res.authSetting['scope.userInfo']) {
          wx.getUserInfo({
            success: function (res) {
              wx.login({
                success: res => {
                  wx.request({
                    //     // 自行补上自己的 APPID 和 SECRET
                    url: 'https://api.weixin.qq.com/sns/jscode2session?appid=wx1d1c09bef8994e61&secret=1895fdb8ba3c1f45da36ee4c9bfd46b8&js_code=' + res.code + '&grant_type=authorization_code',
                    success: res => {
                    }
                  });
                }
              });
            }
          });

          wx.switchTab({
            url: '../main/main',
          })
        } else {
          // 用户没有授权
          // 改变 isHide 的值，显示授权页面
          that.setData({
            isHide: true
          });
        }
      }
    });


  },

  bindGetUserInfo: function (e) {
    if (e.detail.userInfo) {
      //用户按了允许授权按钮
      var that = this;
      // 获取到用户的信息了，打印到控制台上看下
      app.globalData.userInfo = e.detail.userInfo;
      // console.log(app.globalData.userInfo)
      // console.log(app.globalData.openId)
      // console.log(app.globalData.userInfo.nickName),
      // console.log(app.globalData.userInfo.gender),
      // console.log(app.globalData.userInfo.avatarUrl),
      wx.request({
        url: app.globalData.serverUrl+"/user/addUserInfo",
        method: "GET",
        header: { 'Content-Type': 'application/json' },
        data: {
          uid:app.globalData.openId,
          nickname:app.globalData.userInfo.nickName,
          sex: app.globalData.userInfo.gender,
          headortrait: app.globalData.userInfo.avatarUrl
        },
      })
      //授权成功后,通过改变 isHide 的值，让实现页面显示出来，把授权页面隐藏起来
      that.setData({
        isHide: false
      });
      wx.switchTab({ 
        url: '../main/main',
      })
    } else {
      //用户按了拒绝按钮
      wx.showModal({
        title: '警告',
        content: '您点击了拒绝授权，将无法进入小程序，请授权之后再进入!!!',
        showCancel: false,
        confirmText: '返回授权',
        success: function (res) {
          // 用户没有授权成功，不需要改变 isHide 的值
          if (res.confirm) {
          }
        }
      });
    }
  }
})