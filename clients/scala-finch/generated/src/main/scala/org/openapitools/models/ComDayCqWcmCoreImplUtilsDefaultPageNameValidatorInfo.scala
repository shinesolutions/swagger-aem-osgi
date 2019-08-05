package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties]
                )

object ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = deriveEncoder
}
