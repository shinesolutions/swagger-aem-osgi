import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties { 
  'handler.schemes'?: ConfigNodePropertyArray;
  'sling.jcrinstall.folder.name.regexp'?: ConfigNodePropertyString;
  'sling.jcrinstall.folder.max.depth'?: ConfigNodePropertyInteger;
  'sling.jcrinstall.search.path'?: ConfigNodePropertyArray;
  'sling.jcrinstall.new.config.path'?: ConfigNodePropertyString;
  'sling.jcrinstall.signal.path'?: ConfigNodePropertyString;
  'sling.jcrinstall.enable.writeback'?: ConfigNodePropertyBoolean;
}

