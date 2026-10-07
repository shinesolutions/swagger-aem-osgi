
package org.openapitools.client.model


case class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties (
    _cqWcmQrcodeServletWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties {
    def toStringBody(var_cqWcmQrcodeServletWhitelist: Object) =
        s"""
        | {
        | "cqWcmQrcodeServletWhitelist":$var_cqWcmQrcodeServletWhitelist
        | }
        """.stripMargin
}
