package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param name property name
 * @param optional True if optional
 * @param isUnderscoreset True if property is set
 * @param _type Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @param values Property value
 * @param description Property description
 */
case class ConfigNodePropertyArray(name: Option[String],
                optional: Option[Boolean],
                isUnderscoreset: Option[Boolean],
                _type: Option[Int],
                values: Option[Seq[String]],
                description: Option[String]
                )

object ConfigNodePropertyArray {
    /**
     * Creates the codec for converting ConfigNodePropertyArray from and to JSON.
     */
    implicit val decoder: Decoder[ConfigNodePropertyArray] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConfigNodePropertyArray] = deriveEncoder
}
