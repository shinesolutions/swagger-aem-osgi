/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * API version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type ComAdobeCqDamMacSyncImplDamSyncServiceImplProperties struct {
	ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths ConfigNodePropertyArray `json:"com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths,omitempty"`
	ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions ConfigNodePropertyBoolean `json:"com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions,omitempty"`
	ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs ConfigNodePropertyInteger `json:"com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms,omitempty"`
	ComAdobeCqDamMacSyncDamsyncservicePlatform ConfigNodePropertyDropDown `json:"com.adobe.cq.dam.mac.sync.damsyncservice.platform,omitempty"`
}