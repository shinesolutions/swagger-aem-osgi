const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}provider.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}host.name`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}host.port`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}host.ssl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}host.tls`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}host.noCertCheck`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}bind.dn`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}bind.password`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}searchTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}adminPool.maxActive`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}adminPool.lookupOnValidate`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}userPool.maxActive`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}userPool.lookupOnValidate`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.baseDN`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}user.objectclass`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.idAttribute`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.extraFilter`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}user.makeDnPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.baseDN`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}group.objectclass`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.nameAttribute`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.extraFilter`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}group.makeDnPath`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.memberAttribute`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}useUidForExtId`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}customattributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'provider.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}provider.name`)),
            'host.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}host.name`)),
            'host.port': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}host.port`)),
            'host.ssl': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}host.ssl`)),
            'host.tls': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}host.tls`)),
            'host.noCertCheck': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}host.noCertCheck`)),
            'bind.dn': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}bind.dn`)),
            'bind.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}bind.password`)),
            'searchTimeout': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}searchTimeout`)),
            'adminPool.maxActive': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}adminPool.maxActive`)),
            'adminPool.lookupOnValidate': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}adminPool.lookupOnValidate`)),
            'userPool.maxActive': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}userPool.maxActive`)),
            'userPool.lookupOnValidate': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}userPool.lookupOnValidate`)),
            'user.baseDN': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.baseDN`)),
            'user.objectclass': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}user.objectclass`)),
            'user.idAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.idAttribute`)),
            'user.extraFilter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.extraFilter`)),
            'user.makeDnPath': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}user.makeDnPath`)),
            'group.baseDN': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.baseDN`)),
            'group.objectclass': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}group.objectclass`)),
            'group.nameAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.nameAttribute`)),
            'group.extraFilter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.extraFilter`)),
            'group.makeDnPath': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}group.makeDnPath`)),
            'group.memberAttribute': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.memberAttribute`)),
            'useUidForExtId': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}useUidForExtId`)),
            'customattributes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}customattributes`)),
        }
    },
}
