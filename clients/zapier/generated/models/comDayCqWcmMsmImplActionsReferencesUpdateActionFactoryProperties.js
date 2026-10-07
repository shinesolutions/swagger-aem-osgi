const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.msm.action.excludednodetypes`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.msm.action.excludedparagraphitems`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.msm.action.excludedprops`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.wcm.msm.impl.action.referencesupdate.prop_updateNested`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.wcm.msm.action.excludednodetypes': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.msm.action.excludednodetypes`)),
            'cq.wcm.msm.action.excludedparagraphitems': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.msm.action.excludedparagraphitems`)),
            'cq.wcm.msm.action.excludedprops': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.msm.action.excludedprops`)),
            'cq.wcm.msm.impl.action.referencesupdate.prop_updateNested': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.wcm.msm.impl.action.referencesupdate.prop_updateNested`)),
        }
    },
}
