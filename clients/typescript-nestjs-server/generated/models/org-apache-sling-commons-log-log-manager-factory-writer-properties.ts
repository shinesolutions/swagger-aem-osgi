import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties { 
  'org.apache.sling.commons.log.file'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.file.number'?: ConfigNodePropertyInteger;
  'org.apache.sling.commons.log.file.size'?: ConfigNodePropertyString;
  'org.apache.sling.commons.log.file.buffered'?: ConfigNodePropertyBoolean;
}

