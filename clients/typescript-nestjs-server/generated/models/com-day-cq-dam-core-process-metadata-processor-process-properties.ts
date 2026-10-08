import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqDamCoreProcessMetadataProcessorProcessProperties { 
  'process.label'?: ConfigNodePropertyString;
  'cq.dam.enable.sha1'?: ConfigNodePropertyBoolean;
  'cq.dam.metadata.xssprotected.properties'?: ConfigNodePropertyArray;
}

