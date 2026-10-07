
package org.openapitools.client.model


case class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties (
    _name: Option[ConfigNodePropertyString],
    _locale: Option[ConfigNodePropertyString],
    _imsConfig: Option[ConfigNodePropertyString]
)
object ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
    def toStringBody(var_name: Object, var_locale: Object, var_imsConfig: Object) =
        s"""
        | {
        | "name":$var_name,"locale":$var_locale,"imsConfig":$var_imsConfig
        | }
        """.stripMargin
}
