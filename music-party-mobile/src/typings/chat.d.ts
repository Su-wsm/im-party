declare namespace Chat {

  interface Msg {
    from: string;
    msg: string;
    timestamp: number;
    userInfo?: ApiAuth.UserInfo
  }
}


