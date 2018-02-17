package com.sandec.iavariav.root.simplemvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

//    deklarasi dari variable
//    kalau pakei laeteinit ndak usah pake NULL
    lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initPresenter()
        initView()
    }

    private fun initView() {
        btnSubmit.setOnClickListener(View.OnClickListener {
            presenter.logicView(edtInput.text.toString())
        })
    }

    private fun initPresenter() {
        presenter = MainPresenter(this)
    }

    override fun succes() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        Toast.makeText(this, "Succes : " + edtInput.text.toString().trim(), Toast.LENGTH_SHORT).show()

    }

    override fun salah() {
        Toast.makeText(this, "Input Kosong", Toast.LENGTH_SHORT).show()
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
