
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties (
    _watchwordsPositive: Option[ConfigNodePropertyArray],
    _watchwordsNegative: Option[ConfigNodePropertyArray],
    _watchwordsPath: Option[ConfigNodePropertyString],
    _sentimentPath: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
    def toStringBody(var_watchwordsPositive: Object, var_watchwordsNegative: Object, var_watchwordsPath: Object, var_sentimentPath: Object) =
        s"""
        | {
        | "watchwordsPositive":$var_watchwordsPositive,"watchwordsNegative":$var_watchwordsNegative,"watchwordsPath":$var_watchwordsPath,"sentimentPath":$var_sentimentPath
        | }
        """.stripMargin
}
