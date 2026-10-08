const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}pre-upgrade.maintenance.tasks`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}pre-upgrade.hc.tags`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pre-upgrade.maintenance.tasks': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}pre-upgrade.maintenance.tasks`)),
            'pre-upgrade.hc.tags': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}pre-upgrade.hc.tags`)),
        }
    },
}
