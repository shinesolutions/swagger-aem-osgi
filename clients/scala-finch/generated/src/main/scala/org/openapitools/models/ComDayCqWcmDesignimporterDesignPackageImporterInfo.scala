package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqWcmDesignimporterDesignPackageImporterProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqWcmDesignimporterDesignPackageImporterInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqWcmDesignimporterDesignPackageImporterProperties]
                )

object ComDayCqWcmDesignimporterDesignPackageImporterInfo {
    /**
     * Creates the codec for converting ComDayCqWcmDesignimporterDesignPackageImporterInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqWcmDesignimporterDesignPackageImporterInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqWcmDesignimporterDesignPackageImporterInfo] = deriveEncoder
}
