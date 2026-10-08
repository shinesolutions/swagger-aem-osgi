
package org.openapitools.client.model


case class AnalyticsComponentQueryCacheServiceProperties (
    _cqAnalyticsComponentQueryCacheSize: Option[ConfigNodePropertyInteger]
)
object AnalyticsComponentQueryCacheServiceProperties {
    def toStringBody(var_cqAnalyticsComponentQueryCacheSize: Object) =
        s"""
        | {
        | "cqAnalyticsComponentQueryCacheSize":$var_cqAnalyticsComponentQueryCacheSize
        | }
        """.stripMargin
}
