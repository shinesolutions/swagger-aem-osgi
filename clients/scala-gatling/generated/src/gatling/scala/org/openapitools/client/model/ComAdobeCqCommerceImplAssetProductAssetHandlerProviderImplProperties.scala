
package org.openapitools.client.model


case class ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties (
    _cqCommerceAssetHandlerFallback: Option[ConfigNodePropertyString]
)
object ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties {
    def toStringBody(var_cqCommerceAssetHandlerFallback: Object) =
        s"""
        | {
        | "cqCommerceAssetHandlerFallback":$var_cqCommerceAssetHandlerFallback
        | }
        """.stripMargin
}
