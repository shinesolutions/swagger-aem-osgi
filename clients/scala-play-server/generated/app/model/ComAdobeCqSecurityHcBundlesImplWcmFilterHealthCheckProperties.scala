package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties {
  implicit lazy val comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesJsonFormat: Format[ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties] = Json.format[ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties]
}

