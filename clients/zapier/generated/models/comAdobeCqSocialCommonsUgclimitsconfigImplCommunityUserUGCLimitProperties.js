const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}UGCLimit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ugcLimitDuration`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}domains`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}toList`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable`)),
            'UGCLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}UGCLimit`)),
            'ugcLimitDuration': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ugcLimitDuration`)),
            'domains': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}domains`)),
            'toList': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}toList`)),
        }
    },
}
