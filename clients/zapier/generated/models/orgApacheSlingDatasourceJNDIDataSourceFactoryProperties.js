const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}datasource.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}datasource.svc.prop.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}datasource.jndi.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}jndi.properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'datasource.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.name`)),
            'datasource.svc.prop.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.svc.prop.name`)),
            'datasource.jndi.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.jndi.name`)),
            'jndi.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}jndi.properties`)),
        }
    },
}
