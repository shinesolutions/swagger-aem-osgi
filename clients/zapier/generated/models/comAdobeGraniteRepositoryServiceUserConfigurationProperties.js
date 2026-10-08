const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}serviceusers.simpleSubjectPopulation`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}serviceusers.list`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
            'serviceusers.simpleSubjectPopulation': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}serviceusers.simpleSubjectPopulation`)),
            'serviceusers.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}serviceusers.list`)),
        }
    },
}
