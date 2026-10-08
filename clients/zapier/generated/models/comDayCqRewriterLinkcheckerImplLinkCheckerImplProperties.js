const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduler.period`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduler.concurrent`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.bad_link_tolerance_interval`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}service.check_override_patterns`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}service.cache_broken_internal_links`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}service.special_link_prefix`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}service.special_link_patterns`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduler.period`)),
            'scheduler.concurrent': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduler.concurrent`)),
            'service.bad_link_tolerance_interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.bad_link_tolerance_interval`)),
            'service.check_override_patterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}service.check_override_patterns`)),
            'service.cache_broken_internal_links': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}service.cache_broken_internal_links`)),
            'service.special_link_prefix': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}service.special_link_prefix`)),
            'service.special_link_patterns': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}service.special_link_patterns`)),
        }
    },
}
