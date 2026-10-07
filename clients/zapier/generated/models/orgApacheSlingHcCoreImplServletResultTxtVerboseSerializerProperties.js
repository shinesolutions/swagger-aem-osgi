const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}totalWidth`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}colWidthName`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}colWidthResult`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}colWidthTiming`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'totalWidth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}totalWidth`)),
            'colWidthName': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}colWidthName`)),
            'colWidthResult': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}colWidthResult`)),
            'colWidthTiming': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}colWidthTiming`)),
        }
    },
}
