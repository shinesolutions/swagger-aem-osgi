
package org.openapitools.client.model


case class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties (
    _mimeAllowEmpty: Option[ConfigNodePropertyBoolean],
    _mimeAllowed: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties {
    def toStringBody(var_mimeAllowEmpty: Object, var_mimeAllowed: Object) =
        s"""
        | {
        | "mimeAllowEmpty":$var_mimeAllowEmpty,"mimeAllowed":$var_mimeAllowed
        | }
        """.stripMargin
}
