const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}extensions`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minDurationMs`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxDurationMs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}compactLogFormat`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'extensions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}extensions`)),
            'minDurationMs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minDurationMs`)),
            'maxDurationMs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxDurationMs`)),
            'compactLogFormat': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}compactLogFormat`)),
        }
    },
}
