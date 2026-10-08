const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}operation`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}operationIcon`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}topicName`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}emailEnabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operation': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}operation`)),
            'operationIcon': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}operationIcon`)),
            'topicName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}topicName`)),
            'emailEnabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}emailEnabled`)),
        }
    },
}
