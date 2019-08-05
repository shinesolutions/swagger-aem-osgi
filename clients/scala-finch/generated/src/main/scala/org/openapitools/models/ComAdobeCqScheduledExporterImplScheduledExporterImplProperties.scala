package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray
import org.openapitools.models.ConfigNodePropertyString

/**
 * 
 * @param includePeriodpaths 
 * @param exporterPerioduser 
 */
case class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(includePeriodpaths: Option[ConfigNodePropertyArray],
                exporterPerioduser: Option[ConfigNodePropertyString]
                )

object ComAdobeCqScheduledExporterImplScheduledExporterImplProperties {
    /**
     * Creates the codec for converting ComAdobeCqScheduledExporterImplScheduledExporterImplProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComAdobeCqScheduledExporterImplScheduledExporterImplProperties] = deriveEncoder
}
