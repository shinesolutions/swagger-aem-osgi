import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties { 
  'org.apache.sling.commons.log.level'?: ConfigNodePropertyDropDown;
  'org.apache.sling.commons.log.file'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.pattern'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.names'?: ConfigNodePropertyArray;
  'org.apache.sling.commons.log.additiv'?: ConfigNodePropertyBoolean;
}

