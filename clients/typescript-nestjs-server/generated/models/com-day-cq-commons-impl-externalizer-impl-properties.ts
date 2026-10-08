import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqCommonsImplExternalizerImplProperties { 
  'externalizer.domains'?: ConfigNodePropertyArray;
  'externalizer.host'?: ConfigNodePropertyString;
  'externalizer.contextpath'?: ConfigNodePropertyString;
  'externalizer.encodedpath'?: ConfigNodePropertyBoolean;
}

