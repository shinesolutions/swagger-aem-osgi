package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties

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
case class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties],
                additionalProperties: Option[String],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo {
    /**
     * Creates the codec for converting ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo] = deriveEncoder
}
