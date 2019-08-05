package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties]
                )

object ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo] = deriveEncoder
}
