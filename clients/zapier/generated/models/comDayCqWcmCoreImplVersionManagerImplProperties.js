const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}versionmanager.createVersionOnActivation`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}versionmanager.purgingEnabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}versionmanager.purgePaths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}versionmanager.ivPaths`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionmanager.maxAgeDays`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionmanager.maxNumberVersions`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}versionmanager.minNumberVersions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'versionmanager.createVersionOnActivation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}versionmanager.createVersionOnActivation`)),
            'versionmanager.purgingEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}versionmanager.purgingEnabled`)),
            'versionmanager.purgePaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}versionmanager.purgePaths`)),
            'versionmanager.ivPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}versionmanager.ivPaths`)),
            'versionmanager.maxAgeDays': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionmanager.maxAgeDays`)),
            'versionmanager.maxNumberVersions': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionmanager.maxNumberVersions`)),
            'versionmanager.minNumberVersions': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}versionmanager.minNumberVersions`)),
        }
    },
}
