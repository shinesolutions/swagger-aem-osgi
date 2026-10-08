package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDtmReactorImplServiceWebServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties(
  endpointUri: Option[ConfigNodePropertyString],
  connectionTimeout: Option[ConfigNodePropertyInteger],
  socketTimeout: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {
  implicit lazy val comAdobeCqDtmReactorImplServiceWebServiceImplPropertiesJsonFormat: Format[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties] = Json.format[ComAdobeCqDtmReactorImplServiceWebServiceImplProperties]
}

