/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model


case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  intervalSeconds: Option[ConfigNodePropertyInteger] = None,
  commitsPerIntervalThreshold: Option[ConfigNodePropertyInteger] = None,
  maxLocationLength: Option[ConfigNodePropertyInteger] = None,
  maxDetailsShown: Option[ConfigNodePropertyInteger] = None,
  minDetailsPercentage: Option[ConfigNodePropertyInteger] = None,
  threadMatchers: Option[ConfigNodePropertyArray] = None,
  maxGreedyDepth: Option[ConfigNodePropertyInteger] = None,
  greedyStackMatchers: Option[ConfigNodePropertyString] = None,
  stackFilters: Option[ConfigNodePropertyArray] = None,
  stackMatchers: Option[ConfigNodePropertyArray] = None,
  stackCategorizers: Option[ConfigNodePropertyArray] = None,
  stackShorteners: Option[ConfigNodePropertyArray] = None
)
