package models

type OrgApacheSlingSecurityImplContentDispositionFilterProperties struct {

	SlingContentDispositionPaths ConfigNodePropertyArray `json:"sling.content.disposition.paths,omitempty"`

	SlingContentDispositionExcludedPaths ConfigNodePropertyArray `json:"sling.content.disposition.excluded.paths,omitempty"`

	SlingContentDispositionAllPaths ConfigNodePropertyBoolean `json:"sling.content.disposition.all.paths,omitempty"`
}
