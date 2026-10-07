import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmCoreImplVersionManagerImplProperties { 
  'versionmanager.createVersionOnActivation'?: ConfigNodePropertyBoolean;
  'versionmanager.purgingEnabled'?: ConfigNodePropertyBoolean;
  'versionmanager.purgePaths'?: ConfigNodePropertyArray;
  'versionmanager.ivPaths'?: ConfigNodePropertyArray;
  'versionmanager.maxAgeDays'?: ConfigNodePropertyInteger;
  'versionmanager.maxNumberVersions'?: ConfigNodePropertyInteger;
  'versionmanager.minNumberVersions'?: ConfigNodePropertyInteger;
}

