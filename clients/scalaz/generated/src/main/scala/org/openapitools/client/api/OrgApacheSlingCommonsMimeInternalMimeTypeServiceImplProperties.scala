package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties._

case class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties (
  mimeTypes: Option[ConfigNodePropertyArray])

object OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesCodecJson: CodecJson[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties] = CodecJson.derive[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties]
  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesDecoder: EntityDecoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties] = jsonOf[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties]
  implicit val OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesEncoder: EntityEncoder[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties] = jsonEncoderOf[OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties]
}