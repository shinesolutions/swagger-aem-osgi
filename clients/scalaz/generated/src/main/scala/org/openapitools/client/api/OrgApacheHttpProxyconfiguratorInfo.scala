package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheHttpProxyconfiguratorInfo._

case class OrgApacheHttpProxyconfiguratorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheHttpProxyconfiguratorProperties])

object OrgApacheHttpProxyconfiguratorInfo {
  import DateTimeCodecs._

  implicit val OrgApacheHttpProxyconfiguratorInfoCodecJson: CodecJson[OrgApacheHttpProxyconfiguratorInfo] = CodecJson.derive[OrgApacheHttpProxyconfiguratorInfo]
  implicit val OrgApacheHttpProxyconfiguratorInfoDecoder: EntityDecoder[OrgApacheHttpProxyconfiguratorInfo] = jsonOf[OrgApacheHttpProxyconfiguratorInfo]
  implicit val OrgApacheHttpProxyconfiguratorInfoEncoder: EntityEncoder[OrgApacheHttpProxyconfiguratorInfo] = jsonEncoderOf[OrgApacheHttpProxyconfiguratorInfo]
}
