import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqWorkflowImplEmailEMailNotificationServiceProperties { 
  'from.address'?: ConfigNodePropertyString;
  'host.prefix'?: ConfigNodePropertyString;
  'notify.onabort'?: ConfigNodePropertyBoolean;
  'notify.oncomplete'?: ConfigNodePropertyBoolean;
  'notify.oncontainercomplete'?: ConfigNodePropertyBoolean;
  'notify.useronly'?: ConfigNodePropertyBoolean;
}

