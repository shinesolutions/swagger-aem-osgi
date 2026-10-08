const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}pageviewstatistics.trackingurl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pageviewstatistics.trackingscript.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pageviewstatistics.trackingurl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pageviewstatistics.trackingurl`)),
            'pageviewstatistics.trackingscript.enabled': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pageviewstatistics.trackingscript.enabled`)),
        }
    },
}
