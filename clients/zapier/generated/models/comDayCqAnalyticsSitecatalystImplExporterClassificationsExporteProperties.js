const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyArray.fields(`${keyPrefix}allowed.paths`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.analytics.saint.exporter.pagesize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'allowed.paths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}allowed.paths`)),
            'cq.analytics.saint.exporter.pagesize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.analytics.saint.exporter.pagesize`)),
        }
    },
}
