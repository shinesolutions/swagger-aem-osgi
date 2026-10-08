package models

type ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties struct {

	Nodetypes ConfigNodePropertyArray `json:"nodetypes,omitempty"`

	Ignorableprops ConfigNodePropertyArray `json:"ignorableprops,omitempty"`

	Ignorablenodes ConfigNodePropertyString `json:"ignorablenodes,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	Distfolders ConfigNodePropertyString `json:"distfolders,omitempty"`
}
