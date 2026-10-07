const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}versionpurge.paths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}versionpurge.recursive`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionpurge.maxVersions`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionpurge.minVersions`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionpurge.maxAgeDays`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'versionpurge.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}versionpurge.paths`)),
            'versionpurge.recursive': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}versionpurge.recursive`)),
            'versionpurge.maxVersions': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionpurge.maxVersions`)),
            'versionpurge.minVersions': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionpurge.minVersions`)),
            'versionpurge.maxAgeDays': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionpurge.maxAgeDays`)),
        }
    },
}
