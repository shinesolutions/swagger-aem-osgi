package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties(
  slingServletSelectors: Option[ConfigNodePropertyString],
  slingServletExtensions: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties {
  implicit lazy val comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesJsonFormat: Format[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties] = Json.format[ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties]
}

