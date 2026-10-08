const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.multisession`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ids.cc.enable`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.retry`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}enable.retry.scripterror`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}externalizer.domain.cqhost`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}externalizer.domain.http`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enable.multisession': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.multisession`)),
            'ids.cc.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ids.cc.enable`)),
            'enable.retry': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.retry`)),
            'enable.retry.scripterror': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}enable.retry.scripterror`)),
            'externalizer.domain.cqhost': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}externalizer.domain.cqhost`)),
            'externalizer.domain.http': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}externalizer.domain.http`)),
        }
    },
}
