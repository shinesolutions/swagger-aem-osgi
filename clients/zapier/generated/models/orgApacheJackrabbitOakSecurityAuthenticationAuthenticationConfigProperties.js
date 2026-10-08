const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.jackrabbit.oak.authentication.appName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.jackrabbit.oak.authentication.configSpiName`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.jackrabbit.oak.authentication.appName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.jackrabbit.oak.authentication.appName`)),
            'org.apache.jackrabbit.oak.authentication.configSpiName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.jackrabbit.oak.authentication.configSpiName`)),
        }
    },
}
