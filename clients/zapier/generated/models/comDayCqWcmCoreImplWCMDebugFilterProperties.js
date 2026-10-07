const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}wcmdbgfilter.enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}wcmdbgfilter.jspDebug`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'wcmdbgfilter.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}wcmdbgfilter.enabled`)),
            'wcmdbgfilter.jspDebug': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}wcmdbgfilter.jspDebug`)),
        }
    },
}
