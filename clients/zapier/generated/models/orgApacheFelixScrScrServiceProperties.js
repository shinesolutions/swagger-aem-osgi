const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyDropDown.fields(`${keyPrefix}ds.loglevel`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ds.factory.enabled`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ds.delayed.keepInstances`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ds.lock.timeout.milliseconds`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}ds.stop.timeout.milliseconds`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}ds.global.extender`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ds.loglevel': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}ds.loglevel`)),
            'ds.factory.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ds.factory.enabled`)),
            'ds.delayed.keepInstances': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ds.delayed.keepInstances`)),
            'ds.lock.timeout.milliseconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ds.lock.timeout.milliseconds`)),
            'ds.stop.timeout.milliseconds': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}ds.stop.timeout.milliseconds`)),
            'ds.global.extender': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}ds.global.extender`)),
        }
    },
}
