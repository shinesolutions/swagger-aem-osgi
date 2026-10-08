const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}createPreviewEnabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}updatePreviewEnabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queueSize`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}folderPreviewRenditionRegex`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'createPreviewEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}createPreviewEnabled`)),
            'updatePreviewEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}updatePreviewEnabled`)),
            'queueSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queueSize`)),
            'folderPreviewRenditionRegex': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}folderPreviewRenditionRegex`)),
        }
    },
}
