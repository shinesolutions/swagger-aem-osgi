package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingDiscoveryOakConfigInfo._

case class OrgApacheSlingDiscoveryOakConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingDiscoveryOakConfigProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingDiscoveryOakConfigInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingDiscoveryOakConfigInfoCodecJson: CodecJson[OrgApacheSlingDiscoveryOakConfigInfo] = CodecJson.derive[OrgApacheSlingDiscoveryOakConfigInfo]
  implicit val OrgApacheSlingDiscoveryOakConfigInfoDecoder: EntityDecoder[OrgApacheSlingDiscoveryOakConfigInfo] = jsonOf[OrgApacheSlingDiscoveryOakConfigInfo]
  implicit val OrgApacheSlingDiscoveryOakConfigInfoEncoder: EntityEncoder[OrgApacheSlingDiscoveryOakConfigInfo] = jsonEncoderOf[OrgApacheSlingDiscoveryOakConfigInfo]
}
