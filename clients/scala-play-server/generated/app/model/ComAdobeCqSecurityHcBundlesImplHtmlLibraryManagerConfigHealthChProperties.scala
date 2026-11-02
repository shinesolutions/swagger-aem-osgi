package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties(
  hcTags: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties {
  implicit lazy val comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesJsonFormat: Format[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties] = Json.format[ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties]
}

