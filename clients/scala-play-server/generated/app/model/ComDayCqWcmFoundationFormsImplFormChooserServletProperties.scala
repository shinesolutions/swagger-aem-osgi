package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmFoundationFormsImplFormChooserServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmFoundationFormsImplFormChooserServletProperties(
  serviceName: Option[ConfigNodePropertyString],
  slingServletResourceTypes: Option[ConfigNodePropertyString],
  slingServletSelectors: Option[ConfigNodePropertyString],
  slingServletMethods: Option[ConfigNodePropertyArray],
  formsFormchooserservletAdvansesearchRequire: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWcmFoundationFormsImplFormChooserServletProperties {
  implicit lazy val comDayCqWcmFoundationFormsImplFormChooserServletPropertiesJsonFormat: Format[ComDayCqWcmFoundationFormsImplFormChooserServletProperties] = Json.format[ComDayCqWcmFoundationFormsImplFormChooserServletProperties]
}

