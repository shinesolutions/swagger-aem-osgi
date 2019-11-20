package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo._

case class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties])

object ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoCodecJson: CodecJson[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = CodecJson.derive[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo]
  implicit val ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoDecoder: EntityDecoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = jsonOf[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo]
  implicit val ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoEncoder: EntityEncoder[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = jsonEncoderOf[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo]
}