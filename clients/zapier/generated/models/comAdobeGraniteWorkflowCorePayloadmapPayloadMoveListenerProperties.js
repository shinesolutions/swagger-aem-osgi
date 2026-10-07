const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}payload.move.white.list`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}payload.move.handle.from.workflow.process`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'payload.move.white.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}payload.move.white.list`)),
            'payload.move.handle.from.workflow.process': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}payload.move.handle.from.workflow.process`)),
        }
    },
}
