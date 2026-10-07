const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.batch.metadata.asset.default`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.batch.metadata.collection.default`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.batch.metadata.maxresources`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.batch.metadata.asset.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.batch.metadata.asset.default`)),
            'cq.dam.batch.metadata.collection.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.batch.metadata.collection.default`)),
            'cq.dam.batch.metadata.maxresources': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.batch.metadata.maxresources`)),
        }
    },
}
