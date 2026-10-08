const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyFloat = require('../models/configNodePropertyFloat');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}queue.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}queue.topics`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}queue.type`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}queue.priority`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.retries`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.retrydelay`, isInput),
            ...configNodePropertyFloat.fields(`${keyPrefix}queue.maxparallel`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}queue.keepJobs`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}queue.preferRunOnCreationInstance`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}queue.threadPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}service.ranking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'queue.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}queue.name`)),
            'queue.topics': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}queue.topics`)),
            'queue.type': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}queue.type`)),
            'queue.priority': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}queue.priority`)),
            'queue.retries': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.retries`)),
            'queue.retrydelay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.retrydelay`)),
            'queue.maxparallel': utils.removeIfEmpty(configNodePropertyFloat.mapping(bundle, `${keyPrefix}queue.maxparallel`)),
            'queue.keepJobs': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}queue.keepJobs`)),
            'queue.preferRunOnCreationInstance': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}queue.preferRunOnCreationInstance`)),
            'queue.threadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}queue.threadPoolSize`)),
            'service.ranking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.ranking`)),
        }
    },
}
