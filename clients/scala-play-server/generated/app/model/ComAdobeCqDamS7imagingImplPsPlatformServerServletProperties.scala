package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(
  cacheEnable: Option[ConfigNodePropertyBoolean],
  cacheRootPaths: Option[ConfigNodePropertyArray],
  cacheMaxSize: Option[ConfigNodePropertyInteger],
  cacheMaxEntries: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
  implicit lazy val comAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesJsonFormat: Format[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties] = Json.format[ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties]
}

