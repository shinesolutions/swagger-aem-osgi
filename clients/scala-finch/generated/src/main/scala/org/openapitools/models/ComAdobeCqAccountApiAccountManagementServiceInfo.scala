package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqAccountApiAccountManagementServiceProperties

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
case class ComAdobeCqAccountApiAccountManagementServiceInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqAccountApiAccountManagementServiceProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqAccountApiAccountManagementServiceInfo {
    /**
     * Creates the codec for converting ComAdobeCqAccountApiAccountManagementServiceInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqAccountApiAccountManagementServiceInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqAccountApiAccountManagementServiceInfo] = deriveEncoder
}
