import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingCommonsLogLogManagerProperties { 
  'org.apache.sling.commons.log.level'?: ConfigNodePropertyDropDown;
  'org.apache.sling.commons.log.file'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.file.number'?: ConfigNodePropertyInteger;
  'org.apache.sling.commons.log.file.size'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.pattern'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.configurationFile'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.packagingDataEnabled'?: ConfigNodePropertyBoolean;
  'org.apache.sling.commons.log.maxCallerDataDepth'?: ConfigNodePropertyInteger;
  'org.apache.sling.commons.log.maxOldFileCountInDump'?: ConfigNodePropertyInteger;
  'org.apache.sling.commons.log.numOfLines'?: ConfigNodePropertyInteger;
}

