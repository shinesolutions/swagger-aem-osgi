package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingDiscoveryOakConfigProperties._

case class OrgApacheSlingDiscoveryOakConfigProperties (
  connectorPingTimeout: Option[ConfigNodePropertyInteger],
connectorPingInterval: Option[ConfigNodePropertyInteger],
discoveryLiteCheckInterval: Option[ConfigNodePropertyInteger],
clusterSyncServiceTimeout: Option[ConfigNodePropertyInteger],
clusterSyncServiceInterval: Option[ConfigNodePropertyInteger],
enableSyncToken: Option[ConfigNodePropertyBoolean],
minEventDelay: Option[ConfigNodePropertyInteger],
socketConnectTimeout: Option[ConfigNodePropertyInteger],
soTimeout: Option[ConfigNodePropertyInteger],
topologyConnectorUrls: Option[ConfigNodePropertyArray],
topologyConnectorWhitelist: Option[ConfigNodePropertyArray],
autoStopLocalLoopEnabled: Option[ConfigNodePropertyBoolean],
gzipConnectorRequestsEnabled: Option[ConfigNodePropertyBoolean],
hmacEnabled: Option[ConfigNodePropertyBoolean],
enableEncryption: Option[ConfigNodePropertyBoolean],
sharedKey: Option[ConfigNodePropertyString],
hmacSharedKeyTTL: Option[ConfigNodePropertyInteger],
backoffStandbyFactor: Option[ConfigNodePropertyString],
backoffStableFactor: Option[ConfigNodePropertyString])

object OrgApacheSlingDiscoveryOakConfigProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingDiscoveryOakConfigPropertiesCodecJson: CodecJson[OrgApacheSlingDiscoveryOakConfigProperties] = CodecJson.derive[OrgApacheSlingDiscoveryOakConfigProperties]
  implicit val OrgApacheSlingDiscoveryOakConfigPropertiesDecoder: EntityDecoder[OrgApacheSlingDiscoveryOakConfigProperties] = jsonOf[OrgApacheSlingDiscoveryOakConfigProperties]
  implicit val OrgApacheSlingDiscoveryOakConfigPropertiesEncoder: EntityEncoder[OrgApacheSlingDiscoveryOakConfigProperties] = jsonEncoderOf[OrgApacheSlingDiscoveryOakConfigProperties]
}
