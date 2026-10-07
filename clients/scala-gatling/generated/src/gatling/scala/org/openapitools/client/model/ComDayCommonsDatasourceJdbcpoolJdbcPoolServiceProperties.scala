
package org.openapitools.client.model


case class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties (
    _jdbcDriverClass: Option[ConfigNodePropertyString],
    _jdbcConnectionUri: Option[ConfigNodePropertyString],
    _jdbcUsername: Option[ConfigNodePropertyString],
    _jdbcPassword: Option[ConfigNodePropertyString],
    _jdbcValidationQuery: Option[ConfigNodePropertyString],
    _defaultReadonly: Option[ConfigNodePropertyBoolean],
    _defaultAutocommit: Option[ConfigNodePropertyBoolean],
    _poolSize: Option[ConfigNodePropertyInteger],
    _poolMaxWaitMsec: Option[ConfigNodePropertyInteger],
    _datasourceName: Option[ConfigNodePropertyString],
    _datasourceSvcProperties: Option[ConfigNodePropertyArray]
)
object ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
    def toStringBody(var_jdbcDriverClass: Object, var_jdbcConnectionUri: Object, var_jdbcUsername: Object, var_jdbcPassword: Object, var_jdbcValidationQuery: Object, var_defaultReadonly: Object, var_defaultAutocommit: Object, var_poolSize: Object, var_poolMaxWaitMsec: Object, var_datasourceName: Object, var_datasourceSvcProperties: Object) =
        s"""
        | {
        | "jdbcDriverClass":$var_jdbcDriverClass,"jdbcConnectionUri":$var_jdbcConnectionUri,"jdbcUsername":$var_jdbcUsername,"jdbcPassword":$var_jdbcPassword,"jdbcValidationQuery":$var_jdbcValidationQuery,"defaultReadonly":$var_defaultReadonly,"defaultAutocommit":$var_defaultAutocommit,"poolSize":$var_poolSize,"poolMaxWaitMsec":$var_poolMaxWaitMsec,"datasourceName":$var_datasourceName,"datasourceSvcProperties":$var_datasourceSvcProperties
        | }
        """.stripMargin
}
