package models

type OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Type ConfigNodePropertyDropDown `json:"type,omitempty"`

	ImportMode ConfigNodePropertyString `json:"importMode,omitempty"`

	AclHandling ConfigNodePropertyString `json:"aclHandling,omitempty"`

	PackageRoots ConfigNodePropertyString `json:"package.roots,omitempty"`

	PackageFilters ConfigNodePropertyArray `json:"package.filters,omitempty"`

	PropertyFilters ConfigNodePropertyArray `json:"property.filters,omitempty"`

	TempFsFolder ConfigNodePropertyString `json:"tempFsFolder,omitempty"`

	UseBinaryReferences ConfigNodePropertyBoolean `json:"useBinaryReferences,omitempty"`

	AutoSaveThreshold ConfigNodePropertyInteger `json:"autoSaveThreshold,omitempty"`

	CleanupDelay ConfigNodePropertyInteger `json:"cleanupDelay,omitempty"`

	FileThreshold ConfigNodePropertyInteger `json:"fileThreshold,omitempty"`

	MEGA_BYTES ConfigNodePropertyDropDown `json:"MEGA_BYTES,omitempty"`

	UseOffHeapMemory ConfigNodePropertyBoolean `json:"useOffHeapMemory,omitempty"`

	DigestAlgorithm ConfigNodePropertyDropDown `json:"digestAlgorithm,omitempty"`

	MonitoringQueueSize ConfigNodePropertyInteger `json:"monitoringQueueSize,omitempty"`

	PathsMapping ConfigNodePropertyArray `json:"pathsMapping,omitempty"`

	StrictImport ConfigNodePropertyBoolean `json:"strictImport,omitempty"`
}
