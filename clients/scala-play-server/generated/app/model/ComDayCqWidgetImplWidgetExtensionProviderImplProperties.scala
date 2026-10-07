package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWidgetImplWidgetExtensionProviderImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWidgetImplWidgetExtensionProviderImplProperties(
  extendableWidgets: Option[ConfigNodePropertyArray],
  widgetextensionproviderDebug: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
  implicit lazy val comDayCqWidgetImplWidgetExtensionProviderImplPropertiesJsonFormat: Format[ComDayCqWidgetImplWidgetExtensionProviderImplProperties] = Json.format[ComDayCqWidgetImplWidgetExtensionProviderImplProperties]
}

