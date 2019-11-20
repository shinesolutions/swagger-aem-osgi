package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties._

case class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties (
  references: Option[ConfigNodePropertyArray])

object OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesCodecJson: CodecJson[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] = CodecJson.derive[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties]
  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesDecoder: EntityDecoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] = jsonOf[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties]
  implicit val OrgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesEncoder: EntityEncoder[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] = jsonEncoderOf[OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties]
}