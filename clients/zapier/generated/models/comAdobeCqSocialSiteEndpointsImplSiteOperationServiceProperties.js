const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}fieldWhitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}sitePathFilters`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}sitePackageGroup`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'fieldWhitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}fieldWhitelist`)),
            'sitePathFilters': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}sitePathFilters`)),
            'sitePackageGroup': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}sitePackageGroup`)),
        }
    },
}
