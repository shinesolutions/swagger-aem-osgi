const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.servlet.pattern`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}osgi.http.whiteboard.context.select`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'osgi.http.whiteboard.servlet.pattern': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.servlet.pattern`)),
            'osgi.http.whiteboard.context.select': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}osgi.http.whiteboard.context.select`)),
        }
    },
}
