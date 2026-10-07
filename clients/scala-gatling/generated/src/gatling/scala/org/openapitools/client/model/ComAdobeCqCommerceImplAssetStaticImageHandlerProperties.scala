
package org.openapitools.client.model


case class ComAdobeCqCommerceImplAssetStaticImageHandlerProperties (
    _cqCommerceAssetHandlerActive: Option[ConfigNodePropertyBoolean],
    _cqCommerceAssetHandlerName: Option[ConfigNodePropertyString]
)
object ComAdobeCqCommerceImplAssetStaticImageHandlerProperties {
    def toStringBody(var_cqCommerceAssetHandlerActive: Object, var_cqCommerceAssetHandlerName: Object) =
        s"""
        | {
        | "cqCommerceAssetHandlerActive":$var_cqCommerceAssetHandlerActive,"cqCommerceAssetHandlerName":$var_cqCommerceAssetHandlerName
        | }
        """.stripMargin
}
