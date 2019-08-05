package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingXssImplXSSFilterImplProperties._

case class OrgApacheSlingXssImplXSSFilterImplProperties (
  policyPath: Option[ConfigNodePropertyString])

object OrgApacheSlingXssImplXSSFilterImplProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingXssImplXSSFilterImplPropertiesCodecJson: CodecJson[OrgApacheSlingXssImplXSSFilterImplProperties] = CodecJson.derive[OrgApacheSlingXssImplXSSFilterImplProperties]
  implicit val OrgApacheSlingXssImplXSSFilterImplPropertiesDecoder: EntityDecoder[OrgApacheSlingXssImplXSSFilterImplProperties] = jsonOf[OrgApacheSlingXssImplXSSFilterImplProperties]
  implicit val OrgApacheSlingXssImplXSSFilterImplPropertiesEncoder: EntityEncoder[OrgApacheSlingXssImplXSSFilterImplProperties] = jsonEncoderOf[OrgApacheSlingXssImplXSSFilterImplProperties]
}
