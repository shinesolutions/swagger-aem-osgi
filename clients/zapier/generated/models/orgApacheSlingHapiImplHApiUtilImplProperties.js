const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.hapi.tools.resourcetype`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.hapi.tools.collectionresourcetype`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}org.apache.sling.hapi.tools.searchpaths`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}org.apache.sling.hapi.tools.externalurl`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}org.apache.sling.hapi.tools.enabled`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'org.apache.sling.hapi.tools.resourcetype': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.hapi.tools.resourcetype`)),
            'org.apache.sling.hapi.tools.collectionresourcetype': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.hapi.tools.collectionresourcetype`)),
            'org.apache.sling.hapi.tools.searchpaths': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}org.apache.sling.hapi.tools.searchpaths`)),
            'org.apache.sling.hapi.tools.externalurl': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}org.apache.sling.hapi.tools.externalurl`)),
            'org.apache.sling.hapi.tools.enabled': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}org.apache.sling.hapi.tools.enabled`)),
        }
    },
}
