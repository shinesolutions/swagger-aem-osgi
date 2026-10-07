import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties { 
  threshold?: ConfigNodePropertyInteger;
  jobTopicName?: ConfigNodePropertyString;
  emailEnabled?: ConfigNodePropertyBoolean;
}

