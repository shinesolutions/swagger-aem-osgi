
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties (
    _defaultAttachmentTypeBlacklist: Option[ConfigNodePropertyArray],
    _baselineAttachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties {
    def toStringBody(var_defaultAttachmentTypeBlacklist: Object, var_baselineAttachmentTypeBlacklist: Object) =
        s"""
        | {
        | "defaultAttachmentTypeBlacklist":$var_defaultAttachmentTypeBlacklist,"baselineAttachmentTypeBlacklist":$var_baselineAttachmentTypeBlacklist
        | }
        """.stripMargin
}
