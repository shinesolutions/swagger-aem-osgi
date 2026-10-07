import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties { 
  nodetypes?: ConfigNodePropertyArray;
  ignorableprops?: ConfigNodePropertyArray;
  ignorablenodes?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  distfolders?: ConfigNodePropertyString;
}

