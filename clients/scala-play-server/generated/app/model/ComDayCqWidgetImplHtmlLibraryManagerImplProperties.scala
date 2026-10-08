package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWidgetImplHtmlLibraryManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWidgetImplHtmlLibraryManagerImplProperties(
  htmllibmanagerClientmanager: Option[ConfigNodePropertyString],
  htmllibmanagerDebug: Option[ConfigNodePropertyBoolean],
  htmllibmanagerDebugConsole: Option[ConfigNodePropertyBoolean],
  htmllibmanagerDebugInitJs: Option[ConfigNodePropertyString],
  htmllibmanagerDefaultthemename: Option[ConfigNodePropertyString],
  htmllibmanagerDefaultuserthemename: Option[ConfigNodePropertyString],
  htmllibmanagerFirebuglitePath: Option[ConfigNodePropertyString],
  htmllibmanagerForceCQUrlInfo: Option[ConfigNodePropertyBoolean],
  htmllibmanagerGzip: Option[ConfigNodePropertyBoolean],
  htmllibmanagerMaxage: Option[ConfigNodePropertyInteger],
  htmllibmanagerMaxDataUriSize: Option[ConfigNodePropertyInteger],
  htmllibmanagerMinify: Option[ConfigNodePropertyBoolean],
  htmllibmanagerPathList: Option[ConfigNodePropertyArray],
  htmllibmanagerTiming: Option[ConfigNodePropertyBoolean]
)

object ComDayCqWidgetImplHtmlLibraryManagerImplProperties {
  implicit lazy val comDayCqWidgetImplHtmlLibraryManagerImplPropertiesJsonFormat: Format[ComDayCqWidgetImplHtmlLibraryManagerImplProperties] = Json.format[ComDayCqWidgetImplHtmlLibraryManagerImplProperties]
}

