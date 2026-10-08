package org.openapitools.server.model


/**
 * @param javaClassdebuginfo  for example: ''null''
 * @param javaJavaEncoding  for example: ''null''
 * @param javaCompilerSourceVM  for example: ''null''
 * @param javaCompilerTargetVM  for example: ''null''
*/
final case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties (
  javaClassdebuginfo: Option[ConfigNodePropertyBoolean] = None,
  javaJavaEncoding: Option[ConfigNodePropertyString] = None,
  javaCompilerSourceVM: Option[ConfigNodePropertyString] = None,
  javaCompilerTargetVM: Option[ConfigNodePropertyString] = None
)

