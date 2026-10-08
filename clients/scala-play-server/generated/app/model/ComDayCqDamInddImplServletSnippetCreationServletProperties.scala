package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamInddImplServletSnippetCreationServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamInddImplServletSnippetCreationServletProperties(
  snippetcreationMaxcollections: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamInddImplServletSnippetCreationServletProperties {
  implicit lazy val comDayCqDamInddImplServletSnippetCreationServletPropertiesJsonFormat: Format[ComDayCqDamInddImplServletSnippetCreationServletProperties] = Json.format[ComDayCqDamInddImplServletSnippetCreationServletProperties]
}

