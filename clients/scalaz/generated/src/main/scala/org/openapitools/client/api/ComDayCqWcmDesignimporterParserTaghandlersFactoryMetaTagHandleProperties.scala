package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties._

case class ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties (
  serviceRanking: Option[ConfigNodePropertyInteger],
tagpattern: Option[ConfigNodePropertyString])

object ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties {
  import DateTimeCodecs._

  implicit val ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlePropertiesCodecJson: CodecJson[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties] = CodecJson.derive[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties]
  implicit val ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlePropertiesDecoder: EntityDecoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties] = jsonOf[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties]
  implicit val ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlePropertiesEncoder: EntityEncoder[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties] = jsonEncoderOf[ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties]
}
