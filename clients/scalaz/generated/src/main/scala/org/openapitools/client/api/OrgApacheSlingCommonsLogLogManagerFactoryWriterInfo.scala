package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo._

case class OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties])

object OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoCodecJson: CodecJson[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = CodecJson.derive[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoDecoder: EntityDecoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = jsonOf[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo]
  implicit val OrgApacheSlingCommonsLogLogManagerFactoryWriterInfoEncoder: EntityEncoder[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = jsonEncoderOf[OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo]
}
