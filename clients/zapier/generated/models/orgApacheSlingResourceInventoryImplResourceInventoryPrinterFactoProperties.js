const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}felix.inventory.printer.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}felix.inventory.printer.title`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'felix.inventory.printer.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}felix.inventory.printer.name`)),
            'felix.inventory.printer.title': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}felix.inventory.printer.title`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
        }
    },
}
