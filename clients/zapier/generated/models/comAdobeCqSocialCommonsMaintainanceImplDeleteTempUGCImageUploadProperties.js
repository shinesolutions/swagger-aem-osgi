const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}numberOfDays`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ageOfFile`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'numberOfDays': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}numberOfDays`)),
            'ageOfFile': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ageOfFile`)),
        }
    },
}
