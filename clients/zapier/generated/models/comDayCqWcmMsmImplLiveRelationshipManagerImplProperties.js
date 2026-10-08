const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}liverelationshipmgr.relationsconfig.default`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'liverelationshipmgr.relationsconfig.default': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}liverelationshipmgr.relationsconfig.default`)),
        }
    },
}
