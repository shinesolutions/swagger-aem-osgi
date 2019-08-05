package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqCommonsServletsRootMappingServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqCommonsServletsRootMappingServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqCommonsServletsRootMappingServletProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqCommonsServletsRootMappingServletInfo {
    /**
     * Creates the codec for converting ComDayCqCommonsServletsRootMappingServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqCommonsServletsRootMappingServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqCommonsServletsRootMappingServletInfo] = deriveEncoder
}
