package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(
  cqSocialContentFragmentsServicesEnabled: Option[ConfigNodePropertyBoolean],
  cqSocialContentFragmentsServicesWaitTimeSeconds: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
  implicit lazy val comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesJsonFormat: Format[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties] = Json.format[ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties]
}

