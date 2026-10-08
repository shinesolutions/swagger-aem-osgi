const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}ssl-forward.header`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ssl-forward.value`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ssl-forward-cert.header`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}rewrite.absolute.urls`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ssl-forward.header': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ssl-forward.header`)),
            'ssl-forward.value': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ssl-forward.value`)),
            'ssl-forward-cert.header': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ssl-forward-cert.header`)),
            'rewrite.absolute.urls': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}rewrite.absolute.urls`)),
        }
    },
}
