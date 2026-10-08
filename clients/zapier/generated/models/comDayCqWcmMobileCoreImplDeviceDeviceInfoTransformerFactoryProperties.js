const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}device.info.transformer.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}device.info.transformer.css.style`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'device.info.transformer.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}device.info.transformer.enabled`)),
            'device.info.transformer.css.style': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}device.info.transformer.css.style`)),
        }
    },
}
