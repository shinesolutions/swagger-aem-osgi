package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheHttpProxyconfiguratorProperties._

case class OrgApacheHttpProxyconfiguratorProperties (
  proxyEnabled: Option[ConfigNodePropertyBoolean],
proxyHost: Option[ConfigNodePropertyString],
proxyPort: Option[ConfigNodePropertyInteger],
proxyUser: Option[ConfigNodePropertyString],
proxyPassword: Option[ConfigNodePropertyString],
proxyExceptions: Option[ConfigNodePropertyArray])

object OrgApacheHttpProxyconfiguratorProperties {
  import DateTimeCodecs._

  implicit val OrgApacheHttpProxyconfiguratorPropertiesCodecJson: CodecJson[OrgApacheHttpProxyconfiguratorProperties] = CodecJson.derive[OrgApacheHttpProxyconfiguratorProperties]
  implicit val OrgApacheHttpProxyconfiguratorPropertiesDecoder: EntityDecoder[OrgApacheHttpProxyconfiguratorProperties] = jsonOf[OrgApacheHttpProxyconfiguratorProperties]
  implicit val OrgApacheHttpProxyconfiguratorPropertiesEncoder: EntityEncoder[OrgApacheHttpProxyconfiguratorProperties] = jsonEncoderOf[OrgApacheHttpProxyconfiguratorProperties]
}
