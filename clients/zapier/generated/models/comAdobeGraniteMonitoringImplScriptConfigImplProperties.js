const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}script.filename`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}script.display`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}script.path`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}script.platform`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}interval`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jmxdomain`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'script.filename': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}script.filename`)),
            'script.display': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}script.display`)),
            'script.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}script.path`)),
            'script.platform': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}script.platform`)),
            'interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}interval`)),
            'jmxdomain': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jmxdomain`)),
        }
    },
}
