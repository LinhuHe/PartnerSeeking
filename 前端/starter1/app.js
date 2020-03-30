//app.js
App({
  onLaunch: function () {
    var th = this;
    wx.getSetting({
      success: res => {
        if (res.authSetting['scope.userInfo']) {
          // 已经授权，可以直接调用 getUserInfo 获取头像昵称，不会弹框
          wx.getUserInfo({
            success: res => {
              // 可以将 res 发送给后台解码出 unionId
              this.globalData.userInfo = res.userInfo
              console.log(this.globalData.userInfo);
              if (this.userInfoReadyCallback) {
                this.userInfoReadyCallback(res)
              }
            }
          })
        }
      }
    })

    wx.login({
      success: (res) => {
        // 获取到用户的 code 之后：res.code
        console.log("用户的code:" + res.code);
        // 可以传给后台，再经过解析获取用户的 openid
        // 或者可以直接使用微信的提供的接口直接获取 openid ，方法如下：
        wx.request({
          //     // 自行补上自己的 APPID 和 SECRET
          url: 'https://api.weixin.qq.com/sns/jscode2session?appid=wx1d1c09bef8994e61&secret=1895fdb8ba3c1f45da36ee4c9bfd46b8&js_code=' + res.code + '&grant_type=authorization_code',
          success: (res) => {
            //         // 获取到用户的 openid
            //console.log("用户的openid:" + res.data.openid);
            this.globalData.openId = res.data.openid
            console.log("用户的openid:"+this.globalData.openId);
            console.log(this.globalData.userInfo);
          }
 
        });
      }
    });
  },

  globalData: {
    serverUrl: 'http://192.168.43.214:8080/',
    openId: '',
    secret: "1895fdb8ba3c1f45da36ee4c9bfd46b8",
    appid: "wx1d1c09bef8994e61",
    code: "",
    
    userInfo: null,
  },

})