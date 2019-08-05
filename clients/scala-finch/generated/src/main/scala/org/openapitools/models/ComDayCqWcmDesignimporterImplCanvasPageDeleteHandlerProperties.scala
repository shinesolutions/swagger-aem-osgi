package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param minThreadPoolSize 
 * @param maxThreadPoolSize 
 */
case class ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties(minThreadPoolSize: Option[ConfigNodePropertyInteger],
                maxThreadPoolSize: Option[ConfigNodePropertyInteger]
                )

object ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties] = deriveEncoder
}
