package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDeserfwImplDeserializationFirewallImplInfo._

case class ComAdobeCqDeserfwImplDeserializationFirewallImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDeserfwImplDeserializationFirewallImplProperties])

object ComAdobeCqDeserfwImplDeserializationFirewallImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDeserfwImplDeserializationFirewallImplInfoCodecJson: CodecJson[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = CodecJson.derive[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo]
  implicit val ComAdobeCqDeserfwImplDeserializationFirewallImplInfoDecoder: EntityDecoder[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = jsonOf[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo]
  implicit val ComAdobeCqDeserfwImplDeserializationFirewallImplInfoEncoder: EntityEncoder[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = jsonEncoderOf[ComAdobeCqDeserfwImplDeserializationFirewallImplInfo]
}
