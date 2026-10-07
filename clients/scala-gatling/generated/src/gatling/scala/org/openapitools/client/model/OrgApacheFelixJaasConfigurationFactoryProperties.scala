
package org.openapitools.client.model


case class OrgApacheFelixJaasConfigurationFactoryProperties (
    _jaasControlFlag: Option[ConfigNodePropertyDropDown],
    _jaasRanking: Option[ConfigNodePropertyInteger],
    _jaasRealmName: Option[ConfigNodePropertyString],
    _jaasClassname: Option[ConfigNodePropertyString],
    _jaasOptions: Option[ConfigNodePropertyArray]
)
object OrgApacheFelixJaasConfigurationFactoryProperties {
    def toStringBody(var_jaasControlFlag: Object, var_jaasRanking: Object, var_jaasRealmName: Object, var_jaasClassname: Object, var_jaasOptions: Object) =
        s"""
        | {
        | "jaasControlFlag":$var_jaasControlFlag,"jaasRanking":$var_jaasRanking,"jaasRealmName":$var_jaasRealmName,"jaasClassname":$var_jaasClassname,"jaasOptions":$var_jaasOptions
        | }
        """.stripMargin
}
