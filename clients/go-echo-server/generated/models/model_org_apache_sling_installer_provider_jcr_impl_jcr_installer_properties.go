package models

type OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties struct {

	HandlerSchemes ConfigNodePropertyArray `json:"handler.schemes,omitempty"`

	SlingJcrinstallFolderNameRegexp ConfigNodePropertyString `json:"sling.jcrinstall.folder.name.regexp,omitempty"`

	SlingJcrinstallFolderMaxDepth ConfigNodePropertyInteger `json:"sling.jcrinstall.folder.max.depth,omitempty"`

	SlingJcrinstallSearchPath ConfigNodePropertyArray `json:"sling.jcrinstall.search.path,omitempty"`

	SlingJcrinstallNewConfigPath ConfigNodePropertyString `json:"sling.jcrinstall.new.config.path,omitempty"`

	SlingJcrinstallSignalPath ConfigNodePropertyString `json:"sling.jcrinstall.signal.path,omitempty"`

	SlingJcrinstallEnableWriteback ConfigNodePropertyBoolean `json:"sling.jcrinstall.enable.writeback,omitempty"`
}
