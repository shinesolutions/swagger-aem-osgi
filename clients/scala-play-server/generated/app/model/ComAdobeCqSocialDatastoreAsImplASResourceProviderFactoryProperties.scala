package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties(
  versionId: Option[ConfigNodePropertyString],
  cacheOn: Option[ConfigNodePropertyBoolean],
  concurrencyLevel: Option[ConfigNodePropertyInteger],
  cacheStartSize: Option[ConfigNodePropertyInteger],
  cacheTtl: Option[ConfigNodePropertyInteger],
  cacheSize: Option[ConfigNodePropertyInteger],
  timeLimit: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {
  implicit lazy val comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesJsonFormat: Format[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties] = Json.format[ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties]
}

