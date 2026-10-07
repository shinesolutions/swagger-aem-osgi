package models

type ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties struct {

	DeletePathRegexps ConfigNodePropertyArray `json:"delete.path.regexps,omitempty"`

	DeleteSql2Query ConfigNodePropertyString `json:"delete.sql2.query,omitempty"`
}
