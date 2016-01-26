/**
 * PhoneGap is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 */

package monaca.plugin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;

public class DeviceConnect extends CordovaPlugin {

    private static final String STOP = "stopService";
    private static final String START = "startService";
    private static final String LAUNCH = "launchDeviceConnect";
    private static final String SETTING = "launchSetting";
    private static final String PLUGINS = "launchPlugins";

    private static final String LOG_TAG = "DeviceConnect";
    private static final String DC_MANAGER = "org.deviceconnect.android.manager";
    private static final String DC_LAUNCH_ACT = "org.deviceconnect.android.manager.DConnectLaunchActivity";
    private static final String DC_SETTING_ACT = "org.deviceconnect.android.manager.setting.SettingActivity";
    private static final String DC_PLUGINS_ACT = "org.deviceconnect.android.manager.setting.DevicePluginListActivity";
    private static final String DC_MANAGER_START = "org.deviceconnect.android.intent.action.observer.MONACA_START";
    private static final String DC_MANAGER_STOP = "org.deviceconnect.android.intent.action.observer.MONACA_STOP";

    /**
     * Constructor.
     */
    public DeviceConnect() {

    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        Context context = cordova.getActivity().getApplicationContext();

        if (action.equals(LAUNCH)) {

            Toast.makeText(context, "Launching DeviceConnect...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(DC_MANAGER, DC_LAUNCH_ACT));
            cordova.getActivity().startActivity(intent);

        } else if (action.equals(START)) {

            Toast.makeText(context, "Starting Service...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DC_MANAGER_START);
            context.sendBroadcast(intent);

        } else if (action.equals(STOP)) {

            Toast.makeText(context, "Stopping Service...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DC_MANAGER_STOP);
            context.sendBroadcast(intent);

        } else if (action.equals(SETTING)) {

            Toast.makeText(context, "Launching Setting...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(DC_MANAGER, DC_SETTING_ACT));
            cordova.getActivity().startActivity(intent);

        } else if (action.equals(PLUGINS)) {

            Toast.makeText(context, "Checking for plugins...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(DC_MANAGER, DC_PLUGINS_ACT));
            cordova.getActivity().startActivity(intent);

        } else {
            return false;
        }
        return true;
    }

}
