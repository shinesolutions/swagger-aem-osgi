const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}scheduler.period`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}scheduler.concurrent`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}good_link_test_interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}bad_link_test_interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}link_unused_interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}connection.timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scheduler.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}scheduler.period`)),
            'scheduler.concurrent': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}scheduler.concurrent`)),
            'good_link_test_interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}good_link_test_interval`)),
            'bad_link_test_interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}bad_link_test_interval`)),
            'link_unused_interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}link_unused_interval`)),
            'connection.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}connection.timeout`)),
        }
    },
}
