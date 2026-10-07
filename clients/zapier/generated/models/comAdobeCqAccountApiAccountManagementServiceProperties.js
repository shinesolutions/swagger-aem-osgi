const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.accountmanager.token.validity.period`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.accountmanager.config.requestnewaccount.mail`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.accountmanager.config.requestnewpwd.mail`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.accountmanager.token.validity.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.accountmanager.token.validity.period`)),
            'cq.accountmanager.config.requestnewaccount.mail': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.accountmanager.config.requestnewaccount.mail`)),
            'cq.accountmanager.config.requestnewpwd.mail': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.accountmanager.config.requestnewpwd.mail`)),
        }
    },
}
