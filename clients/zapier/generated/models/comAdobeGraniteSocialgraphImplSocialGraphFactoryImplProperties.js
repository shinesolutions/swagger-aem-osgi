const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}group2member.relationship.outgoing`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}group2member.excluded.outgoing`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}group2member.relationship.incoming`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}group2member.excluded.incoming`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'group2member.relationship.outgoing': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group2member.relationship.outgoing`)),
            'group2member.excluded.outgoing': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}group2member.excluded.outgoing`)),
            'group2member.relationship.incoming': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}group2member.relationship.incoming`)),
            'group2member.excluded.incoming': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}group2member.excluded.incoming`)),
        }
    },
}
