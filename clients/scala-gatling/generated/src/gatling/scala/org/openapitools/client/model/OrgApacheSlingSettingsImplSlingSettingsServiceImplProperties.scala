
package org.openapitools.client.model


case class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties (
    _slingName: Option[ConfigNodePropertyString],
    _slingDescription: Option[ConfigNodePropertyString]
)
object OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
    def toStringBody(var_slingName: Object, var_slingDescription: Object) =
        s"""
        | {
        | "slingName":$var_slingName,"slingDescription":$var_slingDescription
        | }
        """.stripMargin
}
