import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties { 
  'path.desc.field'?: ConfigNodePropertyString;
  'path.child.field'?: ConfigNodePropertyString;
  'path.parent.field'?: ConfigNodePropertyString;
  'path.exact.field'?: ConfigNodePropertyString;
  'catch.all.field'?: ConfigNodePropertyString;
  'collapsed.path.field'?: ConfigNodePropertyString;
  'path.depth.field'?: ConfigNodePropertyString;
  'commit.policy'?: ConfigNodePropertyDropDown;
  rows?: ConfigNodePropertyInteger;
  'path.restrictions'?: ConfigNodePropertyBoolean;
  'property.restrictions'?: ConfigNodePropertyBoolean;
  'primarytypes.restrictions'?: ConfigNodePropertyBoolean;
  'ignored.properties'?: ConfigNodePropertyArray;
  'used.properties'?: ConfigNodePropertyArray;
  'type.mappings'?: ConfigNodePropertyArray;
  'property.mappings'?: ConfigNodePropertyArray;
  'collapse.jcrcontent.nodes'?: ConfigNodePropertyBoolean;
}

