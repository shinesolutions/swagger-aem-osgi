
package org.openapitools.client.model


case class ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties (
    _attachmentTypeBlacklist: Option[ConfigNodePropertyString],
    _extensionOrder: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties {
    def toStringBody(var_attachmentTypeBlacklist: Object, var_extensionOrder: Object) =
        s"""
        | {
        | "attachmentTypeBlacklist":$var_attachmentTypeBlacklist,"extensionOrder":$var_extensionOrder
        | }
        """.stripMargin
}
