const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}optout.cookies`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}optout.headers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}optout.whitelist.cookies`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'optout.cookies': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}optout.cookies`)),
            'optout.headers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}optout.headers`)),
            'optout.whitelist.cookies': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}optout.whitelist.cookies`)),
        }
    },
}
