package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties]
                )

object ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = deriveEncoder
}
