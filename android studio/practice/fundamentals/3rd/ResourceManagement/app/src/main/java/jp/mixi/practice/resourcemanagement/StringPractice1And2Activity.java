package jp.mixi.practice.resourcemanagement;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class StringPractice1And2Activity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.string_practice1);
        TextView countView = (TextView) findViewById(R.id.piyo);
        // TODO: フォーマット用の String リソース（text_counter）を取り出し、setText(CharSequence) の引数に渡す
        countView.setText(getString(R.string.piyo,"piyo"));
    }
}
