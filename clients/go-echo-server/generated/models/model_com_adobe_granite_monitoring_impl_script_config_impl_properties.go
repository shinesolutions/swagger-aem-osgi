package models

type ComAdobeGraniteMonitoringImplScriptConfigImplProperties struct {

	ScriptFilename ConfigNodePropertyString `json:"script.filename,omitempty"`

	ScriptDisplay ConfigNodePropertyString `json:"script.display,omitempty"`

	ScriptPath ConfigNodePropertyString `json:"script.path,omitempty"`

	ScriptPlatform ConfigNodePropertyArray `json:"script.platform,omitempty"`

	Interval ConfigNodePropertyInteger `json:"interval,omitempty"`

	Jmxdomain ConfigNodePropertyString `json:"jmxdomain,omitempty"`
}
