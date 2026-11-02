package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
  watchwordsPositive: Option[ConfigNodePropertyArray],
  watchwordsNegative: Option[ConfigNodePropertyArray],
  watchwordsPath: Option[ConfigNodePropertyString],
  sentimentPath: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
  implicit lazy val comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesJsonFormat: Format[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties] = Json.format[ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties]
}

