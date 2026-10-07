package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(
  solrZkTimeout: Option[ConfigNodePropertyString],
  solrCommit: Option[ConfigNodePropertyString],
  cacheOn: Option[ConfigNodePropertyBoolean],
  concurrencyLevel: Option[ConfigNodePropertyInteger],
  cacheStartSize: Option[ConfigNodePropertyInteger],
  cacheTtl: Option[ConfigNodePropertyInteger],
  cacheSize: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties {
  implicit lazy val comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesJsonFormat: Format[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties] = Json.format[ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties]
}

