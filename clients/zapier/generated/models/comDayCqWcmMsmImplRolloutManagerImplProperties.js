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
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}rolloutmgr.excludedprops.default`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}rolloutmgr.excludedparagraphprops.default`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}rolloutmgr.excludednodetypes.default`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}rolloutmgr.threadpool.maxsize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}rolloutmgr.threadpool.maxshutdowntime`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}rolloutmgr.threadpool.priority`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}rolloutmgr.commit.size`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}rolloutmgr.conflicthandling.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'rolloutmgr.excludedprops.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}rolloutmgr.excludedprops.default`)),
            'rolloutmgr.excludedparagraphprops.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}rolloutmgr.excludedparagraphprops.default`)),
            'rolloutmgr.excludednodetypes.default': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}rolloutmgr.excludednodetypes.default`)),
            'rolloutmgr.threadpool.maxsize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}rolloutmgr.threadpool.maxsize`)),
            'rolloutmgr.threadpool.maxshutdowntime': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}rolloutmgr.threadpool.maxshutdowntime`)),
            'rolloutmgr.threadpool.priority': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}rolloutmgr.threadpool.priority`)),
            'rolloutmgr.commit.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}rolloutmgr.commit.size`)),
            'rolloutmgr.conflicthandling.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}rolloutmgr.conflicthandling.enabled`)),
        }
    },
}
