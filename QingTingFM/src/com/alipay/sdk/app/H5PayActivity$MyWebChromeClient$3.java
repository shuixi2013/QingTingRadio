package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

class H5PayActivity$MyWebChromeClient$3
  implements DialogInterface.OnClickListener
{
  H5PayActivity$MyWebChromeClient$3(H5PayActivity.MyWebChromeClient paramMyWebChromeClient, JsResult paramJsResult)
  {
  }

  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.cancel();
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     com.alipay.sdk.app.H5PayActivity.MyWebChromeClient.3
 * JD-Core Version:    0.6.2
 */