package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties]
                )

object ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo] = deriveEncoder
}
