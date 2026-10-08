const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}mailer.email.embed`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}mailer.email.charset`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}mailer.email.retrieverUserID`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}mailer.email.retrieverUserPWD`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'mailer.email.embed': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}mailer.email.embed`)),
            'mailer.email.charset': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}mailer.email.charset`)),
            'mailer.email.retrieverUserID': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}mailer.email.retrieverUserID`)),
            'mailer.email.retrieverUserPWD': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}mailer.email.retrieverUserPWD`)),
        }
    },
}
