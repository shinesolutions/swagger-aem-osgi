import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties { 
  'preserve.hierarchy.nodes'?: ConfigNodePropertyBoolean;
  'ignore.versioning'?: ConfigNodePropertyBoolean;
  'import.acl'?: ConfigNodePropertyBoolean;
  'save.threshold'?: ConfigNodePropertyInteger;
  'preserve.user.paths'?: ConfigNodePropertyBoolean;
  'preserve.uuid'?: ConfigNodePropertyBoolean;
  'preserve.uuid.nodetypes'?: ConfigNodePropertyArray;
  'preserve.uuid.subtrees'?: ConfigNodePropertyArray;
  'auto.commit'?: ConfigNodePropertyBoolean;
}

