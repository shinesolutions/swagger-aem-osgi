const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyInteger.fields(`${keyPrefix}service.max_links_per_host`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}service.save_external_link_references`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'service.max_links_per_host': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}service.max_links_per_host`)),
            'service.save_external_link_references': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}service.save_external_link_references`)),
        }
    },
}
