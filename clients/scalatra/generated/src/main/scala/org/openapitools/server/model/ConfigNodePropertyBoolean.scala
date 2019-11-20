/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class ConfigNodePropertyBoolean(
  /* property name */
  name: Option[String],

  /* True if optional */
  optional: Option[Boolean],

  /* True if property is set */
  isUnderscoreset: Option[Boolean],

  /* Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String) */
  `type`: Option[Int],

  /* Property value */
  value: Option[Boolean],

  /* Property description */
  description: Option[String]

 )