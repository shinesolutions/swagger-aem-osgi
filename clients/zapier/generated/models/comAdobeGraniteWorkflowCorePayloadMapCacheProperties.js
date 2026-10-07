const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}getSystemWorkflowModels`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}getPackageRootPath`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'getSystemWorkflowModels': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}getSystemWorkflowModels`)),
            'getPackageRootPath': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}getPackageRootPath`)),
        }
    },
}
