/**
 * cordova is available under *either* the terms of the modified BSD license *or* the
 * MIT License (2008). See http://opensource.org/licenses/alphabetical for full text.
 */

var exec = require("cordova/exec");

/**
 * Constructor.
 *
 * @returns {DeviceConnect}
 */
function DeviceConnect() {

};

DeviceConnect.prototype.startService = function (successCallback, errorCallback) {

    if (errorCallback == null) {
        errorCallback = function () {
        };
    }
    if (typeof errorCallback != "function") {
        console.log("DeviceConnect.startService failure");
        return;
    }
    if (typeof successCallback != "function") {
        console.log("DeviceConnect.startService success");
        return;
    }

    exec(successCallback, errorCallback, 'DeviceConnect', 'startService', []);
};

//-------------------------------------------------------------------
DeviceConnect.prototype.stopService = function (successCallback, errorCallback) {
    if (errorCallback == null) {
        errorCallback = function () {
        };
    }
    if (typeof errorCallback != "function") {
        console.log("DeviceConnect.stopService failure");
        return;
    }
    if (typeof successCallback != "function") {
        console.log("DeviceConnect.stopService success");
        return;
    }

    exec(successCallback, errorCallback, 'DeviceConnect', 'stopService', []);
};

DeviceConnect.prototype.launchDeviceConnect = function (successCallback, errorCallback) {

    if (errorCallback == null) {
        errorCallback = function () {
        };
    }
    if (typeof errorCallback != "function") {
        console.log("DeviceConnect.launch failure");
        return;
    }
    if (typeof successCallback != "function") {
        console.log("DeviceConnect.launch success");
        return;
    }

    exec(successCallback, errorCallback, 'DeviceConnect', 'launchDeviceConnect', []);
};

//-------------------------------------------------------------------
DeviceConnect.prototype.launchSetting = function (successCallback, errorCallback) {
    if (errorCallback == null) {
        errorCallback = function () {
        };
    }
    if (typeof errorCallback != "function") {
        console.log("DeviceConnect.launchSetting failure");
        return;
    }
    if (typeof successCallback != "function") {
        console.log("DeviceConnect.launchSetting success");
        return;
    }

    exec(successCallback, errorCallback, 'DeviceConnect', 'launchSetting', []);
};

//-------------------------------------------------------------------
DeviceConnect.prototype.launchPlugins = function (successCallback, errorCallback) {
    if (errorCallback == null) {
        errorCallback = function () {
        };
    }
    if (typeof errorCallback != "function") {
        console.log("DeviceConnect.launchPlugins failure");
        return;
    }
    if (typeof successCallback != "function") {
        console.log("DeviceConnect.launchPlugins failure");
        return;
    }

    exec(successCallback, errorCallback, 'DeviceConnect', 'launchPlugins', []);
};

module.exports = new DeviceConnect();
