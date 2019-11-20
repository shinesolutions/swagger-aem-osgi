package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo._

case class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties])

object OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo {
  import DateTimeCodecs._

  implicit val OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoCodecJson: CodecJson[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = CodecJson.derive[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo]
  implicit val OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoDecoder: EntityDecoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = jsonOf[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo]
  implicit val OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoEncoder: EntityEncoder[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = jsonEncoderOf[OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo]
}