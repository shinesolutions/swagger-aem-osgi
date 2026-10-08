const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.batch.collection.properties`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.batch.collection.maxcollections`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.batch.collection.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.batch.collection.properties`)),
            'cq.dam.batch.collection.maxcollections': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.batch.collection.maxcollections`)),
        }
    },
}
