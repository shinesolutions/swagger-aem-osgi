package models

type OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties struct {

	FelixMemoryusageDumpThreshold ConfigNodePropertyInteger `json:"felix.memoryusage.dump.threshold,omitempty"`

	FelixMemoryusageDumpInterval ConfigNodePropertyInteger `json:"felix.memoryusage.dump.interval,omitempty"`

	FelixMemoryusageDumpLocation ConfigNodePropertyString `json:"felix.memoryusage.dump.location,omitempty"`
}
