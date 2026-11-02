package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialSyncImplGroupSyncListenerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties(
  nodetypes: Option[ConfigNodePropertyArray],
  ignorableprops: Option[ConfigNodePropertyArray],
  ignorablenodes: Option[ConfigNodePropertyString],
  enabled: Option[ConfigNodePropertyBoolean],
  distfolders: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {
  implicit lazy val comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesJsonFormat: Format[ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties] = Json.format[ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties]
}

