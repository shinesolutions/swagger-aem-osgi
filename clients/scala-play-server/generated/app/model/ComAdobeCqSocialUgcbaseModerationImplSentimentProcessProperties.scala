package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
  watchwordsPositive: Option[ConfigNodePropertyArray],
  watchwordsNegative: Option[ConfigNodePropertyArray],
  watchwordsPath: Option[ConfigNodePropertyString],
  sentimentPath: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
  implicit lazy val comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesJsonFormat: Format[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] = Json.format[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties]
}

