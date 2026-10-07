import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties { 
  'version.id'?: ConfigNodePropertyString;
  'cache.on'?: ConfigNodePropertyBoolean;
  'concurrency.level'?: ConfigNodePropertyInteger;
  'cache.start.size'?: ConfigNodePropertyInteger;
  'cache.ttl'?: ConfigNodePropertyInteger;
  'cache.size'?: ConfigNodePropertyInteger;
  'time.limit'?: ConfigNodePropertyInteger;
}

