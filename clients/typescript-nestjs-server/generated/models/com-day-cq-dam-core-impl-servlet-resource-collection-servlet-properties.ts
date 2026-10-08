import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqDamCoreImplServletResourceCollectionServletProperties { 
  'sling.servlet.resourceTypes'?: ConfigNodePropertyArray;
  'sling.servlet.methods'?: ConfigNodePropertyString;
  'sling.servlet.selectors'?: ConfigNodePropertyString;
  'download.config'?: ConfigNodePropertyString;
  'view.selector'?: ConfigNodePropertyString;
  send_email?: ConfigNodePropertyBoolean;
}

