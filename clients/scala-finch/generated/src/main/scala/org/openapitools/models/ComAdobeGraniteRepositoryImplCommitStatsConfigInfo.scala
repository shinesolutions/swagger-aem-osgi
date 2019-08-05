package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComAdobeGraniteRepositoryImplCommitStatsConfigInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeGraniteRepositoryImplCommitStatsConfigProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComAdobeGraniteRepositoryImplCommitStatsConfigInfo {
    /**
     * Creates the codec for converting ComAdobeGraniteRepositoryImplCommitStatsConfigInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = deriveEncoder
}
