const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}dim.default.mode`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}dim.appcache.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'dim.default.mode': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}dim.default.mode`)),
            'dim.appcache.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}dim.appcache.enabled`)),
        }
    },
}
