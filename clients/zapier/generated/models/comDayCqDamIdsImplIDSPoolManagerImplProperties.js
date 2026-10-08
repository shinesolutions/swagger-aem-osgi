const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}max.errors.to.blacklist`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}retry.interval.to.whitelist`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connect.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}socket.timeout`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}process.label`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connection.use.max`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'max.errors.to.blacklist': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}max.errors.to.blacklist`)),
            'retry.interval.to.whitelist': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}retry.interval.to.whitelist`)),
            'connect.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connect.timeout`)),
            'socket.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}socket.timeout`)),
            'process.label': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}process.label`)),
            'connection.use.max': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connection.use.max`)),
        }
    },
}
