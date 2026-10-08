
package org.openapitools.client.model


case class OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties (
    _jasperCompilerTargetVM: Option[ConfigNodePropertyString],
    _jasperCompilerSourceVM: Option[ConfigNodePropertyString],
    _jasperClassdebuginfo: Option[ConfigNodePropertyBoolean],
    _jasperEnablePooling: Option[ConfigNodePropertyBoolean],
    _jasperIeClassId: Option[ConfigNodePropertyString],
    _jasperGenStringAsCharArray: Option[ConfigNodePropertyBoolean],
    _jasperKeepgenerated: Option[ConfigNodePropertyBoolean],
    _jasperMappedfile: Option[ConfigNodePropertyBoolean],
    _jasperTrimSpaces: Option[ConfigNodePropertyBoolean],
    _jasperDisplaySourceFragments: Option[ConfigNodePropertyBoolean],
    _defaultIsSession: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties {
    def toStringBody(var_jasperCompilerTargetVM: Object, var_jasperCompilerSourceVM: Object, var_jasperClassdebuginfo: Object, var_jasperEnablePooling: Object, var_jasperIeClassId: Object, var_jasperGenStringAsCharArray: Object, var_jasperKeepgenerated: Object, var_jasperMappedfile: Object, var_jasperTrimSpaces: Object, var_jasperDisplaySourceFragments: Object, var_defaultIsSession: Object) =
        s"""
        | {
        | "jasperCompilerTargetVM":$var_jasperCompilerTargetVM,"jasperCompilerSourceVM":$var_jasperCompilerSourceVM,"jasperClassdebuginfo":$var_jasperClassdebuginfo,"jasperEnablePooling":$var_jasperEnablePooling,"jasperIeClassId":$var_jasperIeClassId,"jasperGenStringAsCharArray":$var_jasperGenStringAsCharArray,"jasperKeepgenerated":$var_jasperKeepgenerated,"jasperMappedfile":$var_jasperMappedfile,"jasperTrimSpaces":$var_jasperTrimSpaces,"jasperDisplaySourceFragments":$var_jasperDisplaySourceFragments,"defaultIsSession":$var_defaultIsSession
        | }
        """.stripMargin
}
