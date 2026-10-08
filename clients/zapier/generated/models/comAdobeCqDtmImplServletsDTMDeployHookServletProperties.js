const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}dtm.staging.ip.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}dtm.production.ip.whitelist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dtm.staging.ip.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dtm.staging.ip.whitelist`)),
            'dtm.production.ip.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}dtm.production.ip.whitelist`)),
        }
    },
}
