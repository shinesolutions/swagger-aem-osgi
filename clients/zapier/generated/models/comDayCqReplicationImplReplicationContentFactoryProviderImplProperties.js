const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}replication.content.useFileStorage`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}replication.content.maxCommitAttempts`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'replication.content.useFileStorage': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}replication.content.useFileStorage`)),
            'replication.content.maxCommitAttempts': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}replication.content.maxCommitAttempts`)),
        }
    },
}
