const utils = require('../utils/utils');
const AnyType = require('../models/AnyType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ....fields(`${keyPrefix}labels`, isInput),
            ....fields(`${keyPrefix}values`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'labels': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}labels`)),
            'values': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}values`)),
        }
    },
}
