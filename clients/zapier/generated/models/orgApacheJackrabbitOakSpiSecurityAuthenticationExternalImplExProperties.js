const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}jaas.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.controlFlag`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jaas.realmName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}idp.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sync.handlerName`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jaas.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}jaas.ranking`)),
            'jaas.controlFlag': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.controlFlag`)),
            'jaas.realmName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jaas.realmName`)),
            'idp.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}idp.name`)),
            'sync.handlerName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sync.handlerName`)),
        }
    },
}
