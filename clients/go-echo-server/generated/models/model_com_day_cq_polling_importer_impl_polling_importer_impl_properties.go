package models

type ComDayCqPollingImporterImplPollingImporterImplProperties struct {

	ImporterMinInterval ConfigNodePropertyInteger `json:"importer.min.interval,omitempty"`

	ImporterUser ConfigNodePropertyString `json:"importer.user,omitempty"`

	ExcludePaths ConfigNodePropertyArray `json:"exclude.paths,omitempty"`

	IncludePaths ConfigNodePropertyArray `json:"include.paths,omitempty"`
}
