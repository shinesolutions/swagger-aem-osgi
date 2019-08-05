package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo._

case class OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties])

object OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoCodecJson: CodecJson[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = CodecJson.derive[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoDecoder: EntityDecoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = jsonOf[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerFactoryConfigInfoEncoder: EntityEncoder[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = jsonEncoderOf[OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo]
}
