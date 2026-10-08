package models

type OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties struct {

	ManagerRoot ConfigNodePropertyString `json:"manager.root,omitempty"`

	HttpServiceFilter ConfigNodePropertyString `json:"http.service.filter,omitempty"`

	DefaultRender ConfigNodePropertyString `json:"default.render,omitempty"`

	Realm ConfigNodePropertyString `json:"realm,omitempty"`

	Username ConfigNodePropertyString `json:"username,omitempty"`

	Password ConfigNodePropertyString `json:"password,omitempty"`

	Category ConfigNodePropertyString `json:"category,omitempty"`

	Locale ConfigNodePropertyString `json:"locale,omitempty"`

	Loglevel ConfigNodePropertyDropDown `json:"loglevel,omitempty"`

	Plugins ConfigNodePropertyDropDown `json:"plugins,omitempty"`
}
