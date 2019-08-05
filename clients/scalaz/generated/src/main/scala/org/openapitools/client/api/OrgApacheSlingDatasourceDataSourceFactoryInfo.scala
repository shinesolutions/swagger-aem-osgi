package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingDatasourceDataSourceFactoryInfo._

case class OrgApacheSlingDatasourceDataSourceFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingDatasourceDataSourceFactoryProperties])

object OrgApacheSlingDatasourceDataSourceFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingDatasourceDataSourceFactoryInfoCodecJson: CodecJson[OrgApacheSlingDatasourceDataSourceFactoryInfo] = CodecJson.derive[OrgApacheSlingDatasourceDataSourceFactoryInfo]
  implicit val OrgApacheSlingDatasourceDataSourceFactoryInfoDecoder: EntityDecoder[OrgApacheSlingDatasourceDataSourceFactoryInfo] = jsonOf[OrgApacheSlingDatasourceDataSourceFactoryInfo]
  implicit val OrgApacheSlingDatasourceDataSourceFactoryInfoEncoder: EntityEncoder[OrgApacheSlingDatasourceDataSourceFactoryInfo] = jsonEncoderOf[OrgApacheSlingDatasourceDataSourceFactoryInfo]
}
