const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cq.analytics.testandtarget.api.url`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.analytics.testandtarget.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.analytics.testandtarget.sockettimeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.analytics.testandtarget.recommendations.url.replace`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.analytics.testandtarget.recommendations.url.replacewith`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.analytics.testandtarget.api.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.analytics.testandtarget.api.url`)),
            'cq.analytics.testandtarget.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.analytics.testandtarget.timeout`)),
            'cq.analytics.testandtarget.sockettimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.analytics.testandtarget.sockettimeout`)),
            'cq.analytics.testandtarget.recommendations.url.replace': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.analytics.testandtarget.recommendations.url.replace`)),
            'cq.analytics.testandtarget.recommendations.url.replacewith': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.analytics.testandtarget.recommendations.url.replacewith`)),
        }
    },
}
