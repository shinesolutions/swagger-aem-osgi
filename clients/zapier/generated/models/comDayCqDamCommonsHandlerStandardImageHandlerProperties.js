const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}large_file_threshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}large_comment_threshold`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.enable.ext.meta.extraction`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'large_file_threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}large_file_threshold`)),
            'large_comment_threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}large_comment_threshold`)),
            'cq.dam.enable.ext.meta.extraction': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.enable.ext.meta.extraction`)),
        }
    },
}
