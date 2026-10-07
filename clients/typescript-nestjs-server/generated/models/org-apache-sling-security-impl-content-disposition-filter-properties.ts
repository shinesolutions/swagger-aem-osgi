import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingSecurityImplContentDispositionFilterProperties { 
  'sling.content.disposition.paths'?: ConfigNodePropertyArray;
  'sling.content.disposition.excluded.paths'?: ConfigNodePropertyArray;
  'sling.content.disposition.all.paths'?: ConfigNodePropertyBoolean;
}

