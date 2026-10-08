const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}proxy.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}proxy.host`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}proxy.user`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}proxy.password`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}proxy.ntlm.host`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}proxy.ntlm.domain`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}proxy.exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'proxy.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}proxy.enabled`)),
            'proxy.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}proxy.host`)),
            'proxy.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}proxy.user`)),
            'proxy.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}proxy.password`)),
            'proxy.ntlm.host': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}proxy.ntlm.host`)),
            'proxy.ntlm.domain': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}proxy.ntlm.domain`)),
            'proxy.exceptions': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}proxy.exceptions`)),
        }
    },
}
