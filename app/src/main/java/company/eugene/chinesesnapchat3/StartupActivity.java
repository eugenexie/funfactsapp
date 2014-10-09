    package company.eugene.chinesesnapchat3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


    public class StartupActivity extends Activity {

        public static final String TAG = StartupActivity.class.getSimpleName();
        private FactBook mFactBook = new FactBook();
        private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        // add code after this block to ensure content view is created first


        // Declare our View variables and assign the View from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.showFactTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            factLabel.setText(mFactBook.getFact());

            int color = mColorWheel.getColor();
            relativeLayout.setBackgroundColor(color);
            showFactButton.setTextColor(color);
            }
        };

        showFactButton.setOnClickListener(listener);
       Toast.makeText(this, TAG + "Yay! Our Activity was created", Toast.LENGTH_LONG).show();

        Log.d(TAG, "We're logging from the onCreate() method!");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.startup, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
