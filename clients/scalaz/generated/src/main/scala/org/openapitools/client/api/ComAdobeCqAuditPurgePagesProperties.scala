package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAuditPurgePagesProperties._

case class ComAdobeCqAuditPurgePagesProperties (
  auditlogRuleName: Option[ConfigNodePropertyString],
auditlogRuleContentpath: Option[ConfigNodePropertyString],
auditlogRuleMinimumage: Option[ConfigNodePropertyInteger],
auditlogRuleTypes: Option[ConfigNodePropertyDropDown])

object ComAdobeCqAuditPurgePagesProperties {
  import DateTimeCodecs._

  implicit val ComAdobeCqAuditPurgePagesPropertiesCodecJson: CodecJson[ComAdobeCqAuditPurgePagesProperties] = CodecJson.derive[ComAdobeCqAuditPurgePagesProperties]
  implicit val ComAdobeCqAuditPurgePagesPropertiesDecoder: EntityDecoder[ComAdobeCqAuditPurgePagesProperties] = jsonOf[ComAdobeCqAuditPurgePagesProperties]
  implicit val ComAdobeCqAuditPurgePagesPropertiesEncoder: EntityEncoder[ComAdobeCqAuditPurgePagesProperties] = jsonEncoderOf[ComAdobeCqAuditPurgePagesProperties]
}
