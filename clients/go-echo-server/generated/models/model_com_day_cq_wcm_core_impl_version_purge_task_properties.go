package models

type ComDayCqWcmCoreImplVersionPurgeTaskProperties struct {

	VersionpurgePaths ConfigNodePropertyArray `json:"versionpurge.paths,omitempty"`

	VersionpurgeRecursive ConfigNodePropertyBoolean `json:"versionpurge.recursive,omitempty"`

	VersionpurgeMaxVersions ConfigNodePropertyInteger `json:"versionpurge.maxVersions,omitempty"`

	VersionpurgeMinVersions ConfigNodePropertyInteger `json:"versionpurge.minVersions,omitempty"`

	VersionpurgeMaxAgeDays ConfigNodePropertyInteger `json:"versionpurge.maxAgeDays,omitempty"`
}
