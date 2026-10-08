const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}allow.empty`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allow.hosts`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}allow.hosts.regexp`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}filter.methods`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}exclude.agents.regexp`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'allow.empty': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}allow.empty`)),
            'allow.hosts': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allow.hosts`)),
            'allow.hosts.regexp': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allow.hosts.regexp`)),
            'filter.methods': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}filter.methods`)),
            'exclude.agents.regexp': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}exclude.agents.regexp`)),
        }
    },
}
