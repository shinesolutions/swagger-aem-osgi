package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties]
                )

object ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo] = deriveEncoder
}
