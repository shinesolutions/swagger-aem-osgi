import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingEngineImplSlingMainServletProperties { 
  'sling.max.calls'?: ConfigNodePropertyInteger;
  'sling.max.inclusions'?: ConfigNodePropertyInteger;
  'sling.trace.allow'?: ConfigNodePropertyBoolean;
  'sling.max.record.requests'?: ConfigNodePropertyInteger;
  'sling.store.pattern.requests'?: ConfigNodePropertyArray;
  'sling.serverinfo'?: ConfigNodePropertyString;
  'sling.additional.response.headers'?: ConfigNodePropertyArray;
}

