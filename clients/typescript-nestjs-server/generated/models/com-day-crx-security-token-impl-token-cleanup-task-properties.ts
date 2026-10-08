import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCrxSecurityTokenImplTokenCleanupTaskProperties { 
  'enable.token.cleanup.task'?: ConfigNodePropertyBoolean;
  'scheduler.expression'?: ConfigNodePropertyString;
  'batch.size'?: ConfigNodePropertyInteger;
}

