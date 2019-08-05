package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo._

case class ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties])

object ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoCodecJson: CodecJson[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo] = CodecJson.derive[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo]
  implicit val ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoDecoder: EntityDecoder[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo] = jsonOf[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo]
  implicit val ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfoEncoder: EntityEncoder[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo] = jsonEncoderOf[ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo]
}
