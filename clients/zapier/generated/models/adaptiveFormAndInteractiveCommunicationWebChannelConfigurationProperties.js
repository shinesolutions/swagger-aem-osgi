const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}showPlaceholder`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maximumCacheEntries`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}af.scripting.compatversion`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}makeFileNameUnique`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}generatingCompliantData`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'showPlaceholder': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}showPlaceholder`)),
            'maximumCacheEntries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maximumCacheEntries`)),
            'af.scripting.compatversion': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}af.scripting.compatversion`)),
            'makeFileNameUnique': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}makeFileNameUnique`)),
            'generatingCompliantData': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}generatingCompliantData`)),
        }
    },
}
