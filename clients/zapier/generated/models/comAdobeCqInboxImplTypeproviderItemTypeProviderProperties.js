const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}inbox.impl.typeprovider.registrypaths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}inbox.impl.typeprovider.legacypaths`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}inbox.impl.typeprovider.defaulturl.failureitem`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}inbox.impl.typeprovider.defaulturl.workitem`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}inbox.impl.typeprovider.defaulturl.task`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'inbox.impl.typeprovider.registrypaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}inbox.impl.typeprovider.registrypaths`)),
            'inbox.impl.typeprovider.legacypaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}inbox.impl.typeprovider.legacypaths`)),
            'inbox.impl.typeprovider.defaulturl.failureitem': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}inbox.impl.typeprovider.defaulturl.failureitem`)),
            'inbox.impl.typeprovider.defaulturl.workitem': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}inbox.impl.typeprovider.defaulturl.workitem`)),
            'inbox.impl.typeprovider.defaulturl.task': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}inbox.impl.typeprovider.defaulturl.task`)),
        }
    },
}
