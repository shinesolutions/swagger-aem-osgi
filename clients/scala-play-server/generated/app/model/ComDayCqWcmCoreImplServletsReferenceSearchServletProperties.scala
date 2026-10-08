package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmCoreImplServletsReferenceSearchServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
  referencesearchservletMaxReferencesPerPage: Option[ConfigNodePropertyInteger],
  referencesearchservletMaxPages: Option[ConfigNodePropertyInteger]
)

object ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
  implicit lazy val comDayCqWcmCoreImplServletsReferenceSearchServletPropertiesJsonFormat: Format[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties] = Json.format[ComDayCqWcmCoreImplServletsReferenceSearchServletProperties]
}

