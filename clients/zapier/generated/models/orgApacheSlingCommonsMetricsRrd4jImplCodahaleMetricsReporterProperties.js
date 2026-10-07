const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}datasources`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}step`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}archives`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'datasources': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}datasources`)),
            'step': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}step`)),
            'archives': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}archives`)),
            'path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path`)),
        }
    },
}
