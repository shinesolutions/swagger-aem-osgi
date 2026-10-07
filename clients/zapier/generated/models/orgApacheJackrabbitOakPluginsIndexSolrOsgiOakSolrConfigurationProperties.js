const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}path.desc.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path.child.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path.parent.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path.exact.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}catch.all.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}collapsed.path.field`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}path.depth.field`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}commit.policy`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}rows`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}path.restrictions`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}property.restrictions`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}primarytypes.restrictions`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}ignored.properties`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}used.properties`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}type.mappings`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}property.mappings`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}collapse.jcrcontent.nodes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'path.desc.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path.desc.field`)),
            'path.child.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path.child.field`)),
            'path.parent.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path.parent.field`)),
            'path.exact.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path.exact.field`)),
            'catch.all.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}catch.all.field`)),
            'collapsed.path.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}collapsed.path.field`)),
            'path.depth.field': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}path.depth.field`)),
            'commit.policy': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}commit.policy`)),
            'rows': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}rows`)),
            'path.restrictions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}path.restrictions`)),
            'property.restrictions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}property.restrictions`)),
            'primarytypes.restrictions': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}primarytypes.restrictions`)),
            'ignored.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}ignored.properties`)),
            'used.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}used.properties`)),
            'type.mappings': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}type.mappings`)),
            'property.mappings': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}property.mappings`)),
            'collapse.jcrcontent.nodes': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}collapse.jcrcontent.nodes`)),
        }
    },
}
