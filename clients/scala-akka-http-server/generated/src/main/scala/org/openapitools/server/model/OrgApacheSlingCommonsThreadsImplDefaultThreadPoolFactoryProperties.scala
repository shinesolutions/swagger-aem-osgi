package org.openapitools.server.model


/**
 * @param name  for example: ''null''
 * @param minPoolSize  for example: ''null''
 * @param maxPoolSize  for example: ''null''
 * @param queueSize  for example: ''null''
 * @param maxThreadAge  for example: ''null''
 * @param keepAliveTime  for example: ''null''
 * @param blockPolicy  for example: ''null''
 * @param shutdownGraceful  for example: ''null''
 * @param daemon  for example: ''null''
 * @param shutdownWaitTime  for example: ''null''
 * @param priority  for example: ''null''
*/
final case class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties (
  name: Option[ConfigNodePropertyString] = None,
  minPoolSize: Option[ConfigNodePropertyInteger] = None,
  maxPoolSize: Option[ConfigNodePropertyInteger] = None,
  queueSize: Option[ConfigNodePropertyInteger] = None,
  maxThreadAge: Option[ConfigNodePropertyInteger] = None,
  keepAliveTime: Option[ConfigNodePropertyInteger] = None,
  blockPolicy: Option[ConfigNodePropertyDropDown] = None,
  shutdownGraceful: Option[ConfigNodePropertyBoolean] = None,
  daemon: Option[ConfigNodePropertyBoolean] = None,
  shutdownWaitTime: Option[ConfigNodePropertyInteger] = None,
  priority: Option[ConfigNodePropertyDropDown] = None
)

