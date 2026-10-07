const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}request.log.output`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}request.log.outputtype`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}request.log.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}access.log.output`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}access.log.outputtype`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}access.log.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'request.log.output': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}request.log.output`)),
            'request.log.outputtype': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}request.log.outputtype`)),
            'request.log.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}request.log.enabled`)),
            'access.log.output': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}access.log.output`)),
            'access.log.outputtype': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}access.log.outputtype`)),
            'access.log.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}access.log.enabled`)),
        }
    },
}
