package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties]
                )

object ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo {
    /**
     * Creates the codec for converting ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo] = deriveEncoder
}
