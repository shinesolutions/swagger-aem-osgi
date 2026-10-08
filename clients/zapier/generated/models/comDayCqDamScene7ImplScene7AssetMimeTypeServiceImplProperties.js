const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.dam.scene7.assetmimetypeservice.mapping`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.scene7.assetmimetypeservice.mapping': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.dam.scene7.assetmimetypeservice.mapping`)),
        }
    },
}
