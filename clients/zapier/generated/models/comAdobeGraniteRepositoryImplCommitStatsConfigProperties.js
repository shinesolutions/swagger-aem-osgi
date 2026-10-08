const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enabled`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}intervalSeconds`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}commitsPerIntervalThreshold`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxLocationLength`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxDetailsShown`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minDetailsPercentage`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}threadMatchers`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxGreedyDepth`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}greedyStackMatchers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}stackFilters`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}stackMatchers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}stackCategorizers`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}stackShorteners`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enabled`)),
            'intervalSeconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}intervalSeconds`)),
            'commitsPerIntervalThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}commitsPerIntervalThreshold`)),
            'maxLocationLength': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxLocationLength`)),
            'maxDetailsShown': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxDetailsShown`)),
            'minDetailsPercentage': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minDetailsPercentage`)),
            'threadMatchers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}threadMatchers`)),
            'maxGreedyDepth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxGreedyDepth`)),
            'greedyStackMatchers': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}greedyStackMatchers`)),
            'stackFilters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}stackFilters`)),
            'stackMatchers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}stackMatchers`)),
            'stackCategorizers': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}stackCategorizers`)),
            'stackShorteners': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}stackShorteners`)),
        }
    },
}
