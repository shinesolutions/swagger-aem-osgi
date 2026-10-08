
package org.openapitools.client.model


case class OrgApacheSlingDatasourceDataSourceFactoryProperties (
    _datasourceName: Option[ConfigNodePropertyString],
    _datasourceSvcPropName: Option[ConfigNodePropertyString],
    _driverClassName: Option[ConfigNodePropertyString],
    _url: Option[ConfigNodePropertyString],
    _username: Option[ConfigNodePropertyString],
    _password: Option[ConfigNodePropertyString],
    _defaultAutoCommit: Option[ConfigNodePropertyDropDown],
    _defaultReadOnly: Option[ConfigNodePropertyDropDown],
    _defaultTransactionIsolation: Option[ConfigNodePropertyDropDown],
    _defaultCatalog: Option[ConfigNodePropertyString],
    _maxActive: Option[ConfigNodePropertyInteger],
    _maxIdle: Option[ConfigNodePropertyInteger],
    _minIdle: Option[ConfigNodePropertyInteger],
    _initialSize: Option[ConfigNodePropertyInteger],
    _maxWait: Option[ConfigNodePropertyInteger],
    _maxAge: Option[ConfigNodePropertyInteger],
    _testOnBorrow: Option[ConfigNodePropertyBoolean],
    _testOnReturn: Option[ConfigNodePropertyBoolean],
    _testWhileIdle: Option[ConfigNodePropertyBoolean],
    _validationQuery: Option[ConfigNodePropertyString],
    _validationQueryTimeout: Option[ConfigNodePropertyInteger],
    _timeBetweenEvictionRunsMillis: Option[ConfigNodePropertyInteger],
    _minEvictableIdleTimeMillis: Option[ConfigNodePropertyInteger],
    _connectionProperties: Option[ConfigNodePropertyString],
    _initSQL: Option[ConfigNodePropertyString],
    _jdbcInterceptors: Option[ConfigNodePropertyString],
    _validationInterval: Option[ConfigNodePropertyInteger],
    _logValidationErrors: Option[ConfigNodePropertyBoolean],
    _datasourceSvcProperties: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingDatasourceDataSourceFactoryProperties {
    def toStringBody(var_datasourceName: Object, var_datasourceSvcPropName: Object, var_driverClassName: Object, var_url: Object, var_username: Object, var_password: Object, var_defaultAutoCommit: Object, var_defaultReadOnly: Object, var_defaultTransactionIsolation: Object, var_defaultCatalog: Object, var_maxActive: Object, var_maxIdle: Object, var_minIdle: Object, var_initialSize: Object, var_maxWait: Object, var_maxAge: Object, var_testOnBorrow: Object, var_testOnReturn: Object, var_testWhileIdle: Object, var_validationQuery: Object, var_validationQueryTimeout: Object, var_timeBetweenEvictionRunsMillis: Object, var_minEvictableIdleTimeMillis: Object, var_connectionProperties: Object, var_initSQL: Object, var_jdbcInterceptors: Object, var_validationInterval: Object, var_logValidationErrors: Object, var_datasourceSvcProperties: Object) =
        s"""
        | {
        | "datasourceName":$var_datasourceName,"datasourceSvcPropName":$var_datasourceSvcPropName,"driverClassName":$var_driverClassName,"url":$var_url,"username":$var_username,"password":$var_password,"defaultAutoCommit":$var_defaultAutoCommit,"defaultReadOnly":$var_defaultReadOnly,"defaultTransactionIsolation":$var_defaultTransactionIsolation,"defaultCatalog":$var_defaultCatalog,"maxActive":$var_maxActive,"maxIdle":$var_maxIdle,"minIdle":$var_minIdle,"initialSize":$var_initialSize,"maxWait":$var_maxWait,"maxAge":$var_maxAge,"testOnBorrow":$var_testOnBorrow,"testOnReturn":$var_testOnReturn,"testWhileIdle":$var_testWhileIdle,"validationQuery":$var_validationQuery,"validationQueryTimeout":$var_validationQueryTimeout,"timeBetweenEvictionRunsMillis":$var_timeBetweenEvictionRunsMillis,"minEvictableIdleTimeMillis":$var_minEvictableIdleTimeMillis,"connectionProperties":$var_connectionProperties,"initSQL":$var_initSQL,"jdbcInterceptors":$var_jdbcInterceptors,"validationInterval":$var_validationInterval,"logValidationErrors":$var_logValidationErrors,"datasourceSvcProperties":$var_datasourceSvcProperties
        | }
        """.stripMargin
}
