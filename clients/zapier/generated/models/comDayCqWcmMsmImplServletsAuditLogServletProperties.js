const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}auditlogservlet.default.events.count`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auditlogservlet.default.path`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auditlogservlet.default.events.count': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}auditlogservlet.default.events.count`)),
            'auditlogservlet.default.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auditlogservlet.default.path`)),
        }
    },
}
