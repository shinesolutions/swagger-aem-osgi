const utils = require('../utils/utils');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}solr.home.path`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}solr.core.name`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'solr.home.path': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.home.path`)),
            'solr.core.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}solr.core.name`)),
        }
    },
}
