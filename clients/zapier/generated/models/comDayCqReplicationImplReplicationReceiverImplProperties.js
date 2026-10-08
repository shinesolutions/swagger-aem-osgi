const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}receiver.tmpfile.threshold`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}receiver.packages.use.install`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'receiver.tmpfile.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}receiver.tmpfile.threshold`)),
            'receiver.packages.use.install': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}receiver.packages.use.install`)),
        }
    },
}
