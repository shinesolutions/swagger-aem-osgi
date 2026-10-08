package models

type ComDayCqWcmCoreImplVersionManagerImplProperties struct {

	VersionmanagerCreateVersionOnActivation ConfigNodePropertyBoolean `json:"versionmanager.createVersionOnActivation,omitempty"`

	VersionmanagerPurgingEnabled ConfigNodePropertyBoolean `json:"versionmanager.purgingEnabled,omitempty"`

	VersionmanagerPurgePaths ConfigNodePropertyArray `json:"versionmanager.purgePaths,omitempty"`

	VersionmanagerIvPaths ConfigNodePropertyArray `json:"versionmanager.ivPaths,omitempty"`

	VersionmanagerMaxAgeDays ConfigNodePropertyInteger `json:"versionmanager.maxAgeDays,omitempty"`

	VersionmanagerMaxNumberVersions ConfigNodePropertyInteger `json:"versionmanager.maxNumberVersions,omitempty"`

	VersionmanagerMinNumberVersions ConfigNodePropertyInteger `json:"versionmanager.minNumberVersions,omitempty"`
}
