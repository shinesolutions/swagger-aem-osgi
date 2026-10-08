const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}streamPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}streamName`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'streamPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}streamPath`)),
            'streamName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}streamName`)),
        }
    },
}
