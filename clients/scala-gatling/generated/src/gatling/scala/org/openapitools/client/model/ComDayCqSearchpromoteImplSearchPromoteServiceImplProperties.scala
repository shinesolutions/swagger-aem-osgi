
package org.openapitools.client.model


case class ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties (
    _cqSearchpromoteConfigurationServerUri: Option[ConfigNodePropertyString],
    _cqSearchpromoteConfigurationEnvironment: Option[ConfigNodePropertyString],
    _connectionTimeout: Option[ConfigNodePropertyInteger],
    _socketTimeout: Option[ConfigNodePropertyInteger]
)
object ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties {
    def toStringBody(var_cqSearchpromoteConfigurationServerUri: Object, var_cqSearchpromoteConfigurationEnvironment: Object, var_connectionTimeout: Object, var_socketTimeout: Object) =
        s"""
        | {
        | "cqSearchpromoteConfigurationServerUri":$var_cqSearchpromoteConfigurationServerUri,"cqSearchpromoteConfigurationEnvironment":$var_cqSearchpromoteConfigurationEnvironment,"connectionTimeout":$var_connectionTimeout,"socketTimeout":$var_socketTimeout
        | }
        """.stripMargin
}
