const utils = require('../utils/utils');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.social.reporting.analytics.polling.importer.interval`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.social.reporting.analytics.polling.importer.pageSize`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.social.reporting.analytics.polling.importer.interval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.social.reporting.analytics.polling.importer.interval`)),
            'cq.social.reporting.analytics.polling.importer.pageSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.social.reporting.analytics.polling.importer.pageSize`)),
        }
    },
}
