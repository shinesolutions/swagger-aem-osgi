package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties(
  maxRetry: Option[ConfigNodePropertyInteger],
  fieldWhitelist: Option[ConfigNodePropertyArray],
  attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties {
  implicit lazy val comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesJsonFormat: Format[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties] = Json.format[ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties]
}

