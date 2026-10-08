
package org.openapitools.client.model


case class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties (
    _cqAnalyticsAdapterfactoryContextstores: Option[ConfigNodePropertyArray]
)
object ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {
    def toStringBody(var_cqAnalyticsAdapterfactoryContextstores: Object) =
        s"""
        | {
        | "cqAnalyticsAdapterfactoryContextstores":$var_cqAnalyticsAdapterfactoryContextstores
        | }
        """.stripMargin
}
