const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}handler.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.expirationTime`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}user.autoMembership`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}user.propertyMapping`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.pathPrefix`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}user.membershipExpTime`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}user.membershipNestingDepth`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}user.dynamicMembership`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}user.disableMissing`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.expirationTime`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}group.autoMembership`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}group.propertyMapping`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group.pathPrefix`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableRFC7613UsercaseMappedProfile`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'handler.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}handler.name`)),
            'user.expirationTime': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.expirationTime`)),
            'user.autoMembership': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}user.autoMembership`)),
            'user.propertyMapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}user.propertyMapping`)),
            'user.pathPrefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.pathPrefix`)),
            'user.membershipExpTime': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}user.membershipExpTime`)),
            'user.membershipNestingDepth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}user.membershipNestingDepth`)),
            'user.dynamicMembership': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}user.dynamicMembership`)),
            'user.disableMissing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}user.disableMissing`)),
            'group.expirationTime': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.expirationTime`)),
            'group.autoMembership': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}group.autoMembership`)),
            'group.propertyMapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}group.propertyMapping`)),
            'group.pathPrefix': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group.pathPrefix`)),
            'enableRFC7613UsercaseMappedProfile': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableRFC7613UsercaseMappedProfile`)),
        }
    },
}
