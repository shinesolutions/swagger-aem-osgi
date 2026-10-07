const utils = require('../utils/utils');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}queue.priority`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.retries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.retrydelay`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.maxparallel`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'queue.priority': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}queue.priority`)),
            'queue.retries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.retries`)),
            'queue.retrydelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.retrydelay`)),
            'queue.maxparallel': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.maxparallel`)),
        }
    },
}
