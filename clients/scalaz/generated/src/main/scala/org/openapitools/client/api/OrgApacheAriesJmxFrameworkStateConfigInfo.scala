package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheAriesJmxFrameworkStateConfigInfo._

case class OrgApacheAriesJmxFrameworkStateConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheAriesJmxFrameworkStateConfigProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheAriesJmxFrameworkStateConfigInfo {
  import DateTimeCodecs._

  implicit val OrgApacheAriesJmxFrameworkStateConfigInfoCodecJson: CodecJson[OrgApacheAriesJmxFrameworkStateConfigInfo] = CodecJson.derive[OrgApacheAriesJmxFrameworkStateConfigInfo]
  implicit val OrgApacheAriesJmxFrameworkStateConfigInfoDecoder: EntityDecoder[OrgApacheAriesJmxFrameworkStateConfigInfo] = jsonOf[OrgApacheAriesJmxFrameworkStateConfigInfo]
  implicit val OrgApacheAriesJmxFrameworkStateConfigInfoEncoder: EntityEncoder[OrgApacheAriesJmxFrameworkStateConfigInfo] = jsonEncoderOf[OrgApacheAriesJmxFrameworkStateConfigInfo]
}
