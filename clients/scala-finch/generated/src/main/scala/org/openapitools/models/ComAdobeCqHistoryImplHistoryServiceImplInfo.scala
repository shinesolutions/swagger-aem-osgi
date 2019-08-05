package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqHistoryImplHistoryServiceImplProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param additionalProperties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeCqHistoryImplHistoryServiceImplInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqHistoryImplHistoryServiceImplProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqHistoryImplHistoryServiceImplInfo {
    /**
     * Creates the codec for converting ComAdobeCqHistoryImplHistoryServiceImplInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqHistoryImplHistoryServiceImplInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqHistoryImplHistoryServiceImplInfo] = deriveEncoder
}
