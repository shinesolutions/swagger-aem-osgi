const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}smtp.host`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}smtp.port`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}smtp.user`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}smtp.password`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}from.address`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}smtp.ssl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}smtp.starttls`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}debug.email`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'smtp.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}smtp.host`)),
            'smtp.port': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}smtp.port`)),
            'smtp.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}smtp.user`)),
            'smtp.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}smtp.password`)),
            'from.address': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}from.address`)),
            'smtp.ssl': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}smtp.ssl`)),
            'smtp.starttls': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}smtp.starttls`)),
            'debug.email': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}debug.email`)),
        }
    },
}
