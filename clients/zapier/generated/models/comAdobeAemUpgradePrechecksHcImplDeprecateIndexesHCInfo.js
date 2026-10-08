const utils = require('../utils/utils');
const comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties = require('../models/comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}pid`,
                label: `[${labelPrefix}pid]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.fields(`${keyPrefix}properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pid': bundle.inputData?.[`${keyPrefix}pid`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'properties': utils.removeIfEmpty(comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.mapping(bundle, `${keyPrefix}properties`)),
        }
    },
}
