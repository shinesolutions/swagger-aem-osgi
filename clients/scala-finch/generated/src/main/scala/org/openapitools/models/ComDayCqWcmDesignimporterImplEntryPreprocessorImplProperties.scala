package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param searchPeriodpattern 
 * @param replacePeriodpattern 
 */
case class ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties(searchPeriodpattern: Option[ConfigNodePropertyString],
                replacePeriodpattern: Option[ConfigNodePropertyString]
                )

object ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties] = deriveEncoder
}
