import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheSlingI18nImplJcrResourceBundleProviderProperties { 
  'locale.default'?: ConfigNodePropertyString;
  'preload.bundles'?: ConfigNodePropertyBoolean;
  'invalidation.delay'?: ConfigNodePropertyInteger;
}

