
package org.openapitools.client.model


case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties (
    _xmpFilterApplyWhitelist: Option[ConfigNodePropertyBoolean],
    _xmpFilterWhitelist: Option[ConfigNodePropertyArray],
    _xmpFilterApplyBlacklist: Option[ConfigNodePropertyBoolean],
    _xmpFilterBlacklist: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties {
    def toStringBody(var_xmpFilterApplyWhitelist: Object, var_xmpFilterWhitelist: Object, var_xmpFilterApplyBlacklist: Object, var_xmpFilterBlacklist: Object) =
        s"""
        | {
        | "xmpFilterApplyWhitelist":$var_xmpFilterApplyWhitelist,"xmpFilterWhitelist":$var_xmpFilterWhitelist,"xmpFilterApplyBlacklist":$var_xmpFilterApplyBlacklist,"xmpFilterBlacklist":$var_xmpFilterBlacklist
        | }
        """.stripMargin
}
