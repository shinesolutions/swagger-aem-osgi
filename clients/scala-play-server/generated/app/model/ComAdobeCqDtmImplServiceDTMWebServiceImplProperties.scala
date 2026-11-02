package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDtmImplServiceDTMWebServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(
  connectionTimeout: Option[ConfigNodePropertyInteger],
  socketTimeout: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {
  implicit lazy val comAdobeCqDtmImplServiceDTMWebServiceImplPropertiesJsonFormat: Format[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties] = Json.format[ComAdobeCqDtmImplServiceDTMWebServiceImplProperties]
}

