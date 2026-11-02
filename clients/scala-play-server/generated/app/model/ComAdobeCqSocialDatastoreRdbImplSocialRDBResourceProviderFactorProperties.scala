package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties(
  solrZkTimeout: Option[ConfigNodePropertyString],
  solrCommit: Option[ConfigNodePropertyString],
  cacheOn: Option[ConfigNodePropertyBoolean],
  concurrencyLevel: Option[ConfigNodePropertyInteger],
  cacheStartSize: Option[ConfigNodePropertyInteger],
  cacheTtl: Option[ConfigNodePropertyInteger],
  cacheSize: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties {
  implicit lazy val comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesJsonFormat: Format[ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties] = Json.format[ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties]
}

