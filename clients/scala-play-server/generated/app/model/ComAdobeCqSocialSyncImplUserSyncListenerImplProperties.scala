package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialSyncImplUserSyncListenerImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialSyncImplUserSyncListenerImplProperties(
  nodetypes: Option[ConfigNodePropertyArray],
  ignorableprops: Option[ConfigNodePropertyArray],
  ignorablenodes: Option[ConfigNodePropertyArray],
  enabled: Option[ConfigNodePropertyBoolean],
  distfolders: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialSyncImplUserSyncListenerImplProperties {
  implicit lazy val comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesJsonFormat: Format[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties] = Json.format[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties]
}

