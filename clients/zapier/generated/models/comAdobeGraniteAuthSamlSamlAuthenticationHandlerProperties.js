const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}path`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}idpUrl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}idpCertAlias`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}idpHttpRedirect`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}serviceProviderEntityId`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}assertionConsumerServiceURL`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}spPrivateKeyAlias`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}keyStorePassword`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultRedirectUrl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}userIDAttribute`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}useEncryption`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}createUser`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}userIntermediatePath`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}addGroupMemberships`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}groupMembershipAttribute`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}defaultGroups`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}nameIdFormat`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}synchronizeAttributes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}handleLogout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}logoutUrl`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}clockTolerance`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}digestMethod`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}signatureMethod`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}identitySyncType`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}idpIdentifier`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}path`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'idpUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}idpUrl`)),
            'idpCertAlias': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}idpCertAlias`)),
            'idpHttpRedirect': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}idpHttpRedirect`)),
            'serviceProviderEntityId': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}serviceProviderEntityId`)),
            'assertionConsumerServiceURL': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}assertionConsumerServiceURL`)),
            'spPrivateKeyAlias': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}spPrivateKeyAlias`)),
            'keyStorePassword': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}keyStorePassword`)),
            'defaultRedirectUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultRedirectUrl`)),
            'userIDAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}userIDAttribute`)),
            'useEncryption': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}useEncryption`)),
            'createUser': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}createUser`)),
            'userIntermediatePath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}userIntermediatePath`)),
            'addGroupMemberships': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}addGroupMemberships`)),
            'groupMembershipAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}groupMembershipAttribute`)),
            'defaultGroups': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}defaultGroups`)),
            'nameIdFormat': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}nameIdFormat`)),
            'synchronizeAttributes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}synchronizeAttributes`)),
            'handleLogout': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}handleLogout`)),
            'logoutUrl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}logoutUrl`)),
            'clockTolerance': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}clockTolerance`)),
            'digestMethod': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}digestMethod`)),
            'signatureMethod': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}signatureMethod`)),
            'identitySyncType': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}identitySyncType`)),
            'idpIdentifier': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}idpIdentifier`)),
        }
    },
}
