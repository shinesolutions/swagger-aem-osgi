package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyBoolean
import org.openapitools.models.ConfigNodePropertyDropDown
import org.openapitools.models.ConfigNodePropertyInteger
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param name 
 * @param minPoolSize 
 * @param maxPoolSize 
 * @param queueSize 
 * @param maxThreadAge 
 * @param keepAliveTime 
 * @param blockPolicy 
 * @param shutdownGraceful 
 * @param daemon 
 * @param shutdownWaitTime 
 * @param priority 
 */
case class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(name: Option[ConfigNodePropertyString],
                minPoolSize: Option[ConfigNodePropertyInteger],
                maxPoolSize: Option[ConfigNodePropertyInteger],
                queueSize: Option[ConfigNodePropertyInteger],
                maxThreadAge: Option[ConfigNodePropertyInteger],
                keepAliveTime: Option[ConfigNodePropertyInteger],
                blockPolicy: Option[ConfigNodePropertyDropDown],
                shutdownGraceful: Option[ConfigNodePropertyBoolean],
                daemon: Option[ConfigNodePropertyBoolean],
                shutdownWaitTime: Option[ConfigNodePropertyInteger],
                priority: Option[ConfigNodePropertyDropDown]
                )

object OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    /**
     * Creates the codec for converting OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties] = deriveEncoder
}
