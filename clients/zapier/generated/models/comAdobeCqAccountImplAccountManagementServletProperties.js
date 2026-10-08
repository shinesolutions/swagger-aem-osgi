const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cq.accountmanager.config.informnewaccount.mail`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.accountmanager.config.informnewpwd.mail`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.accountmanager.config.informnewaccount.mail': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.accountmanager.config.informnewaccount.mail`)),
            'cq.accountmanager.config.informnewpwd.mail': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.accountmanager.config.informnewpwd.mail`)),
        }
    },
}
