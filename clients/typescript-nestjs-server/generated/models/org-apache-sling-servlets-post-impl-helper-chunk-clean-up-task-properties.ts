import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties { 
  'scheduler.expression'?: ConfigNodePropertyString;
  'scheduler.concurrent'?: ConfigNodePropertyBoolean;
  'chunk.cleanup.age'?: ConfigNodePropertyInteger;
}

