package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties(
  cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceHttpReadtimeoutName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceHttpMaxretrycountName: Option[ConfigNodePropertyInteger],
  cqDamS7damVideoproxyclientserviceUploadprogressIntervalName: Option[ConfigNodePropertyInteger]
)

object ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {
  implicit lazy val comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesJsonFormat: Format[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties] = Json.format[ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties]
}

