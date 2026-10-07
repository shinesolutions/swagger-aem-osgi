
package org.openapitools.client.model


case class ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties (
    _getCacheExpirationUnit: Option[ConfigNodePropertyDropDown],
    _getCacheExpirationValue: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties {
    def toStringBody(var_getCacheExpirationUnit: Object, var_getCacheExpirationValue: Object) =
        s"""
        | {
        | "getCacheExpirationUnit":$var_getCacheExpirationUnit,"getCacheExpirationValue":$var_getCacheExpirationValue
        | }
        """.stripMargin
}
