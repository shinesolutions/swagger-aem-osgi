const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}scheduledpurge.name`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduledpurge.purgeActive`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}scheduledpurge.templates`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduledpurge.purgeGroups`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduledpurge.purgeAssets`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduledpurge.terminateRunningWorkflows`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduledpurge.daysold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduledpurge.saveThreshold`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduledpurge.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}scheduledpurge.name`)),
            'scheduledpurge.purgeActive': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduledpurge.purgeActive`)),
            'scheduledpurge.templates': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}scheduledpurge.templates`)),
            'scheduledpurge.purgeGroups': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduledpurge.purgeGroups`)),
            'scheduledpurge.purgeAssets': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduledpurge.purgeAssets`)),
            'scheduledpurge.terminateRunningWorkflows': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduledpurge.terminateRunningWorkflows`)),
            'scheduledpurge.daysold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduledpurge.daysold`)),
            'scheduledpurge.saveThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduledpurge.saveThreshold`)),
        }
    },
}
