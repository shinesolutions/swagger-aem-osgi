package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventImplJobsDefaultJobManagerInfo._

case class OrgApacheSlingEventImplJobsDefaultJobManagerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEventImplJobsDefaultJobManagerProperties])

object OrgApacheSlingEventImplJobsDefaultJobManagerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventImplJobsDefaultJobManagerInfoCodecJson: CodecJson[OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = CodecJson.derive[OrgApacheSlingEventImplJobsDefaultJobManagerInfo]
  implicit val OrgApacheSlingEventImplJobsDefaultJobManagerInfoDecoder: EntityDecoder[OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = jsonOf[OrgApacheSlingEventImplJobsDefaultJobManagerInfo]
  implicit val OrgApacheSlingEventImplJobsDefaultJobManagerInfoEncoder: EntityEncoder[OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = jsonEncoderOf[OrgApacheSlingEventImplJobsDefaultJobManagerInfo]
}
