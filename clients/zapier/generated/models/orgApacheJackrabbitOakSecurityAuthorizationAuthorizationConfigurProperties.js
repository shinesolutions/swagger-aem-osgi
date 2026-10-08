const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}permissionsJr2`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}importBehavior`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}readPaths`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}administrativePrincipals`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}configurationRanking`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'permissionsJr2': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}permissionsJr2`)),
            'importBehavior': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}importBehavior`)),
            'readPaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}readPaths`)),
            'administrativePrincipals': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}administrativePrincipals`)),
            'configurationRanking': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}configurationRanking`)),
        }
    },
}
