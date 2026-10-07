import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqAuthImplCugCugSupportImplProperties { 
  'cug.exempted.principals'?: ConfigNodePropertyArray;
  'cug.enabled'?: ConfigNodePropertyBoolean;
  'cug.principals.regex'?: ConfigNodePropertyString;
  'cug.principals.replacement'?: ConfigNodePropertyString;
}

