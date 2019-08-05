package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheAriesJmxFrameworkStateConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheAriesJmxFrameworkStateConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheAriesJmxFrameworkStateConfigProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheAriesJmxFrameworkStateConfigInfo {
    /**
     * Creates the codec for converting OrgApacheAriesJmxFrameworkStateConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheAriesJmxFrameworkStateConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheAriesJmxFrameworkStateConfigInfo] = deriveEncoder
}
