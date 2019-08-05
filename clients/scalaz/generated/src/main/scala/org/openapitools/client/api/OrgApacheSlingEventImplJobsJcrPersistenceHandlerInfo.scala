package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo._

case class OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfoCodecJson: CodecJson[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = CodecJson.derive[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo]
  implicit val OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfoDecoder: EntityDecoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = jsonOf[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo]
  implicit val OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfoEncoder: EntityEncoder[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = jsonEncoderOf[OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo]
}
