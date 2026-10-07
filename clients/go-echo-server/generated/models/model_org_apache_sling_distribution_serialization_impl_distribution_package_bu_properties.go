package models

type OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Type ConfigNodePropertyDropDown `json:"type,omitempty"`

	FormatTarget ConfigNodePropertyString `json:"format.target,omitempty"`

	TempFsFolder ConfigNodePropertyString `json:"tempFsFolder,omitempty"`

	FileThreshold ConfigNodePropertyInteger `json:"fileThreshold,omitempty"`

	MemoryUnit ConfigNodePropertyDropDown `json:"memoryUnit,omitempty"`

	UseOffHeapMemory ConfigNodePropertyBoolean `json:"useOffHeapMemory,omitempty"`

	DigestAlgorithm ConfigNodePropertyDropDown `json:"digestAlgorithm,omitempty"`

	MonitoringQueueSize ConfigNodePropertyInteger `json:"monitoringQueueSize,omitempty"`

	CleanupDelay ConfigNodePropertyInteger `json:"cleanupDelay,omitempty"`

	PackageFilters ConfigNodePropertyArray `json:"package.filters,omitempty"`

	PropertyFilters ConfigNodePropertyArray `json:"property.filters,omitempty"`
}
