import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties { 
  'resource.resolver.searchpath'?: ConfigNodePropertyArray;
  'resource.resolver.manglenamespaces'?: ConfigNodePropertyBoolean;
  'resource.resolver.allowDirect'?: ConfigNodePropertyBoolean;
  'resource.resolver.required.providers'?: ConfigNodePropertyArray;
  'resource.resolver.required.providernames'?: ConfigNodePropertyArray;
  'resource.resolver.virtual'?: ConfigNodePropertyArray;
  'resource.resolver.mapping'?: ConfigNodePropertyArray;
  'resource.resolver.map.location'?: ConfigNodePropertyString;
  'resource.resolver.map.observation'?: ConfigNodePropertyArray;
  'resource.resolver.default.vanity.redirect.status'?: ConfigNodePropertyInteger;
  'resource.resolver.enable.vanitypath'?: ConfigNodePropertyBoolean;
  'resource.resolver.vanitypath.maxEntries'?: ConfigNodePropertyInteger;
  'resource.resolver.vanitypath.maxEntries.startup'?: ConfigNodePropertyBoolean;
  'resource.resolver.vanitypath.bloomfilter.maxBytes'?: ConfigNodePropertyInteger;
  'resource.resolver.optimize.alias.resolution'?: ConfigNodePropertyBoolean;
  'resource.resolver.vanitypath.whitelist'?: ConfigNodePropertyArray;
  'resource.resolver.vanitypath.blacklist'?: ConfigNodePropertyArray;
  'resource.resolver.vanity.precedence'?: ConfigNodePropertyBoolean;
  'resource.resolver.providerhandling.paranoid'?: ConfigNodePropertyBoolean;
  'resource.resolver.log.closing'?: ConfigNodePropertyBoolean;
  'resource.resolver.log.unclosed'?: ConfigNodePropertyBoolean;
}

