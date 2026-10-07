const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.commerce.asset.handler.active`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.commerce.asset.handler.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.commerce.asset.handler.active': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.commerce.asset.handler.active`)),
            'cq.commerce.asset.handler.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.commerce.asset.handler.name`)),
        }
    },
}
