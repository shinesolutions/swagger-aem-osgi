const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}com.day.cq.wcm.scripting.bvp.script.engines`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.day.cq.wcm.scripting.bvp.script.engines': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.day.cq.wcm.scripting.bvp.script.engines`)),
        }
    },
}
