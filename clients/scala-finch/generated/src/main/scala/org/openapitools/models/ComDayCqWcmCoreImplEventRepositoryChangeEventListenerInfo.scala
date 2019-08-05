package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties]
                )

object ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo] = deriveEncoder
}
