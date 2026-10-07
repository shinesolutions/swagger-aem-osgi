const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.analytics.impl.url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.analytics.impl.apikey`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.cq.screens.analytics.impl.project`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}com.adobe.cq.screens.analytics.impl.environment`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.cq.screens.analytics.impl.sendFrequency`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.cq.screens.analytics.impl.url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.analytics.impl.url`)),
            'com.adobe.cq.screens.analytics.impl.apikey': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.analytics.impl.apikey`)),
            'com.adobe.cq.screens.analytics.impl.project': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.analytics.impl.project`)),
            'com.adobe.cq.screens.analytics.impl.environment': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.analytics.impl.environment`)),
            'com.adobe.cq.screens.analytics.impl.sendFrequency': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.cq.screens.analytics.impl.sendFrequency`)),
        }
    },
}
