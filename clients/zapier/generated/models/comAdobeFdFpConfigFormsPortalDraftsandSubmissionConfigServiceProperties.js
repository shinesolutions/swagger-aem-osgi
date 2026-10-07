const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}portal.outboxes`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}draft.data.service`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}draft.metadata.service`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}submit.data.service`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}submit.metadata.service`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pendingSign.data.service`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}pendingSign.metadata.service`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'portal.outboxes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}portal.outboxes`)),
            'draft.data.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}draft.data.service`)),
            'draft.metadata.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}draft.metadata.service`)),
            'submit.data.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}submit.data.service`)),
            'submit.metadata.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}submit.metadata.service`)),
            'pendingSign.data.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pendingSign.data.service`)),
            'pendingSign.metadata.service': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}pendingSign.metadata.service`)),
        }
    },
}
