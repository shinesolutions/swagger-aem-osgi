package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingSecurityImplReferrerFilterProperties._

case class OrgApacheSlingSecurityImplReferrerFilterProperties (
  allowEmpty: Option[ConfigNodePropertyBoolean],
allowHosts: Option[ConfigNodePropertyArray],
allowHostsRegexp: Option[ConfigNodePropertyArray],
filterMethods: Option[ConfigNodePropertyArray],
excludeAgentsRegexp: Option[ConfigNodePropertyArray])

object OrgApacheSlingSecurityImplReferrerFilterProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingSecurityImplReferrerFilterPropertiesCodecJson: CodecJson[OrgApacheSlingSecurityImplReferrerFilterProperties] = CodecJson.derive[OrgApacheSlingSecurityImplReferrerFilterProperties]
  implicit val OrgApacheSlingSecurityImplReferrerFilterPropertiesDecoder: EntityDecoder[OrgApacheSlingSecurityImplReferrerFilterProperties] = jsonOf[OrgApacheSlingSecurityImplReferrerFilterProperties]
  implicit val OrgApacheSlingSecurityImplReferrerFilterPropertiesEncoder: EntityEncoder[OrgApacheSlingSecurityImplReferrerFilterProperties] = jsonEncoderOf[OrgApacheSlingSecurityImplReferrerFilterProperties]
}
