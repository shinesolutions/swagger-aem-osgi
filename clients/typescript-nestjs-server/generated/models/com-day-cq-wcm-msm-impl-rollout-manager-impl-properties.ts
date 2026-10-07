import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComDayCqWcmMsmImplRolloutManagerImplProperties { 
  'event.filter'?: ConfigNodePropertyString;
  'rolloutmgr.excludedprops.default'?: ConfigNodePropertyArray;
  'rolloutmgr.excludedparagraphprops.default'?: ConfigNodePropertyArray;
  'rolloutmgr.excludednodetypes.default'?: ConfigNodePropertyArray;
  'rolloutmgr.threadpool.maxsize'?: ConfigNodePropertyInteger;
  'rolloutmgr.threadpool.maxshutdowntime'?: ConfigNodePropertyInteger;
  'rolloutmgr.threadpool.priority'?: ConfigNodePropertyDropDown;
  'rolloutmgr.commit.size'?: ConfigNodePropertyInteger;
  'rolloutmgr.conflicthandling.enabled'?: ConfigNodePropertyBoolean;
}

