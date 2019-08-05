package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqSecurityACLSetupProperties._

case class ComDayCqSecurityACLSetupProperties (
  cqAclsetupRules: Option[ConfigNodePropertyArray])

object ComDayCqSecurityACLSetupProperties {
  import DateTimeCodecs._

  implicit val ComDayCqSecurityACLSetupPropertiesCodecJson: CodecJson[ComDayCqSecurityACLSetupProperties] = CodecJson.derive[ComDayCqSecurityACLSetupProperties]
  implicit val ComDayCqSecurityACLSetupPropertiesDecoder: EntityDecoder[ComDayCqSecurityACLSetupProperties] = jsonOf[ComDayCqSecurityACLSetupProperties]
  implicit val ComDayCqSecurityACLSetupPropertiesEncoder: EntityEncoder[ComDayCqSecurityACLSetupProperties] = jsonEncoderOf[ComDayCqSecurityACLSetupProperties]
}
