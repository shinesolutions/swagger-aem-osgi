const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}nodetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ignorableprops`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ignorablenodes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}distfolders`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'nodetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}nodetypes`)),
            'ignorableprops': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ignorableprops`)),
            'ignorablenodes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ignorablenodes`)),
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'distfolders': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}distfolders`)),
        }
    },
}
