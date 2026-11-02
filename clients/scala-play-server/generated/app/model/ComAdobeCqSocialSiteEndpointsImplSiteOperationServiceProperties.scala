package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties(
  fieldWhitelist: Option[ConfigNodePropertyArray],
  sitePathFilters: Option[ConfigNodePropertyArray],
  sitePackageGroup: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
  implicit lazy val comAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesJsonFormat: Format[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties] = Json.format[ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties]
}

