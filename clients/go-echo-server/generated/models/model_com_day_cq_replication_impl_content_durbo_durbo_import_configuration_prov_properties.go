package models

type ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties struct {

	PreserveHierarchyNodes ConfigNodePropertyBoolean `json:"preserve.hierarchy.nodes,omitempty"`

	IgnoreVersioning ConfigNodePropertyBoolean `json:"ignore.versioning,omitempty"`

	ImportAcl ConfigNodePropertyBoolean `json:"import.acl,omitempty"`

	SaveThreshold ConfigNodePropertyInteger `json:"save.threshold,omitempty"`

	PreserveUserPaths ConfigNodePropertyBoolean `json:"preserve.user.paths,omitempty"`

	PreserveUuid ConfigNodePropertyBoolean `json:"preserve.uuid,omitempty"`

	PreserveUuidNodetypes ConfigNodePropertyArray `json:"preserve.uuid.nodetypes,omitempty"`

	PreserveUuidSubtrees ConfigNodePropertyArray `json:"preserve.uuid.subtrees,omitempty"`

	AutoCommit ConfigNodePropertyBoolean `json:"auto.commit,omitempty"`
}
