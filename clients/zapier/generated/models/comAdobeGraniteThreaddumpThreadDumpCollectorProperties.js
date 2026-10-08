const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduler.period`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}scheduler.runOn`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.threaddump.enabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}granite.threaddump.dumpsPerFile`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.threaddump.enableGzipCompression`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.threaddump.enableDirectoriesCompression`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.threaddump.enableJStack`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}granite.threaddump.maxBackupDays`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}granite.threaddump.backupCleanTrigger`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduler.period`)),
            'scheduler.runOn': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}scheduler.runOn`)),
            'granite.threaddump.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.threaddump.enabled`)),
            'granite.threaddump.dumpsPerFile': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}granite.threaddump.dumpsPerFile`)),
            'granite.threaddump.enableGzipCompression': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.threaddump.enableGzipCompression`)),
            'granite.threaddump.enableDirectoriesCompression': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.threaddump.enableDirectoriesCompression`)),
            'granite.threaddump.enableJStack': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.threaddump.enableJStack`)),
            'granite.threaddump.maxBackupDays': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}granite.threaddump.maxBackupDays`)),
            'granite.threaddump.backupCleanTrigger': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}granite.threaddump.backupCleanTrigger`)),
        }
    },
}
