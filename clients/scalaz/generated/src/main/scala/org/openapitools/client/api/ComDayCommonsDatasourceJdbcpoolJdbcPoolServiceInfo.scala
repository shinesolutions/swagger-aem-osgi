package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo._

case class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties])

object ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoCodecJson: CodecJson[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo] = CodecJson.derive[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo]
  implicit val ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoDecoder: EntityDecoder[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo] = jsonOf[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo]
  implicit val ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoEncoder: EntityEncoder[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo] = jsonEncoderOf[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo]
}
