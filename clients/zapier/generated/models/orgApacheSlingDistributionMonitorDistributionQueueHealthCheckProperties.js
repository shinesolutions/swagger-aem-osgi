const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}hc.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}hc.tags`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}hc.mbean.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}numberOfRetriesAllowed`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hc.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.name`)),
            'hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}hc.tags`)),
            'hc.mbean.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}hc.mbean.name`)),
            'numberOfRetriesAllowed': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}numberOfRetriesAllowed`)),
        }
    },
}
