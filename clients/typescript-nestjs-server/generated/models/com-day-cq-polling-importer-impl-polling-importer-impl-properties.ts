import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqPollingImporterImplPollingImporterImplProperties { 
  'importer.min.interval'?: ConfigNodePropertyInteger;
  'importer.user'?: ConfigNodePropertyString;
  'exclude.paths'?: ConfigNodePropertyArray;
  'include.paths'?: ConfigNodePropertyArray;
}

