package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties]
)

object ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo {
  implicit lazy val comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoJsonFormat: Format[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo] = Json.format[ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo]
}

