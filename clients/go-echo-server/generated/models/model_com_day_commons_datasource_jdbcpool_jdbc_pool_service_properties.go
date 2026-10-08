package models

type ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties struct {

	JdbcDriverClass ConfigNodePropertyString `json:"jdbc.driver.class,omitempty"`

	JdbcConnectionUri ConfigNodePropertyString `json:"jdbc.connection.uri,omitempty"`

	JdbcUsername ConfigNodePropertyString `json:"jdbc.username,omitempty"`

	JdbcPassword ConfigNodePropertyString `json:"jdbc.password,omitempty"`

	JdbcValidationQuery ConfigNodePropertyString `json:"jdbc.validation.query,omitempty"`

	DefaultReadonly ConfigNodePropertyBoolean `json:"default.readonly,omitempty"`

	DefaultAutocommit ConfigNodePropertyBoolean `json:"default.autocommit,omitempty"`

	PoolSize ConfigNodePropertyInteger `json:"pool.size,omitempty"`

	PoolMaxWaitMsec ConfigNodePropertyInteger `json:"pool.max.wait.msec,omitempty"`

	DatasourceName ConfigNodePropertyString `json:"datasource.name,omitempty"`

	DatasourceSvcProperties ConfigNodePropertyArray `json:"datasource.svc.properties,omitempty"`
}
