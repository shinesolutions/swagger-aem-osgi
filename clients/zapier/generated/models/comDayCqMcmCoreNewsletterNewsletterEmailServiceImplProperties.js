const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}from.address`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sender.host`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}max.bounce.count`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'from.address': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}from.address`)),
            'sender.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sender.host`)),
            'max.bounce.count': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}max.bounce.count`)),
        }
    },
}
