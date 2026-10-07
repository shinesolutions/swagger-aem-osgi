package models

type ComAdobeCqAuditPurgeDamProperties struct {

	AuditlogRuleName ConfigNodePropertyString `json:"auditlog.rule.name,omitempty"`

	AuditlogRuleContentpath ConfigNodePropertyString `json:"auditlog.rule.contentpath,omitempty"`

	AuditlogRuleMinimumage ConfigNodePropertyInteger `json:"auditlog.rule.minimumage,omitempty"`

	AuditlogRuleTypes ConfigNodePropertyDropDown `json:"auditlog.rule.types,omitempty"`
}
