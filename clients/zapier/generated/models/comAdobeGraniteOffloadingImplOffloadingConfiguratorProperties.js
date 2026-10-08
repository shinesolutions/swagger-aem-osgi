const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}offloading.transporter`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}offloading.cleanup.payload`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'offloading.transporter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}offloading.transporter`)),
            'offloading.cleanup.payload': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}offloading.cleanup.payload`)),
        }
    },
}
