package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo._

case class OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties])

object OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoCodecJson: CodecJson[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = CodecJson.derive[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo]
  implicit val OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoDecoder: EntityDecoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = jsonOf[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo]
  implicit val OrgApacheSlingDatasourceJNDIDataSourceFactoryInfoEncoder: EntityEncoder[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = jsonEncoderOf[OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo]
}
