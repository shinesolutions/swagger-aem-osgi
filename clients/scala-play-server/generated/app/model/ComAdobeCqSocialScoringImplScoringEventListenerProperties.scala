package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialScoringImplScoringEventListenerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialScoringImplScoringEventListenerProperties(
  eventTopics: Option[ConfigNodePropertyString],
  eventFilter: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialScoringImplScoringEventListenerProperties {
  implicit lazy val comAdobeCqSocialScoringImplScoringEventListenerPropertiesJsonFormat: Format[ComAdobeCqSocialScoringImplScoringEventListenerProperties] = Json.format[ComAdobeCqSocialScoringImplScoringEventListenerProperties]
}

