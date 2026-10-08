const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}felix.memoryusage.dump.threshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}felix.memoryusage.dump.interval`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}felix.memoryusage.dump.location`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'felix.memoryusage.dump.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}felix.memoryusage.dump.threshold`)),
            'felix.memoryusage.dump.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}felix.memoryusage.dump.interval`)),
            'felix.memoryusage.dump.location': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}felix.memoryusage.dump.location`)),
        }
    },
}
