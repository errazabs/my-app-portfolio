package errazabs.android.nanodegree.com.project0;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.main_activity_title);
    }

    public void onButtonCLicked(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.btnSpotifyStreamer:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_spotify_streamer), Toast.LENGTH_LONG).show();
                return;
            case R.id.btnScoresApp:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_scores_app), Toast.LENGTH_LONG).show();
                return;
            case R.id.btnLibraryApp:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_library_app), Toast.LENGTH_LONG).show();
                return;
            case R.id.btnBuildItBigger:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_build_it_bigger), Toast.LENGTH_LONG).show();
                return;
            case R.id.btnXYZReader:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_xyz_reader), Toast.LENGTH_LONG).show();
                return;
            case R.id.btnCapstone:
                Toast.makeText(MainActivity.this, getString(R.string.toast_message_capstone), Toast.LENGTH_LONG).show();
                return;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
