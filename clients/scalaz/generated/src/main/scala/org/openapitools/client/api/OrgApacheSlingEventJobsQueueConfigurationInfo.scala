package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventJobsQueueConfigurationInfo._

case class OrgApacheSlingEventJobsQueueConfigurationInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEventJobsQueueConfigurationProperties])

object OrgApacheSlingEventJobsQueueConfigurationInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventJobsQueueConfigurationInfoCodecJson: CodecJson[OrgApacheSlingEventJobsQueueConfigurationInfo] = CodecJson.derive[OrgApacheSlingEventJobsQueueConfigurationInfo]
  implicit val OrgApacheSlingEventJobsQueueConfigurationInfoDecoder: EntityDecoder[OrgApacheSlingEventJobsQueueConfigurationInfo] = jsonOf[OrgApacheSlingEventJobsQueueConfigurationInfo]
  implicit val OrgApacheSlingEventJobsQueueConfigurationInfoEncoder: EntityEncoder[OrgApacheSlingEventJobsQueueConfigurationInfo] = jsonEncoderOf[OrgApacheSlingEventJobsQueueConfigurationInfo]
}
