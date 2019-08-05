package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo._

case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoCodecJson: CodecJson[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = CodecJson.derive[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo]
  implicit val OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoDecoder: EntityDecoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = jsonOf[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo]
  implicit val OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoEncoder: EntityEncoder[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = jsonEncoderOf[OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo]
}
