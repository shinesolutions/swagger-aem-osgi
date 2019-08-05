package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo._

case class ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties])

object ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoCodecJson: CodecJson[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = CodecJson.derive[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo]
  implicit val ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoDecoder: EntityDecoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = jsonOf[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo]
  implicit val ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfoEncoder: EntityEncoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = jsonEncoderOf[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo]
}
