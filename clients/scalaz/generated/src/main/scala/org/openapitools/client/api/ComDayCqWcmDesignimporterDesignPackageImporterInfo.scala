package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmDesignimporterDesignPackageImporterInfo._

case class ComDayCqWcmDesignimporterDesignPackageImporterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmDesignimporterDesignPackageImporterProperties])

object ComDayCqWcmDesignimporterDesignPackageImporterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmDesignimporterDesignPackageImporterInfoCodecJson: CodecJson[ComDayCqWcmDesignimporterDesignPackageImporterInfo] = CodecJson.derive[ComDayCqWcmDesignimporterDesignPackageImporterInfo]
  implicit val ComDayCqWcmDesignimporterDesignPackageImporterInfoDecoder: EntityDecoder[ComDayCqWcmDesignimporterDesignPackageImporterInfo] = jsonOf[ComDayCqWcmDesignimporterDesignPackageImporterInfo]
  implicit val ComDayCqWcmDesignimporterDesignPackageImporterInfoEncoder: EntityEncoder[ComDayCqWcmDesignimporterDesignPackageImporterInfo] = jsonEncoderOf[ComDayCqWcmDesignimporterDesignPackageImporterInfo]
}
