const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters`)),
        }
    },
}
