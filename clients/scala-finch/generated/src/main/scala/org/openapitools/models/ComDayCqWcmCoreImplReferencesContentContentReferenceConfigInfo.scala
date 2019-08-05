package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties]
                )

object ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo] = deriveEncoder
}
