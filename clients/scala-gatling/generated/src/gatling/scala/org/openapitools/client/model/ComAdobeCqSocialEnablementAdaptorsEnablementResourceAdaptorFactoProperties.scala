
package org.openapitools.client.model


case class ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties (
    _isMemberCheck: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties {
    def toStringBody(var_isMemberCheck: Object) =
        s"""
        | {
        | "isMemberCheck":$var_isMemberCheck
        | }
        """.stripMargin
}
