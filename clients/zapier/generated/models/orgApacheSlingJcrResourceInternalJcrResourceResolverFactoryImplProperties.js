const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.searchpath`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.manglenamespaces`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.allowDirect`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.required.providers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.required.providernames`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.virtual`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.mapping`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}resource.resolver.map.location`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.map.observation`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}resource.resolver.default.vanity.redirect.status`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.enable.vanitypath`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}resource.resolver.vanitypath.maxEntries`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.vanitypath.maxEntries.startup`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}resource.resolver.vanitypath.bloomfilter.maxBytes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.optimize.alias.resolution`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.vanitypath.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}resource.resolver.vanitypath.blacklist`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.vanity.precedence`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.providerhandling.paranoid`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.log.closing`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}resource.resolver.log.unclosed`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'resource.resolver.searchpath': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.searchpath`)),
            'resource.resolver.manglenamespaces': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.manglenamespaces`)),
            'resource.resolver.allowDirect': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.allowDirect`)),
            'resource.resolver.required.providers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.required.providers`)),
            'resource.resolver.required.providernames': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.required.providernames`)),
            'resource.resolver.virtual': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.virtual`)),
            'resource.resolver.mapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.mapping`)),
            'resource.resolver.map.location': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}resource.resolver.map.location`)),
            'resource.resolver.map.observation': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.map.observation`)),
            'resource.resolver.default.vanity.redirect.status': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}resource.resolver.default.vanity.redirect.status`)),
            'resource.resolver.enable.vanitypath': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.enable.vanitypath`)),
            'resource.resolver.vanitypath.maxEntries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}resource.resolver.vanitypath.maxEntries`)),
            'resource.resolver.vanitypath.maxEntries.startup': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.vanitypath.maxEntries.startup`)),
            'resource.resolver.vanitypath.bloomfilter.maxBytes': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}resource.resolver.vanitypath.bloomfilter.maxBytes`)),
            'resource.resolver.optimize.alias.resolution': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.optimize.alias.resolution`)),
            'resource.resolver.vanitypath.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.vanitypath.whitelist`)),
            'resource.resolver.vanitypath.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}resource.resolver.vanitypath.blacklist`)),
            'resource.resolver.vanity.precedence': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.vanity.precedence`)),
            'resource.resolver.providerhandling.paranoid': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.providerhandling.paranoid`)),
            'resource.resolver.log.closing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.log.closing`)),
            'resource.resolver.log.unclosed': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}resource.resolver.log.unclosed`)),
        }
    },
}
