package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCommerceImplAssetDynamicImageHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties(
  cqCommerceAssetHandlerActive: Option[ConfigNodePropertyBoolean],
  cqCommerceAssetHandlerName: Option[ConfigNodePropertyString]
)

object ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties {
  implicit lazy val comAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesJsonFormat: Format[ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties] = Json.format[ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties]
}

