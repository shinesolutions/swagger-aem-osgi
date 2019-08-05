package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqDamCfmImplComponentComponentConfigImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqDamCfmImplComponentComponentConfigImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqDamCfmImplComponentComponentConfigImplProperties]
                )

object ComAdobeCqDamCfmImplComponentComponentConfigImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqDamCfmImplComponentComponentConfigImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = deriveEncoder
}
