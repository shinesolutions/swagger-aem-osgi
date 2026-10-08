import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqPollingImporterImplManagedPollConfigImplProperties { 
  id?: ConfigNodePropertyString;
  enabled?: ConfigNodePropertyBoolean;
  reference?: ConfigNodePropertyBoolean;
  interval?: ConfigNodePropertyInteger;
  expression?: ConfigNodePropertyString;
  source?: ConfigNodePropertyString;
  target?: ConfigNodePropertyString;
  login?: ConfigNodePropertyString;
  password?: ConfigNodePropertyString;
}

