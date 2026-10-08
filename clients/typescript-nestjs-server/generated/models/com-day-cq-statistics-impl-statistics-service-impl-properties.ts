import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqStatisticsImplStatisticsServiceImplProperties { 
  'scheduler.period'?: ConfigNodePropertyInteger;
  'scheduler.concurrent'?: ConfigNodePropertyBoolean;
  path?: ConfigNodePropertyString;
  workspace?: ConfigNodePropertyString;
  keywordsPath?: ConfigNodePropertyString;
  asyncEntries?: ConfigNodePropertyBoolean;
}

