const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}disabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}debug`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}localIndexDir`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableOpenIndexAsync`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}threadPoolSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}prefetchIndexFiles`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}extractedTextCacheSizeInMB`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}extractedTextCacheExpiryInSecs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}alwaysUsePreExtractedCache`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}booleanClauseLimit`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableHybridIndexing`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}hybridQueueSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}disableStoredIndexDefinition`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}deletedBlobsCollectionEnabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}propIndexCleanerIntervalInSecs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enableSingleBlobIndexFiles`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'disabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}disabled`)),
            'debug': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}debug`)),
            'localIndexDir': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}localIndexDir`)),
            'enableOpenIndexAsync': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableOpenIndexAsync`)),
            'threadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}threadPoolSize`)),
            'prefetchIndexFiles': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}prefetchIndexFiles`)),
            'extractedTextCacheSizeInMB': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}extractedTextCacheSizeInMB`)),
            'extractedTextCacheExpiryInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}extractedTextCacheExpiryInSecs`)),
            'alwaysUsePreExtractedCache': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}alwaysUsePreExtractedCache`)),
            'booleanClauseLimit': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}booleanClauseLimit`)),
            'enableHybridIndexing': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableHybridIndexing`)),
            'hybridQueueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}hybridQueueSize`)),
            'disableStoredIndexDefinition': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}disableStoredIndexDefinition`)),
            'deletedBlobsCollectionEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}deletedBlobsCollectionEnabled`)),
            'propIndexCleanerIntervalInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}propIndexCleanerIntervalInSecs`)),
            'enableSingleBlobIndexFiles': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enableSingleBlobIndexFiles`)),
        }
    },
}
