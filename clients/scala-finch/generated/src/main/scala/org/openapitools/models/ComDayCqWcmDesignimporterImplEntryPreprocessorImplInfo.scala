package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties]
                )

object ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = deriveEncoder
}
