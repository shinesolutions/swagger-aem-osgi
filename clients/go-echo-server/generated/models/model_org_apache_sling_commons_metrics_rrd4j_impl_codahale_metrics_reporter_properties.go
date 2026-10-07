package models

type OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties struct {

	Datasources ConfigNodePropertyArray `json:"datasources,omitempty"`

	Step ConfigNodePropertyInteger `json:"step,omitempty"`

	Archives ConfigNodePropertyArray `json:"archives,omitempty"`

	Path ConfigNodePropertyString `json:"path,omitempty"`
}
