package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingI18nImplI18NFilterProperties._

case class OrgApacheSlingI18nImplI18NFilterProperties (
  serviceRanking: Option[ConfigNodePropertyInteger],
slingFilterScope: Option[ConfigNodePropertyArray])

object OrgApacheSlingI18nImplI18NFilterProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingI18nImplI18NFilterPropertiesCodecJson: CodecJson[OrgApacheSlingI18nImplI18NFilterProperties] = CodecJson.derive[OrgApacheSlingI18nImplI18NFilterProperties]
  implicit val OrgApacheSlingI18nImplI18NFilterPropertiesDecoder: EntityDecoder[OrgApacheSlingI18nImplI18NFilterProperties] = jsonOf[OrgApacheSlingI18nImplI18NFilterProperties]
  implicit val OrgApacheSlingI18nImplI18NFilterPropertiesEncoder: EntityEncoder[OrgApacheSlingI18nImplI18NFilterProperties] = jsonEncoderOf[OrgApacheSlingI18nImplI18NFilterProperties]
}
