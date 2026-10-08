const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}aliases`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}index`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}index.files`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.html`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.json`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.txt`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.xml`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}json.maximumresults`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ecmaSuport`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'aliases': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}aliases`)),
            'index': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}index`)),
            'index.files': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}index.files`)),
            'enable.html': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.html`)),
            'enable.json': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.json`)),
            'enable.txt': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.txt`)),
            'enable.xml': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.xml`)),
            'json.maximumresults': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}json.maximumresults`)),
            'ecmaSuport': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ecmaSuport`)),
        }
    },
}
