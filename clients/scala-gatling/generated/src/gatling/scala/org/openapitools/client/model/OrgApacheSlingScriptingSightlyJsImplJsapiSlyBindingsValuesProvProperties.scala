
package org.openapitools.client.model


case class OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties (
    _orgApacheSlingScriptingSightlyJsBindings: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties {
    def toStringBody(var_orgApacheSlingScriptingSightlyJsBindings: Object) =
        s"""
        | {
        | "orgApacheSlingScriptingSightlyJsBindings":$var_orgApacheSlingScriptingSightlyJsBindings
        | }
        """.stripMargin
}
