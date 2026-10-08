
package org.openapitools.client.model


case class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties (
    _allowOnlySystemUser: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties {
    def toStringBody(var_allowOnlySystemUser: Object) =
        s"""
        | {
        | "allowOnlySystemUser":$var_allowOnlySystemUser
        | }
        """.stripMargin
}
