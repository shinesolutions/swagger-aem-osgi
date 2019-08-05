package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqHistoryImplHistoryRequestFilterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeCqHistoryImplHistoryRequestFilterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqHistoryImplHistoryRequestFilterProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqHistoryImplHistoryRequestFilterInfo {
    /**
     * Creates the codec for converting ComAdobeCqHistoryImplHistoryRequestFilterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqHistoryImplHistoryRequestFilterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqHistoryImplHistoryRequestFilterInfo] = deriveEncoder
}
