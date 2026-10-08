const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduledpurge.name`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}scheduledpurge.workflowStatus`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}scheduledpurge.modelIds`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduledpurge.daysold`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduledpurge.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduledpurge.name`)),
            'scheduledpurge.workflowStatus': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}scheduledpurge.workflowStatus`)),
            'scheduledpurge.modelIds': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}scheduledpurge.modelIds`)),
            'scheduledpurge.daysold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduledpurge.daysold`)),
        }
    },
}
