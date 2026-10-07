const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyFloat = require('../models/configNodePropertyFloat');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}jmx.objectname`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}property.measure.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}property.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}property.max.wait.ms`, isInput),
            ...configNodePropertyFloat.fields(`${keyPrefix}property.max.rate`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}fulltext.measure.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}fulltext.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}fulltext.max.wait.ms`, isInput),
            ...configNodePropertyFloat.fields(`${keyPrefix}fulltext.max.rate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jmx.objectname': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jmx.objectname`)),
            'property.measure.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}property.measure.enabled`)),
            'property.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}property.name`)),
            'property.max.wait.ms': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}property.max.wait.ms`)),
            'property.max.rate': utils.removeIfEmpty(configNodePropertyFloat.mapping(bundle, `${keyPrefix}property.max.rate`)),
            'fulltext.measure.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}fulltext.measure.enabled`)),
            'fulltext.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}fulltext.name`)),
            'fulltext.max.wait.ms': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}fulltext.max.wait.ms`)),
            'fulltext.max.rate': utils.removeIfEmpty(configNodePropertyFloat.mapping(bundle, `${keyPrefix}fulltext.max.rate`)),
        }
    },
}
