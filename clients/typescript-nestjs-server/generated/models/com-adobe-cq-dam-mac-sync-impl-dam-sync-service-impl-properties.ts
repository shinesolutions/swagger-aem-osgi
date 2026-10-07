import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties { 
  'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths'?: ConfigNodePropertyArray;
  'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions'?: ConfigNodePropertyBoolean;
  'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms'?: ConfigNodePropertyInteger;
  'com.adobe.cq.dam.mac.sync.damsyncservice.platform'?: ConfigNodePropertyDropDown;
}

