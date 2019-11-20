package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties._

case class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties (
  schedulerExpression: Option[ConfigNodePropertyString],
schedulerConcurrent: Option[ConfigNodePropertyBoolean],
chunkCleanupAge: Option[ConfigNodePropertyInteger])

object OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesCodecJson: CodecJson[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = CodecJson.derive[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties]
  implicit val OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesDecoder: EntityDecoder[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = jsonOf[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties]
  implicit val OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesEncoder: EntityEncoder[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties] = jsonEncoderOf[OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties]
}