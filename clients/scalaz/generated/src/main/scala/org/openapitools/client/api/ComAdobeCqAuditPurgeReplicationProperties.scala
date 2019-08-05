package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgeReplicationProperties._

case class ComAdobeCqAuditPurgeReplicationProperties (
  auditlogRuleName: Option[ConfigNodePropertyString],
auditlogRuleContentpath: Option[ConfigNodePropertyString],
auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
auditlogRuleTypes: Option[ConfigNodePropertyDropDown])

object ComAdobeCqAuditPurgeReplicationProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgeReplicationPropertiesCodecJson: CodecJson[ComAdobeCqAuditPurgeReplicationProperties] = CodecJson.derive[ComAdobeCqAuditPurgeReplicationProperties]
  implicit val ComAdobeCqAuditPurgeReplicationPropertiesDecoder: EntityDecoder[ComAdobeCqAuditPurgeReplicationProperties] = jsonOf[ComAdobeCqAuditPurgeReplicationProperties]
  implicit val ComAdobeCqAuditPurgeReplicationPropertiesEncoder: EntityEncoder[ComAdobeCqAuditPurgeReplicationProperties] = jsonEncoderOf[ComAdobeCqAuditPurgeReplicationProperties]
}
