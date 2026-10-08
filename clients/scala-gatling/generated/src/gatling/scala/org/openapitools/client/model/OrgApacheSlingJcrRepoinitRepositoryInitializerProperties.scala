
package org.openapitools.client.model


case class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties (
    _references: Option[ConfigNodePropertyArray],
    _scripts: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {
    def toStringBody(var_references: Object, var_scripts: Object) =
        s"""
        | {
        | "references":$var_references,"scripts":$var_scripts
        | }
        """.stripMargin
}
