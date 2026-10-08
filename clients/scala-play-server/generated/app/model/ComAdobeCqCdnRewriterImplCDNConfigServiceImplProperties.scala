package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(
  cdnConfigDistributionDomain: Option[ConfigNodePropertyString],
  cdnConfigEnableRewriting: Option[ConfigNodePropertyBoolean],
  cdnConfigPathPrefixes: Option[ConfigNodePropertyArray],
  cdnConfigCdnttl: Option[ConfigNodePropertyInteger],
  cdnConfigApplicationProtocol: Option[ConfigNodePropertyString]
)

object ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
  implicit lazy val comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesJsonFormat: Format[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties] = Json.format[ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties]
}

