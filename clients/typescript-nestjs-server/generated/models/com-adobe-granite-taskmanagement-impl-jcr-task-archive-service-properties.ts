import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties { 
  'archiving.enabled'?: ConfigNodePropertyBoolean;
  'scheduler.expression'?: ConfigNodePropertyString;
  'archive.since.days.completed'?: ConfigNodePropertyInteger;
}

