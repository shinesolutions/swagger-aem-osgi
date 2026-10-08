package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties(
  name: Option[ConfigNodePropertyString],
  serviceName: Option[ConfigNodePropertyString],
  userId: Option[ConfigNodePropertyString],
  accessTokenProviderTarget: Option[ConfigNodePropertyString]
)

object ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
  implicit lazy val comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesJsonFormat: Format[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties] = Json.format[ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties]
}

