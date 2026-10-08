import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties { 
  'message.properties'?: ConfigNodePropertyArray;
  messageBoxSizeLimit?: ConfigNodePropertyInteger;
  messageCountLimit?: ConfigNodePropertyInteger;
  notifyFailure?: ConfigNodePropertyBoolean;
  failureMessageFrom?: ConfigNodePropertyString;
  failureTemplatePath?: ConfigNodePropertyString;
  maxRetries?: ConfigNodePropertyInteger;
  minWaitBetweenRetries?: ConfigNodePropertyInteger;
  countUpdatePoolSize?: ConfigNodePropertyInteger;
  'inbox.path'?: ConfigNodePropertyString;
  'sentitems.path'?: ConfigNodePropertyString;
  supportAttachments?: ConfigNodePropertyBoolean;
  supportGroupMessaging?: ConfigNodePropertyBoolean;
  maxTotalRecipients?: ConfigNodePropertyInteger;
  batchSize?: ConfigNodePropertyInteger;
  maxTotalAttachmentSize?: ConfigNodePropertyInteger;
  attachmentTypeBlacklist?: ConfigNodePropertyArray;
  allowedAttachmentTypes?: ConfigNodePropertyArray;
  serviceSelector?: ConfigNodePropertyString;
  fieldWhitelist?: ConfigNodePropertyArray;
}

