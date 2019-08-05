package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties

/**
 * 
 * @param pid 
 * @param title 
 * @param description 
 * @param properties 
 * @param bundleUnderscorelocation 
 * @param serviceUnderscorelocation 
 */
case class ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo(pid: Option[String],
                title: Option[String],
                description: Option[String],
                properties: Option[ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties],
                bundleUnderscorelocation: Option[String],
                serviceUnderscorelocation: Option[String]
                )

object ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo {
    /**
     * Creates the codec for converting ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo from and to JSON.
     */
    implicit val decoder: Decoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = deriveDecoder
    implicit val encoder: ObjectEncoder[ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = deriveEncoder
}
