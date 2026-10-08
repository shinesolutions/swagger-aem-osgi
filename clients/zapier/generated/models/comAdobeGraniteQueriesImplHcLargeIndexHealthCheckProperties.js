const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}large.index.critical.threshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}large.index.warn.threshold`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'large.index.critical.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}large.index.critical.threshold`)),
            'large.index.warn.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}large.index.warn.threshold`)),
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
        }
    },
}
