package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventImplJobsJobConsumerManagerInfo._

case class OrgApacheSlingEventImplJobsJobConsumerManagerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEventImplJobsJobConsumerManagerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEventImplJobsJobConsumerManagerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventImplJobsJobConsumerManagerInfoCodecJson: CodecJson[OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = CodecJson.derive[OrgApacheSlingEventImplJobsJobConsumerManagerInfo]
  implicit val OrgApacheSlingEventImplJobsJobConsumerManagerInfoDecoder: EntityDecoder[OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = jsonOf[OrgApacheSlingEventImplJobsJobConsumerManagerInfo]
  implicit val OrgApacheSlingEventImplJobsJobConsumerManagerInfoEncoder: EntityEncoder[OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = jsonEncoderOf[OrgApacheSlingEventImplJobsJobConsumerManagerInfo]
}
