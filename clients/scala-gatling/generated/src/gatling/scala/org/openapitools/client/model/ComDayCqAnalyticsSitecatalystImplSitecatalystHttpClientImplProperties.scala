
package org.openapitools.client.model


case class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties (
    _cqAnalyticsSitecatalystServiceDatacenterUrl: Option[ConfigNodePropertyArray],
    _devhostnamepatterns: Option[ConfigNodePropertyArray],
    _connectionTimeout: Option[ConfigNodePropertyInteger],
    _socketTimeout: Option[ConfigNodePropertyInteger]
)
object ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties {
    def toStringBody(var_cqAnalyticsSitecatalystServiceDatacenterUrl: Object, var_devhostnamepatterns: Object, var_connectionTimeout: Object, var_socketTimeout: Object) =
        s"""
        | {
        | "cqAnalyticsSitecatalystServiceDatacenterUrl":$var_cqAnalyticsSitecatalystServiceDatacenterUrl,"devhostnamepatterns":$var_devhostnamepatterns,"connectionTimeout":$var_connectionTimeout,"socketTimeout":$var_socketTimeout
        | }
        """.stripMargin
}
