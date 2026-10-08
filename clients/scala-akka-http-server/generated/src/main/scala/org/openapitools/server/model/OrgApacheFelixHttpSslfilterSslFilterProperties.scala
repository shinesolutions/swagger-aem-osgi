package org.openapitools.server.model


/**
 * @param sslForwardHeader  for example: ''null''
 * @param sslForwardValue  for example: ''null''
 * @param sslForwardCertHeader  for example: ''null''
 * @param rewriteAbsoluteUrls  for example: ''null''
*/
final case class OrgApacheFelixHttpSslfilterSslFilterProperties (
  sslForwardHeader: Option[ConfigNodePropertyString] = None,
  sslForwardValue: Option[ConfigNodePropertyString] = None,
  sslForwardCertHeader: Option[ConfigNodePropertyString] = None,
  rewriteAbsoluteUrls: Option[ConfigNodePropertyBoolean] = None
)

