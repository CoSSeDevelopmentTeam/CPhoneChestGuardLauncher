package net.comorevi.cpapp.chestguard;

import net.comorevi.cphone.cphone.application.ApplicationManifest;
import net.comorevi.cphone.cphone.model.Bundle;
import net.comorevi.cphone.cphone.model.Response;
import net.comorevi.cphone.cphone.widget.activity.ReturnType;
import net.comorevi.cphone.cphone.widget.activity.base.ModalActivity;

public class MainActivity extends ModalActivity {
    public MainActivity(ApplicationManifest manifest) {
        super(manifest);
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.setTitle(bundle.getString("title"));
        this.setContent(bundle.getString("content"));
        this.setButton1Text(bundle.getString("button1"));
        this.setButton2Text(bundle.getString("button2"));
    }

    @Override
    public ReturnType onStop(Response response) {
        return ReturnType.TYPE_END;
    }
}
