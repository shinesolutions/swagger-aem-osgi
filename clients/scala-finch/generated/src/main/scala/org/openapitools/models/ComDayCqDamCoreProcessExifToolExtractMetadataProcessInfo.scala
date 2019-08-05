package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 */
case class ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties]
                )

object ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo {
    /**
     * Creates the codec for converting ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo] = deriveEncoder
}
