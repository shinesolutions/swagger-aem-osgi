const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}oauth.provider.id`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}oauth.cloud.config.root`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}provider.config.root`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}provider.config.user.folder`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}provider.config.twitter.enable.params`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}provider.config.twitter.params`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}provider.config.refresh.userdata.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'oauth.provider.id': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.provider.id`)),
            'oauth.cloud.config.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}oauth.cloud.config.root`)),
            'provider.config.root': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}provider.config.root`)),
            'provider.config.user.folder': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}provider.config.user.folder`)),
            'provider.config.twitter.enable.params': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}provider.config.twitter.enable.params`)),
            'provider.config.twitter.params': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}provider.config.twitter.params`)),
            'provider.config.refresh.userdata.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}provider.config.refresh.userdata.enabled`)),
        }
    },
}
