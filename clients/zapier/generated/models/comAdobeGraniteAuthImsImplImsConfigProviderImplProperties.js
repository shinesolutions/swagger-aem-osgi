const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.configmanager.ims.configid`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ims.owningEntity`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}aem.instanceId`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}ims.serviceCode`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.configmanager.ims.configid': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.configmanager.ims.configid`)),
            'ims.owningEntity': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ims.owningEntity`)),
            'aem.instanceId': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}aem.instanceId`)),
            'ims.serviceCode': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}ims.serviceCode`)),
        }
    },
}
