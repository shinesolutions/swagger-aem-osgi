const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.wcm.undo.enabled`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.wcm.undo.path`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.wcm.undo.validity`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.wcm.undo.steps`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.wcm.undo.persistence`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.wcm.undo.persistence.mode`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}cq.wcm.undo.markermode`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.undo.whitelist`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.undo.blacklist`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.wcm.undo.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.wcm.undo.enabled`)),
            'cq.wcm.undo.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.wcm.undo.path`)),
            'cq.wcm.undo.validity': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.wcm.undo.validity`)),
            'cq.wcm.undo.steps': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.wcm.undo.steps`)),
            'cq.wcm.undo.persistence': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.wcm.undo.persistence`)),
            'cq.wcm.undo.persistence.mode': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.wcm.undo.persistence.mode`)),
            'cq.wcm.undo.markermode': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}cq.wcm.undo.markermode`)),
            'cq.wcm.undo.whitelist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.undo.whitelist`)),
            'cq.wcm.undo.blacklist': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.undo.blacklist`)),
        }
    },
}
