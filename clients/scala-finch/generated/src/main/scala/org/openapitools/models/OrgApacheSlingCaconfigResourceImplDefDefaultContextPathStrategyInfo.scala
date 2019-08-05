package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo {
    /**
     * Creates the codec for converting OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo] = deriveEncoder
}
