const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}from.address`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}host.prefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.onabort`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.oncomplete`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.oncontainercomplete`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}notify.useronly`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'from.address': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}from.address`)),
            'host.prefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}host.prefix`)),
            'notify.onabort': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.onabort`)),
            'notify.oncomplete': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.oncomplete`)),
            'notify.oncontainercomplete': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.oncontainercomplete`)),
            'notify.useronly': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}notify.useronly`)),
        }
    },
}
