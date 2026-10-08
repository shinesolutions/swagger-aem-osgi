
package org.openapitools.client.model


case class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties (
    _references: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {
    def toStringBody(var_references: Object) =
        s"""
        | {
        | "references":$var_references
        | }
        """.stripMargin
}
