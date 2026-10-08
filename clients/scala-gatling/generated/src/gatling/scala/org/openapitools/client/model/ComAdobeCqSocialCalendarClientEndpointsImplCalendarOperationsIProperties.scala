
package org.openapitools.client.model


case class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties (
    _maxRetry: Option[ConfigNodePropertyInteger],
    _fieldWhitelist: Option[ConfigNodePropertyArray],
    _attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {
    def toStringBody(var_maxRetry: Object, var_fieldWhitelist: Object, var_attachmentTypeBlacklist: Object) =
        s"""
        | {
        | "maxRetry":$var_maxRetry,"fieldWhitelist":$var_fieldWhitelist,"attachmentTypeBlacklist":$var_attachmentTypeBlacklist
        | }
        """.stripMargin
}
