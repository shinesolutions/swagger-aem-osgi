package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgeDamProperties._

case class ComAdobeCqAuditPurgeDamProperties (
  auditlogRuleName: Option[ConfigNodePropertyString],
auditlogRuleContentpath: Option[ConfigNodePropertyString],
auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
auditlogRuleTypes: Option[ConfigNodePropertyDropDown])

object ComAdobeCqAuditPurgeDamProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgeDamPropertiesCodecJson: CodecJson[ComAdobeCqAuditPurgeDamProperties] = CodecJson.derive[ComAdobeCqAuditPurgeDamProperties]
  implicit val ComAdobeCqAuditPurgeDamPropertiesDecoder: EntityDecoder[ComAdobeCqAuditPurgeDamProperties] = jsonOf[ComAdobeCqAuditPurgeDamProperties]
  implicit val ComAdobeCqAuditPurgeDamPropertiesEncoder: EntityEncoder[ComAdobeCqAuditPurgeDamProperties] = jsonEncoderOf[ComAdobeCqAuditPurgeDamProperties]
}
