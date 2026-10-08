const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}pattern.time`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.newline`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.dayOfMonth`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.month`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.year`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.date`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.dateTime`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pattern.email`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pattern.time': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.time`)),
            'pattern.newline': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.newline`)),
            'pattern.dayOfMonth': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.dayOfMonth`)),
            'pattern.month': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.month`)),
            'pattern.year': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.year`)),
            'pattern.date': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.date`)),
            'pattern.dateTime': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.dateTime`)),
            'pattern.email': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pattern.email`)),
        }
    },
}
