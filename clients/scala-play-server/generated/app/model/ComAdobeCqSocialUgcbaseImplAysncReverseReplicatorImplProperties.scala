package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties(
  poolSize: Option[ConfigNodePropertyInteger],
  maxPoolSize: Option[ConfigNodePropertyInteger],
  queueSize: Option[ConfigNodePropertyInteger],
  keepAliveTime: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties {
  implicit lazy val comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesJsonFormat: Format[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties] = Json.format[ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties]
}

