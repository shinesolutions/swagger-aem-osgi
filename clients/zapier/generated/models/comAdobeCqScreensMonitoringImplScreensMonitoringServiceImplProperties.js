const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username`)),
            'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password`)),
        }
    },
}
