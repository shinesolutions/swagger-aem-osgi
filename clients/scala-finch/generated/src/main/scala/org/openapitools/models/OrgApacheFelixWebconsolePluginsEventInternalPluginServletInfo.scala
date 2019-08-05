package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties]
                )

object OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo {
    /**
     * Creates the codec for converting OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo] = deriveEncoder
}
