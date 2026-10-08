const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath`)),
            'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency`)),
        }
    },
}
