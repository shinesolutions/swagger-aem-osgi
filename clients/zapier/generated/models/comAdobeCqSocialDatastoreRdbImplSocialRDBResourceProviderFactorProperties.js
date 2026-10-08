const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}solr.zk.timeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}solr.commit`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cache.on`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}concurrency.level`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.start.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.ttl`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cache.size`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'solr.zk.timeout': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.zk.timeout`)),
            'solr.commit': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.commit`)),
            'cache.on': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cache.on`)),
            'concurrency.level': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}concurrency.level`)),
            'cache.start.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.start.size`)),
            'cache.ttl': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.ttl`)),
            'cache.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cache.size`)),
        }
    },
}
