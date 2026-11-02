package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  keypairId: Option[ConfigNodePropertyString],
  keypairAlias: Option[ConfigNodePropertyString],
  cdnrewriterAttributes: Option[ConfigNodePropertyArray],
  cdnRewriterDistributionDomain: Option[ConfigNodePropertyString]
)

object ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {
  implicit lazy val comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesJsonFormat: Format[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties] = Json.format[ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties]
}

