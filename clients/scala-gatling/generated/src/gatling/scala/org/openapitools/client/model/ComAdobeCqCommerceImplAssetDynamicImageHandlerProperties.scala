
package org.openapitools.client.model


case class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties (
    _cqCommerceAssetHandlerActive: Option[ConfigNodePropertyBoolean],
    _cqCommerceAssetHandlerName: Option[ConfigNodePropertyString]
)
object ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {
    def toStringBody(var_cqCommerceAssetHandlerActive: Object, var_cqCommerceAssetHandlerName: Object) =
        s"""
        | {
        | "cqCommerceAssetHandlerActive":$var_cqCommerceAssetHandlerActive,"cqCommerceAssetHandlerName":$var_cqCommerceAssetHandlerName
        | }
        """.stripMargin
}
