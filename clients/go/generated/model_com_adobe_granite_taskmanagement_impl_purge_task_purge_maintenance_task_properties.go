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

type ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties struct {
	PurgeCompleted ConfigNodePropertyBoolean `json:"purgeCompleted,omitempty"`
	CompletedAge ConfigNodePropertyInteger `json:"completedAge,omitempty"`
	PurgeActive ConfigNodePropertyBoolean `json:"purgeActive,omitempty"`
	ActiveAge ConfigNodePropertyInteger `json:"activeAge,omitempty"`
	SaveThreshold ConfigNodePropertyInteger `json:"saveThreshold,omitempty"`
}