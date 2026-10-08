const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}tracerSets`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}servletEnabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}recordingCacheSizeInMB`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}recordingCacheDurationInSecs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}recordingCompressionEnabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}gzipResponse`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tracerSets': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}tracerSets`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'servletEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}servletEnabled`)),
            'recordingCacheSizeInMB': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}recordingCacheSizeInMB`)),
            'recordingCacheDurationInSecs': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}recordingCacheDurationInSecs`)),
            'recordingCompressionEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}recordingCompressionEnabled`)),
            'gzipResponse': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}gzipResponse`)),
        }
    },
}
