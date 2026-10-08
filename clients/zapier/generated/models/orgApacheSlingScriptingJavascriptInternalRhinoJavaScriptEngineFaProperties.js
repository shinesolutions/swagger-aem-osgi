const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}org.apache.sling.scripting.javascript.rhino.optLevel`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.scripting.javascript.rhino.optLevel': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}org.apache.sling.scripting.javascript.rhino.optLevel`)),
        }
    },
}
