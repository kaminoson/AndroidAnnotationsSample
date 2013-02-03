package com.example.sample;

import android.app.Activity;
import android.widget.Button;
import android.widget.Toast;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.NoTitle;
import com.googlecode.androidannotations.annotations.ViewById;

@NoTitle
@EActivity(R.layout.view_main)
public class MainActivity extends Activity {
	//==========================================================
	//フィールド

	//_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
	//画面要素

	@ViewById
	Button helloButton;


	//==========================================================
	//メソッド

	//_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
	//イベント

	/**
	 * 画面の初期化を行います。
	 */
	@AfterViews
	void initView() {
	}

	/**
	 * Helloボタンをクリックした時の処理を行います。
	 */
	@Click
	void helloButtonClicked() {
		Toast.makeText(this, R.string.hello, Toast.LENGTH_LONG).show();
	}
}
