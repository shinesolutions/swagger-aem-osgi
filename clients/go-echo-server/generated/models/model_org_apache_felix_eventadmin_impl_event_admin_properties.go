package models

type OrgApacheFelixEventadminImplEventAdminProperties struct {

	OrgApacheFelixEventadminThreadPoolSize ConfigNodePropertyInteger `json:"org.apache.felix.eventadmin.ThreadPoolSize,omitempty"`

	OrgApacheFelixEventadminAsyncToSyncThreadRatio ConfigNodePropertyFloat `json:"org.apache.felix.eventadmin.AsyncToSyncThreadRatio,omitempty"`

	OrgApacheFelixEventadminTimeout ConfigNodePropertyInteger `json:"org.apache.felix.eventadmin.Timeout,omitempty"`

	OrgApacheFelixEventadminRequireTopic ConfigNodePropertyBoolean `json:"org.apache.felix.eventadmin.RequireTopic,omitempty"`

	OrgApacheFelixEventadminIgnoreTimeout ConfigNodePropertyArray `json:"org.apache.felix.eventadmin.IgnoreTimeout,omitempty"`

	OrgApacheFelixEventadminIgnoreTopic ConfigNodePropertyArray `json:"org.apache.felix.eventadmin.IgnoreTopic,omitempty"`
}
