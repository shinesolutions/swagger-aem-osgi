const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}cdn.config.distribution.domain`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cdn.config.enable.rewriting`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cdn.config.path.prefixes`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cdn.config.cdnttl`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cdn.config.application.protocol`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cdn.config.distribution.domain': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cdn.config.distribution.domain`)),
            'cdn.config.enable.rewriting': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cdn.config.enable.rewriting`)),
            'cdn.config.path.prefixes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cdn.config.path.prefixes`)),
            'cdn.config.cdnttl': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cdn.config.cdnttl`)),
            'cdn.config.application.protocol': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cdn.config.application.protocol`)),
        }
    },
}
