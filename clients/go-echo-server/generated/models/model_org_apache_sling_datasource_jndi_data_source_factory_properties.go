package models

type OrgApacheSlingDatasourceJndiDataSourceFactoryProperties struct {

	DatasourceName ConfigNodePropertyString `json:"datasource.name,omitempty"`

	DatasourceSvcPropName ConfigNodePropertyString `json:"datasource.svc.prop.name,omitempty"`

	DatasourceJndiName ConfigNodePropertyString `json:"datasource.jndi.name,omitempty"`

	JndiProperties ConfigNodePropertyArray `json:"jndi.properties,omitempty"`
}
