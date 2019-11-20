package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingHapiImplHApiUtilImplProperties._

case class OrgApacheSlingHapiImplHApiUtilImplProperties (
  orgApacheSlingHapiToolsResourcetype: Option[ConfigNodePropertyString],
orgApacheSlingHapiToolsCollectionresourcetype: Option[ConfigNodePropertyString],
orgApacheSlingHapiToolsSearchpaths: Option[ConfigNodePropertyArray],
orgApacheSlingHapiToolsExternalurl: Option[ConfigNodePropertyString],
orgApacheSlingHapiToolsEnabled: Option[ConfigNodePropertyBoolean])

object OrgApacheSlingHapiImplHApiUtilImplProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingHapiImplHApiUtilImplPropertiesCodecJson: CodecJson[OrgApacheSlingHapiImplHApiUtilImplProperties] = CodecJson.derive[OrgApacheSlingHapiImplHApiUtilImplProperties]
  implicit val OrgApacheSlingHapiImplHApiUtilImplPropertiesDecoder: EntityDecoder[OrgApacheSlingHapiImplHApiUtilImplProperties] = jsonOf[OrgApacheSlingHapiImplHApiUtilImplProperties]
  implicit val OrgApacheSlingHapiImplHApiUtilImplPropertiesEncoder: EntityEncoder[OrgApacheSlingHapiImplHApiUtilImplProperties] = jsonEncoderOf[OrgApacheSlingHapiImplHApiUtilImplProperties]
}