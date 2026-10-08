const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduler.expression`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxSavedReports`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}timeDuration`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableReportPurge`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.expression': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduler.expression`)),
            'maxSavedReports': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxSavedReports`)),
            'timeDuration': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}timeDuration`)),
            'enableReportPurge': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableReportPurge`)),
        }
    },
}
