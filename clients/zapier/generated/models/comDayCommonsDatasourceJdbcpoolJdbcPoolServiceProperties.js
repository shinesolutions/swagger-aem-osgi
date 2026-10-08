const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}jdbc.driver.class`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jdbc.connection.uri`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jdbc.username`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jdbc.password`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jdbc.validation.query`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}default.readonly`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}default.autocommit`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}pool.size`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}pool.max.wait.msec`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}datasource.name`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}datasource.svc.properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'jdbc.driver.class': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbc.driver.class`)),
            'jdbc.connection.uri': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbc.connection.uri`)),
            'jdbc.username': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbc.username`)),
            'jdbc.password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbc.password`)),
            'jdbc.validation.query': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbc.validation.query`)),
            'default.readonly': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}default.readonly`)),
            'default.autocommit': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}default.autocommit`)),
            'pool.size': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}pool.size`)),
            'pool.max.wait.msec': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}pool.max.wait.msec`)),
            'datasource.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.name`)),
            'datasource.svc.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}datasource.svc.properties`)),
        }
    },
}
