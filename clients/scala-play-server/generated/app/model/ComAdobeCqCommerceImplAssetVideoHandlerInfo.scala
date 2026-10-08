package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCommerceImplAssetVideoHandlerInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCommerceImplAssetVideoHandlerInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComAdobeCqCommerceImplAssetVideoHandlerProperties]
)

object ComAdobeCqCommerceImplAssetVideoHandlerInfo {
  implicit lazy val comAdobeCqCommerceImplAssetVideoHandlerInfoJsonFormat: Format[ComAdobeCqCommerceImplAssetVideoHandlerInfo] = Json.format[ComAdobeCqCommerceImplAssetVideoHandlerInfo]
}

