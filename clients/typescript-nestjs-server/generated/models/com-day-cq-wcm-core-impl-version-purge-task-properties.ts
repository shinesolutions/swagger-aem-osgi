import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmCoreImplVersionPurgeTaskProperties { 
  'versionpurge.paths'?: ConfigNodePropertyArray;
  'versionpurge.recursive'?: ConfigNodePropertyBoolean;
  'versionpurge.maxVersions'?: ConfigNodePropertyInteger;
  'versionpurge.minVersions'?: ConfigNodePropertyInteger;
  'versionpurge.maxAgeDays'?: ConfigNodePropertyInteger;
}

