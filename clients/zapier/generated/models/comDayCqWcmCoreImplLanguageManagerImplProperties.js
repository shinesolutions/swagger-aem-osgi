const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}langmgr.list.path`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}langmgr.country.default`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'langmgr.list.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}langmgr.list.path`)),
            'langmgr.country.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}langmgr.country.default`)),
        }
    },
}
