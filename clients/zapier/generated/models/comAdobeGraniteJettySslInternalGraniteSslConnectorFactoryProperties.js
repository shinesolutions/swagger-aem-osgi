const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.port`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.keystore.user`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.keystore.password`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.ciphersuites.excluded`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.ciphersuites.included`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}com.adobe.granite.jetty.ssl.client.certificate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'com.adobe.granite.jetty.ssl.port': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.port`)),
            'com.adobe.granite.jetty.ssl.keystore.user': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.keystore.user`)),
            'com.adobe.granite.jetty.ssl.keystore.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.keystore.password`)),
            'com.adobe.granite.jetty.ssl.ciphersuites.excluded': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.ciphersuites.excluded`)),
            'com.adobe.granite.jetty.ssl.ciphersuites.included': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.ciphersuites.included`)),
            'com.adobe.granite.jetty.ssl.client.certificate': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}com.adobe.granite.jetty.ssl.client.certificate`)),
        }
    },
}
