package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialGroupImplGroupServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialGroupImplGroupServiceImplProperties(
  maxWaitTime: Option[ConfigNodePropertyInteger],
  minWaitBetweenRetries: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialGroupImplGroupServiceImplProperties {
  implicit lazy val comAdobeCqSocialGroupImplGroupServiceImplPropertiesJsonFormat: Format[ComAdobeCqSocialGroupImplGroupServiceImplProperties] = Json.format[ComAdobeCqSocialGroupImplGroupServiceImplProperties]
}

