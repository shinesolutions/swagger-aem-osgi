const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}translationFactory`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultConnectorLabel`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultConnectorAttribution`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultConnectorWorkspaceId`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultConnectorSubscriptionKey`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}languageMapLocation`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}categoryMapLocation`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}retryAttempts`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}timeoutCount`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'translationFactory': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}translationFactory`)),
            'defaultConnectorLabel': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultConnectorLabel`)),
            'defaultConnectorAttribution': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultConnectorAttribution`)),
            'defaultConnectorWorkspaceId': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultConnectorWorkspaceId`)),
            'defaultConnectorSubscriptionKey': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultConnectorSubscriptionKey`)),
            'languageMapLocation': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}languageMapLocation`)),
            'categoryMapLocation': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}categoryMapLocation`)),
            'retryAttempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}retryAttempts`)),
            'timeoutCount': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}timeoutCount`)),
        }
    },
}
