const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}request.log.service.format`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}request.log.service.output`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}request.log.service.outputtype`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}request.log.service.onentry`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'request.log.service.format': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}request.log.service.format`)),
            'request.log.service.output': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}request.log.service.output`)),
            'request.log.service.outputtype': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}request.log.service.outputtype`)),
            'request.log.service.onentry': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}request.log.service.onentry`)),
        }
    },
}
