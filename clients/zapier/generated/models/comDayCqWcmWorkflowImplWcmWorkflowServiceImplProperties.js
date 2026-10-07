const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}event.filter`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minThreadPoolSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxThreadPoolSize`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.wcm.workflow.terminate.on.activate`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}cq.wcm.worklfow.terminate.exclusion.list`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event.filter': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}event.filter`)),
            'minThreadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minThreadPoolSize`)),
            'maxThreadPoolSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxThreadPoolSize`)),
            'cq.wcm.workflow.terminate.on.activate': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.wcm.workflow.terminate.on.activate`)),
            'cq.wcm.worklfow.terminate.exclusion.list': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}cq.wcm.worklfow.terminate.exclusion.list`)),
        }
    },
}
