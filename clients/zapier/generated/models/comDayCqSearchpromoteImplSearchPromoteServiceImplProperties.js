const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cq.searchpromote.configuration.server.uri`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.searchpromote.configuration.environment`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connection.timeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}socket.timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.searchpromote.configuration.server.uri': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.searchpromote.configuration.server.uri`)),
            'cq.searchpromote.configuration.environment': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.searchpromote.configuration.environment`)),
            'connection.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connection.timeout`)),
            'socket.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}socket.timeout`)),
        }
    },
}
