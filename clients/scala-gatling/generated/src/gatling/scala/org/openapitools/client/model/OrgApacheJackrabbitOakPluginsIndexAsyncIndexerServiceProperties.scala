
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties (
    _asyncConfigs: Option[ConfigNodePropertyArray],
    _leaseTimeOutMinutes: Option[ConfigNodePropertyInteger],
    _failingIndexTimeoutSeconds: Option[ConfigNodePropertyInteger],
    _errorWarnIntervalSeconds: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
    def toStringBody(var_asyncConfigs: Object, var_leaseTimeOutMinutes: Object, var_failingIndexTimeoutSeconds: Object, var_errorWarnIntervalSeconds: Object) =
        s"""
        | {
        | "asyncConfigs":$var_asyncConfigs,"leaseTimeOutMinutes":$var_leaseTimeOutMinutes,"failingIndexTimeoutSeconds":$var_failingIndexTimeoutSeconds,"errorWarnIntervalSeconds":$var_errorWarnIntervalSeconds
        | }
        """.stripMargin
}
