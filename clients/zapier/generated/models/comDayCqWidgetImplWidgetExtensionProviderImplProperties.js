const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}extendable.widgets`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}widgetextensionprovider.debug`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'extendable.widgets': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}extendable.widgets`)),
            'widgetextensionprovider.debug': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}widgetextensionprovider.debug`)),
        }
    },
}
