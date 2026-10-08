const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}fontmgr.system.font.dir`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}fontmgr.adobe.font.dir`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}fontmgr.customer.font.dir`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'fontmgr.system.font.dir': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fontmgr.system.font.dir`)),
            'fontmgr.adobe.font.dir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}fontmgr.adobe.font.dir`)),
            'fontmgr.customer.font.dir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}fontmgr.customer.font.dir`)),
        }
    },
}
