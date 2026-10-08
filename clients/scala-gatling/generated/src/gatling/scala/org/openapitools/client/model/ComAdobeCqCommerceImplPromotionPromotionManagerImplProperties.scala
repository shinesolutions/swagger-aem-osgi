
package org.openapitools.client.model


case class ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties (
    _cqCommercePromotionRoot: Option[ConfigNodePropertyString]
)
object ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties {
    def toStringBody(var_cqCommercePromotionRoot: Object) =
        s"""
        | {
        | "cqCommercePromotionRoot":$var_cqCommercePromotionRoot
        | }
        """.stripMargin
}
