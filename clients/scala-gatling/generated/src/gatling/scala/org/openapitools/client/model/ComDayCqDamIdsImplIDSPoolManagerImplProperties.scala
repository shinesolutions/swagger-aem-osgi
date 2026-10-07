
package org.openapitools.client.model


case class ComDayCqDamIdsImplIDSPoolManagerImplProperties (
    _maxErrorsToBlacklist: Option[ConfigNodePropertyInteger],
    _retryIntervalToWhitelist: Option[ConfigNodePropertyInteger],
    _connectTimeout: Option[ConfigNodePropertyInteger],
    _socketTimeout: Option[ConfigNodePropertyInteger],
    _processLabel: Option[ConfigNodePropertyString],
    _connectionUseMax: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamIdsImplIDSPoolManagerImplProperties {
    def toStringBody(var_maxErrorsToBlacklist: Object, var_retryIntervalToWhitelist: Object, var_connectTimeout: Object, var_socketTimeout: Object, var_processLabel: Object, var_connectionUseMax: Object) =
        s"""
        | {
        | "maxErrorsToBlacklist":$var_maxErrorsToBlacklist,"retryIntervalToWhitelist":$var_retryIntervalToWhitelist,"connectTimeout":$var_connectTimeout,"socketTimeout":$var_socketTimeout,"processLabel":$var_processLabel,"connectionUseMax":$var_connectionUseMax
        | }
        """.stripMargin
}
