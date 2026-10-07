
package org.openapitools.client.model


case class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties (
    _defaultAttachmentTypeBlacklist: Option[ConfigNodePropertyArray],
    _baselineAttachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties {
    def toStringBody(var_defaultAttachmentTypeBlacklist: Object, var_baselineAttachmentTypeBlacklist: Object) =
        s"""
        | {
        | "defaultAttachmentTypeBlacklist":$var_defaultAttachmentTypeBlacklist,"baselineAttachmentTypeBlacklist":$var_baselineAttachmentTypeBlacklist
        | }
        """.stripMargin
}
