const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.infocollector.includeThreadDumps`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}granite.infocollector.includeHeapDump`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'granite.infocollector.includeThreadDumps': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.infocollector.includeThreadDumps`)),
            'granite.infocollector.includeHeapDump': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}granite.infocollector.includeHeapDump`)),
        }
    },
}
