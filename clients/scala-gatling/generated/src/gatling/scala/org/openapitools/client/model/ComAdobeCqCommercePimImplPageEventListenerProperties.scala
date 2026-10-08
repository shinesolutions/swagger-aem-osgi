
package org.openapitools.client.model


case class ComAdobeCqCommercePimImplPageEventListenerProperties (
    _cqCommercePageeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqCommercePimImplPageEventListenerProperties {
    def toStringBody(var_cqCommercePageeventlistenerEnabled: Object) =
        s"""
        | {
        | "cqCommercePageeventlistenerEnabled":$var_cqCommercePageeventlistenerEnabled
        | }
        """.stripMargin
}
