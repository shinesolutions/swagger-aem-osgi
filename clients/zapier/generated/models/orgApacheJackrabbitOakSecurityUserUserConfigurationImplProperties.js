const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}usersPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}groupsPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}systemRelativePath`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}defaultDepth`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}importBehavior`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}passwordHashAlgorithm`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordHashIterations`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordSaltSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}omitAdminPw`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}supportAutoSave`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordMaxAge`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}initialPasswordChange`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}passwordHistorySize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}passwordExpiryForAdmin`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cacheExpiration`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableRFC7613UsercaseMappedProfile`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'usersPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}usersPath`)),
            'groupsPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}groupsPath`)),
            'systemRelativePath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}systemRelativePath`)),
            'defaultDepth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}defaultDepth`)),
            'importBehavior': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}importBehavior`)),
            'passwordHashAlgorithm': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}passwordHashAlgorithm`)),
            'passwordHashIterations': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordHashIterations`)),
            'passwordSaltSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordSaltSize`)),
            'omitAdminPw': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}omitAdminPw`)),
            'supportAutoSave': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}supportAutoSave`)),
            'passwordMaxAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordMaxAge`)),
            'initialPasswordChange': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}initialPasswordChange`)),
            'passwordHistorySize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}passwordHistorySize`)),
            'passwordExpiryForAdmin': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}passwordExpiryForAdmin`)),
            'cacheExpiration': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cacheExpiration`)),
            'enableRFC7613UsercaseMappedProfile': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableRFC7613UsercaseMappedProfile`)),
        }
    },
}
