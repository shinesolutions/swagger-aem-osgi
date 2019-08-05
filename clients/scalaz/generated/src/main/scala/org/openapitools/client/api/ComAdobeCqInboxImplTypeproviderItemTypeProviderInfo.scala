package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo._

case class ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties])

object ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqInboxImplTypeproviderItemTypeProviderInfoCodecJson: CodecJson[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = CodecJson.derive[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo]
  implicit val ComAdobeCqInboxImplTypeproviderItemTypeProviderInfoDecoder: EntityDecoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = jsonOf[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo]
  implicit val ComAdobeCqInboxImplTypeproviderItemTypeProviderInfoEncoder: EntityEncoder[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = jsonEncoderOf[ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo]
}
