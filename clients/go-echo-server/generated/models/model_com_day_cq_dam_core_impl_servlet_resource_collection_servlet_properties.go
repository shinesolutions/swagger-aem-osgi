package models

type ComDayCqDamCoreImplServletResourceCollectionServletProperties struct {

	SlingServletResourceTypes ConfigNodePropertyArray `json:"sling.servlet.resourceTypes,omitempty"`

	SlingServletMethods ConfigNodePropertyString `json:"sling.servlet.methods,omitempty"`

	SlingServletSelectors ConfigNodePropertyString `json:"sling.servlet.selectors,omitempty"`

	DownloadConfig ConfigNodePropertyString `json:"download.config,omitempty"`

	ViewSelector ConfigNodePropertyString `json:"view.selector,omitempty"`

	SendEmail ConfigNodePropertyBoolean `json:"send_email,omitempty"`
}
