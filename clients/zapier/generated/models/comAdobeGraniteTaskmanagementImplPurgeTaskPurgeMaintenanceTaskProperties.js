const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}purgeCompleted`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}completedAge`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}purgeActive`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}activeAge`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}saveThreshold`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'purgeCompleted': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}purgeCompleted`)),
            'completedAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}completedAge`)),
            'purgeActive': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}purgeActive`)),
            'activeAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}activeAge`)),
            'saveThreshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}saveThreshold`)),
        }
    },
}
