package com.sandec.iavariav.root.simplemvpkotlin

/**
 * Created by root on 2/17/18.
 */
class MainPresenter {
    var mainView : MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }

    fun logicView(input : String) {
//        kondisional check dia kosong apa gak
        if (input.isEmpty()){
            mainView?.salah()
        }
        else{
            mainView?.succes()
        }
    }
}