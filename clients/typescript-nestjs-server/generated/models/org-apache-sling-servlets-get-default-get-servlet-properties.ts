import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingServletsGetDefaultGetServletProperties { 
  aliases?: ConfigNodePropertyArray;
  index?: ConfigNodePropertyBoolean;
  'index.files'?: ConfigNodePropertyArray;
  'enable.html'?: ConfigNodePropertyBoolean;
  'enable.json'?: ConfigNodePropertyBoolean;
  'enable.txt'?: ConfigNodePropertyBoolean;
  'enable.xml'?: ConfigNodePropertyBoolean;
  'json.maximumresults'?: ConfigNodePropertyInteger;
  ecmaSuport?: ConfigNodePropertyBoolean;
}

