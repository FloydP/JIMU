package com.ljsw.component.json.applike;

import com.ljsw.component.json.serviceimpl.JsonServiceImpl;
import com.mrzhang.component.componentlib.applicationlike.IApplicationLike;
import com.mrzhang.component.componentlib.router.Router;
import com.mrzhang.componentservice.json.JsonService;

/**
 * <p><b>Package:</b> com.ljsw.component.json.applike </p>
 * <p><b>Project:</b> DDComponentForAndroid </p>
 * <p><b>Classname:</b> JsonAppLike </p>
 * <p><b>Description:</b> component mount/dismount delegate </p>
 * Created by leobert on 2017/9/18.
 */

public class JsonAppLike implements IApplicationLike {

    Router router = Router.getInstance();

    @Override
    public void onCreate() {
        router.addService(JsonService.class.getSimpleName(),new JsonServiceImpl());
    }

    @Override
    public void onStop() {
        router.removeService(JsonService.class.getSimpleName());
    }
}
