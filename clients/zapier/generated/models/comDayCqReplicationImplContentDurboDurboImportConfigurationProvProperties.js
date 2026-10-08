const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}preserve.hierarchy.nodes`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ignore.versioning`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}import.acl`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}save.threshold`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}preserve.user.paths`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}preserve.uuid`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}preserve.uuid.nodetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}preserve.uuid.subtrees`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}auto.commit`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'preserve.hierarchy.nodes': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}preserve.hierarchy.nodes`)),
            'ignore.versioning': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ignore.versioning`)),
            'import.acl': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}import.acl`)),
            'save.threshold': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}save.threshold`)),
            'preserve.user.paths': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}preserve.user.paths`)),
            'preserve.uuid': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}preserve.uuid`)),
            'preserve.uuid.nodetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}preserve.uuid.nodetypes`)),
            'preserve.uuid.subtrees': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}preserve.uuid.subtrees`)),
            'auto.commit': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}auto.commit`)),
        }
    },
}
