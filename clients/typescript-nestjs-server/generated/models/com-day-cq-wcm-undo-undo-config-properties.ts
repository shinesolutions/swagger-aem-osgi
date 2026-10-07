import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmUndoUndoConfigProperties { 
  'cq.wcm.undo.enabled'?: ConfigNodePropertyBoolean;
  'cq.wcm.undo.path'?: ConfigNodePropertyString;
  'cq.wcm.undo.validity'?: ConfigNodePropertyInteger;
  'cq.wcm.undo.steps'?: ConfigNodePropertyInteger;
  'cq.wcm.undo.persistence'?: ConfigNodePropertyString;
  'cq.wcm.undo.persistence.mode'?: ConfigNodePropertyBoolean;
  'cq.wcm.undo.markermode'?: ConfigNodePropertyString;
  'cq.wcm.undo.whitelist'?: ConfigNodePropertyArray;
  'cq.wcm.undo.blacklist'?: ConfigNodePropertyArray;
}

