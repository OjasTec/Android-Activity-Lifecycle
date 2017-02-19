package com.example.activity_lifecycle_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/*In this Tutorial we understand the flow of Activity.
 * Demonstration of Activity Lifecycle. */

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    // There are 7 Lifecycle methods of Activity.
    // first Method is onCreate() that automatically overided when we create a project

    /**1. This method call at the first time
     *
     * in this method we load a layout. because it calls very firstly.
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this method setContentView() is responsible to load a layout you can see here
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() called");
    }

    /* 2. This method called after onCreate*/
    @Override
    protected void onStart() {
        super.onStart();

        // this is log it will print the given message with its TAG.
        Log.d(TAG, "onStart() called");
    }

    /*3.  This method called after onStart().
    *     And this method calls every time when this Activity is paused.
    *     if for any reason the activity paused then it will called when it appears again.
    * */
    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume() called");
    }


    /*4. This method called if any external action performed like,
    * when a phone calls coming then our current activity will be paused and this method called automatically.
    *
    * and when phone call ended then onResume() calls.
    *
    * this method will call one more time when we call another Activity then this Activity
    * will paused.
    * */
    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause() called");
    }


    /*5. This method will called at the end when this Activity is going to Destroy.
    *
    * then before destroy this method will call.
    *
    * And this method also called when this Activity is pause for long time, then Android stop it automatically.
    * */
    @Override
    protected void onStop() {
        super.onStop();
    }

    /*6. This method called when this Activity is stoped and we are again opening this Activity from our
    * recent Applications.*/
    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "onRestart() called");
    }


    /*7. This method called when this Activity is finally finished
    *
    * if we are calling finish() then thi method will call and the Activity will be finished.
    * */
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy() called");
    }

    // Now we will run this Application to know when this Methods call.
}
