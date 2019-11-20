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

type OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties struct {

	Name *ConfigNodePropertyString `json:"name,omitempty"`

	Type *ConfigNodePropertyDropDown `json:"type,omitempty"`

	FormatTarget *ConfigNodePropertyString `json:"format.target,omitempty"`

	TempFsFolder *ConfigNodePropertyString `json:"tempFsFolder,omitempty"`

	FileThreshold *ConfigNodePropertyInteger `json:"fileThreshold,omitempty"`

	MemoryUnit *ConfigNodePropertyDropDown `json:"memoryUnit,omitempty"`

	UseOffHeapMemory *ConfigNodePropertyBoolean `json:"useOffHeapMemory,omitempty"`

	DigestAlgorithm *ConfigNodePropertyDropDown `json:"digestAlgorithm,omitempty"`

	MonitoringQueueSize *ConfigNodePropertyInteger `json:"monitoringQueueSize,omitempty"`

	CleanupDelay *ConfigNodePropertyInteger `json:"cleanupDelay,omitempty"`

	PackageFilters *ConfigNodePropertyArray `json:"package.filters,omitempty"`

	PropertyFilters *ConfigNodePropertyArray `json:"property.filters,omitempty"`
}