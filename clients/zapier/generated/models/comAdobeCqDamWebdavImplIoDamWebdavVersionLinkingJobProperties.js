const utils = require('../utils/utils');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyBoolean.fields(`${keyPrefix}cq.dam.webdav.version.linking.enable`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.webdav.version.linking.scheduler.period`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}cq.dam.webdav.version.linking.staging.timeout`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cq.dam.webdav.version.linking.enable': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}cq.dam.webdav.version.linking.enable`)),
            'cq.dam.webdav.version.linking.scheduler.period': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.webdav.version.linking.scheduler.period`)),
            'cq.dam.webdav.version.linking.staging.timeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}cq.dam.webdav.version.linking.staging.timeout`)),
        }
    },
}
