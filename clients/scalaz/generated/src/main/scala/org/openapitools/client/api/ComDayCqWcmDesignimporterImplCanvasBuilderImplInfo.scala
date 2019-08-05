package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo._

case class ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties])

object ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmDesignimporterImplCanvasBuilderImplInfoCodecJson: CodecJson[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo] = CodecJson.derive[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo]
  implicit val ComDayCqWcmDesignimporterImplCanvasBuilderImplInfoDecoder: EntityDecoder[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo] = jsonOf[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo]
  implicit val ComDayCqWcmDesignimporterImplCanvasBuilderImplInfoEncoder: EntityEncoder[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo] = jsonEncoderOf[ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo]
}
