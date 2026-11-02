package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties(
  automoderationSequence: Option[ConfigNodePropertyArray],
  automoderationOnfailurestop: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties {
  implicit lazy val comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesJsonFormat: Format[ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties] = Json.format[ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties]
}

