const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}job.consumermanager.disableDistribution`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}startup.delay`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cleanup.period`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'job.consumermanager.disableDistribution': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}job.consumermanager.disableDistribution`)),
            'startup.delay': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}startup.delay`)),
            'cleanup.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cleanup.period`)),
        }
    },
}
