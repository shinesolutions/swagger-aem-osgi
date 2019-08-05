package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo._

case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoCodecJson: CodecJson[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = CodecJson.derive[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo]
  implicit val OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoDecoder: EntityDecoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = jsonOf[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo]
  implicit val OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoEncoder: EntityEncoder[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = jsonEncoderOf[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo]
}
