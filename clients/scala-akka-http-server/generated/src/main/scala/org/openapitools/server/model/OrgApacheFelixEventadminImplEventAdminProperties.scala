package org.openapitools.server.model


/**
 * @param orgApacheFelixEventadminThreadPoolSize  for example: ''null''
 * @param orgApacheFelixEventadminAsyncToSyncThreadRatio  for example: ''null''
 * @param orgApacheFelixEventadminTimeout  for example: ''null''
 * @param orgApacheFelixEventadminRequireTopic  for example: ''null''
 * @param orgApacheFelixEventadminIgnoreTimeout  for example: ''null''
 * @param orgApacheFelixEventadminIgnoreTopic  for example: ''null''
*/
final case class OrgApacheFelixEventadminImplEventAdminProperties (
  orgApacheFelixEventadminThreadPoolSize: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixEventadminAsyncToSyncThreadRatio: Option[ConfigNodePropertyFloat] = None,
  orgApacheFelixEventadminTimeout: Option[ConfigNodePropertyInteger] = None,
  orgApacheFelixEventadminRequireTopic: Option[ConfigNodePropertyBoolean] = None,
  orgApacheFelixEventadminIgnoreTimeout: Option[ConfigNodePropertyArray] = None,
  orgApacheFelixEventadminIgnoreTopic: Option[ConfigNodePropertyArray] = None
)

