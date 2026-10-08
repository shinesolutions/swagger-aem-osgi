const utils = require('../utils/utils');
const configNodePropertyArray = require('../models/configNodePropertyArray');
const configNodePropertyBoolean = require('../models/configNodePropertyBoolean');
const configNodePropertyDropDown = require('../models/configNodePropertyDropDown');
const configNodePropertyInteger = require('../models/configNodePropertyInteger');
const configNodePropertyString = require('../models/configNodePropertyString');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...configNodePropertyString.fields(`${keyPrefix}datasource.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}datasource.svc.prop.name`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}driverClassName`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}url`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}username`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}password`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}defaultAutoCommit`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}defaultReadOnly`, isInput),
            ...configNodePropertyDropDown.fields(`${keyPrefix}defaultTransactionIsolation`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}defaultCatalog`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxActive`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxIdle`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minIdle`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}initialSize`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxWait`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}maxAge`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}testOnBorrow`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}testOnReturn`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}testWhileIdle`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}validationQuery`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}validationQueryTimeout`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}timeBetweenEvictionRunsMillis`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}minEvictableIdleTimeMillis`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}connectionProperties`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}initSQL`, isInput),
            ...configNodePropertyString.fields(`${keyPrefix}jdbcInterceptors`, isInput),
            ...configNodePropertyInteger.fields(`${keyPrefix}validationInterval`, isInput),
            ...configNodePropertyBoolean.fields(`${keyPrefix}logValidationErrors`, isInput),
            ...configNodePropertyArray.fields(`${keyPrefix}datasource.svc.properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'datasource.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.name`)),
            'datasource.svc.prop.name': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}datasource.svc.prop.name`)),
            'driverClassName': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}driverClassName`)),
            'url': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}url`)),
            'username': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}username`)),
            'password': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}password`)),
            'defaultAutoCommit': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}defaultAutoCommit`)),
            'defaultReadOnly': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}defaultReadOnly`)),
            'defaultTransactionIsolation': utils.removeIfEmpty(configNodePropertyDropDown.mapping(bundle, `${keyPrefix}defaultTransactionIsolation`)),
            'defaultCatalog': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}defaultCatalog`)),
            'maxActive': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxActive`)),
            'maxIdle': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxIdle`)),
            'minIdle': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minIdle`)),
            'initialSize': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}initialSize`)),
            'maxWait': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxWait`)),
            'maxAge': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}maxAge`)),
            'testOnBorrow': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}testOnBorrow`)),
            'testOnReturn': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}testOnReturn`)),
            'testWhileIdle': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}testWhileIdle`)),
            'validationQuery': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}validationQuery`)),
            'validationQueryTimeout': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}validationQueryTimeout`)),
            'timeBetweenEvictionRunsMillis': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}timeBetweenEvictionRunsMillis`)),
            'minEvictableIdleTimeMillis': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}minEvictableIdleTimeMillis`)),
            'connectionProperties': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}connectionProperties`)),
            'initSQL': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}initSQL`)),
            'jdbcInterceptors': utils.removeIfEmpty(configNodePropertyString.mapping(bundle, `${keyPrefix}jdbcInterceptors`)),
            'validationInterval': utils.removeIfEmpty(configNodePropertyInteger.mapping(bundle, `${keyPrefix}validationInterval`)),
            'logValidationErrors': utils.removeIfEmpty(configNodePropertyBoolean.mapping(bundle, `${keyPrefix}logValidationErrors`)),
            'datasource.svc.properties': utils.removeIfEmpty(configNodePropertyArray.mapping(bundle, `${keyPrefix}datasource.svc.properties`)),
        }
    },
}
