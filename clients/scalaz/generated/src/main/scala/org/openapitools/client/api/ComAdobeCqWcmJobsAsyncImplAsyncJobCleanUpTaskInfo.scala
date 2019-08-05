package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo._

case class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties])

object ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoCodecJson: CodecJson[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = CodecJson.derive[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo]
  implicit val ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoDecoder: EntityDecoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = jsonOf[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo]
  implicit val ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoEncoder: EntityEncoder[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = jsonEncoderOf[ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo]
}
