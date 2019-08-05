package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamCfmImplConfFeatureConfigImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamCfmImplConfFeatureConfigImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamCfmImplConfFeatureConfigImplProperties]
                )

object ComAdobeCqDamCfmImplConfFeatureConfigImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplConfFeatureConfigImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = deriveEncoder
}
