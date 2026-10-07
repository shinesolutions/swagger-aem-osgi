
package org.openapitools.client.model


case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties (
    _datasourceName: Option[ConfigNodePropertyString],
    _datasourceSvcPropName: Option[ConfigNodePropertyString],
    _datasourceJndiName: Option[ConfigNodePropertyString],
    _jndiProperties: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    def toStringBody(var_datasourceName: Object, var_datasourceSvcPropName: Object, var_datasourceJndiName: Object, var_jndiProperties: Object) =
        s"""
        | {
        | "datasourceName":$var_datasourceName,"datasourceSvcPropName":$var_datasourceSvcPropName,"datasourceJndiName":$var_datasourceJndiName,"jndiProperties":$var_jndiProperties
        | }
        """.stripMargin
}
