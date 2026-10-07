package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties(
  htmllibmanagerTiming: Option[ConfigNodePropertyBoolean],
  htmllibmanagerDebugInitJs: Option[ConfigNodePropertyString],
  htmllibmanagerMinify: Option[ConfigNodePropertyBoolean],
  htmllibmanagerDebug: Option[ConfigNodePropertyBoolean],
  htmllibmanagerGzip: Option[ConfigNodePropertyBoolean],
  htmllibmanagerMaxDataUriSize: Option[ConfigNodePropertyInteger],
  htmllibmanagerMaxage: Option[ConfigNodePropertyInteger],
  htmllibmanagerForceCQUrlInfo: Option[ConfigNodePropertyBoolean],
  htmllibmanagerDefaultthemename: Option[ConfigNodePropertyString],
  htmllibmanagerDefaultuserthemename: Option[ConfigNodePropertyString],
  htmllibmanagerClientmanager: Option[ConfigNodePropertyString],
  htmllibmanagerPathList: Option[ConfigNodePropertyArray],
  htmllibmanagerExcludedPathList: Option[ConfigNodePropertyArray],
  htmllibmanagerProcessorJs: Option[ConfigNodePropertyArray],
  htmllibmanagerProcessorCss: Option[ConfigNodePropertyArray],
  htmllibmanagerLongcachePatterns: Option[ConfigNodePropertyArray],
  htmllibmanagerLongcacheFormat: Option[ConfigNodePropertyString],
  htmllibmanagerUseFileSystemOutputCache: Option[ConfigNodePropertyBoolean],
  htmllibmanagerFileSystemOutputCacheLocation: Option[ConfigNodePropertyString],
  htmllibmanagerDisableReplacement: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
  implicit lazy val comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesJsonFormat: Format[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties] = Json.format[ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties]
}

