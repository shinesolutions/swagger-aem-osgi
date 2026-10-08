const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableScheduledPostsSearch`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}numberOfMinutes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxSearchLimit`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enableScheduledPostsSearch': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableScheduledPostsSearch`)),
            'numberOfMinutes': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}numberOfMinutes`)),
            'maxSearchLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxSearchLimit`)),
        }
    },
}
