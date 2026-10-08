const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.links`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.clientlibs`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.images`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.attribute.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.clientlibrary.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.contentsync.pathrewritertransformer.clientlibrary.replace`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.contentsync.pathrewritertransformer.mapping.links': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.links`)),
            'cq.contentsync.pathrewritertransformer.mapping.clientlibs': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.clientlibs`)),
            'cq.contentsync.pathrewritertransformer.mapping.images': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.mapping.images`)),
            'cq.contentsync.pathrewritertransformer.attribute.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.attribute.pattern`)),
            'cq.contentsync.pathrewritertransformer.clientlibrary.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.clientlibrary.pattern`)),
            'cq.contentsync.pathrewritertransformer.clientlibrary.replace': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.contentsync.pathrewritertransformer.clientlibrary.replace`)),
        }
    },
}
