package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyInteger

/**
 * 
 * @param maxPeriodsize 
 */
case class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(maxPeriodsize: Option[ConfigNodePropertyInteger]
                )

object OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {
    /**
     * Creates the codec for converting OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties from and to JSON.
     */
    implicit val decoder: Decoder[OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties] = deriveEncoder
}
