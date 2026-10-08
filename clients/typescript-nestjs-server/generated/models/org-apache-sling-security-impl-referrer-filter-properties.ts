import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingSecurityImplReferrerFilterProperties { 
  'allow.empty'?: ConfigNodePropertyBoolean;
  'allow.hosts'?: ConfigNodePropertyArray;
  'allow.hosts.regexp'?: ConfigNodePropertyArray;
  'filter.methods'?: ConfigNodePropertyArray;
  'exclude.agents.regexp'?: ConfigNodePropertyArray;
}

