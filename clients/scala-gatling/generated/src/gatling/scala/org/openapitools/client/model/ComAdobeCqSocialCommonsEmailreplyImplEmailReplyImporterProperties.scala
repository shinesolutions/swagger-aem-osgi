
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties (
    _connectProtocol: Option[ConfigNodePropertyDropDown]
)
object ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties {
    def toStringBody(var_connectProtocol: Object) =
        s"""
        | {
        | "connectProtocol":$var_connectProtocol
        | }
        """.stripMargin
}
