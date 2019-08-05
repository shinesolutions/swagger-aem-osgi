package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingHapiImplHApiUtilImplInfo._

case class OrgApacheSlingHapiImplHApiUtilImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingHapiImplHApiUtilImplProperties])

object OrgApacheSlingHapiImplHApiUtilImplInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingHapiImplHApiUtilImplInfoCodecJson: CodecJson[OrgApacheSlingHapiImplHApiUtilImplInfo] = CodecJson.derive[OrgApacheSlingHapiImplHApiUtilImplInfo]
  implicit val OrgApacheSlingHapiImplHApiUtilImplInfoDecoder: EntityDecoder[OrgApacheSlingHapiImplHApiUtilImplInfo] = jsonOf[OrgApacheSlingHapiImplHApiUtilImplInfo]
  implicit val OrgApacheSlingHapiImplHApiUtilImplInfoEncoder: EntityEncoder[OrgApacheSlingHapiImplHApiUtilImplInfo] = jsonEncoderOf[OrgApacheSlingHapiImplHApiUtilImplInfo]
}
