package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties]
                )

object ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = deriveEncoder
}
