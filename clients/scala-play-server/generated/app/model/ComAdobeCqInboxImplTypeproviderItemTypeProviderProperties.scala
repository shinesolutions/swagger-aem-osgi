package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
  inboxImplTypeproviderRegistrypaths: Option[ConfigNodePropertyArray],
  inboxImplTypeproviderLegacypaths: Option[ConfigNodePropertyArray],
  inboxImplTypeproviderDefaulturlFailureitem: Option[ConfigNodePropertyString],
  inboxImplTypeproviderDefaulturlWorkitem: Option[ConfigNodePropertyString],
  inboxImplTypeproviderDefaulturlTask: Option[ConfigNodePropertyString]
)

object ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
  implicit lazy val comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesJsonFormat: Format[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties] = Json.format[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties]
}

