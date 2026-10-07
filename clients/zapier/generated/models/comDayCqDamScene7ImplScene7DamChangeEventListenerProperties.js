const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.scene7.damchangeeventlistener.enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.scene7.damchangeeventlistener.observed.paths`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.scene7.damchangeeventlistener.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.scene7.damchangeeventlistener.enabled`)),
            'cq.dam.scene7.damchangeeventlistener.observed.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.scene7.damchangeeventlistener.observed.paths`)),
        }
    },
}
