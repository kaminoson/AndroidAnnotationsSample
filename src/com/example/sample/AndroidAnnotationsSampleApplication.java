package com.example.sample;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;

import android.app.Application;

@ReportsCrashes(formKey = "17TpLmVBMwmQHzwVC0097g6rznbW2Vj")
public class AndroidAnnotationsSampleApplication extends Application {
	//==========================================================
	//メソッド

	//_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
	//オーバーライドするメソッド

	@Override
	public void onCreate() {
		//ACRAの初期化
		ACRA.init(this);

		super.onCreate();
	}
}
