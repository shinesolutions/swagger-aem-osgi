import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties { 
  queryLimitInMemory?: ConfigNodePropertyInteger;
  queryLimitReads?: ConfigNodePropertyInteger;
  queryFailTraversal?: ConfigNodePropertyBoolean;
  fastQuerySize?: ConfigNodePropertyBoolean;
}

