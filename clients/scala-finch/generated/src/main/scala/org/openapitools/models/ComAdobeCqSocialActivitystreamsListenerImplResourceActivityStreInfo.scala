package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo {
    /**
     * Creates the codec for converting ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo] = deriveEncoder
}
