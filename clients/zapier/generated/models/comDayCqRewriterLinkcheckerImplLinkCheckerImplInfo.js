const utils = require('../utils/utils');
const comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties = require('../models/comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties');

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
            ...comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.fields(`${keyPrefix}properties`, isInput),
            {
                key: `${keyPrefix}bundle_location`,
                label: `[${labelPrefix}bundle_location]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}service_location`,
                label: `[${labelPrefix}service_location]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'pid': bundle.inputData?.[`${keyPrefix}pid`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'properties': utils.removeIfEmpty(comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.mapping(bundle, `${keyPrefix}properties`)),
            'bundle_location': bundle.inputData?.[`${keyPrefix}bundle_location`],
            'service_location': bundle.inputData?.[`${keyPrefix}service_location`],
        }
    },
}
