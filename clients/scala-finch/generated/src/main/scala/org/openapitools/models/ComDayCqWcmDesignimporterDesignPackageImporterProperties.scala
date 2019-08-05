package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConfigNodePropertyArray

/**
 * 
 * @param extractPeriodfilter 
 */
case class ComDayCqWcmDesignimporterDesignPackageImporterProperties(extractPeriodfilter: Option[ConfigNodePropertyArray]
                )

object ComDayCqWcmDesignimporterDesignPackageImporterProperties {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterDesignPackageImporterProperties from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterDesignPackageImporterProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterDesignPackageImporterProperties] = deriveEncoder
}
