const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}auditlog.rule.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}auditlog.rule.contentpath`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}auditlog.rule.minimumage`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}auditlog.rule.types`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auditlog.rule.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auditlog.rule.name`)),
            'auditlog.rule.contentpath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}auditlog.rule.contentpath`)),
            'auditlog.rule.minimumage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}auditlog.rule.minimumage`)),
            'auditlog.rule.types': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}auditlog.rule.types`)),
        }
    },
}
