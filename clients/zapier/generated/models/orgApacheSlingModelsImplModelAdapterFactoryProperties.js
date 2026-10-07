const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.listener`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.context.select`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}max.recursion.depth`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cleanup.job.period`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'osgi.http.whiteboard.listener': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.listener`)),
            'osgi.http.whiteboard.context.select': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.context.select`)),
            'max.recursion.depth': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}max.recursion.depth`)),
            'cleanup.job.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cleanup.job.period`)),
        }
    },
}
