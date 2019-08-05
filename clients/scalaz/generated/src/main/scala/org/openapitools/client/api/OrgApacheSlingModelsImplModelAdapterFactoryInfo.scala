package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingModelsImplModelAdapterFactoryInfo._

case class OrgApacheSlingModelsImplModelAdapterFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingModelsImplModelAdapterFactoryProperties])

object OrgApacheSlingModelsImplModelAdapterFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingModelsImplModelAdapterFactoryInfoCodecJson: CodecJson[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = CodecJson.derive[OrgApacheSlingModelsImplModelAdapterFactoryInfo]
  implicit val OrgApacheSlingModelsImplModelAdapterFactoryInfoDecoder: EntityDecoder[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = jsonOf[OrgApacheSlingModelsImplModelAdapterFactoryInfo]
  implicit val OrgApacheSlingModelsImplModelAdapterFactoryInfoEncoder: EntityEncoder[OrgApacheSlingModelsImplModelAdapterFactoryInfo] = jsonEncoderOf[OrgApacheSlingModelsImplModelAdapterFactoryInfo]
}
