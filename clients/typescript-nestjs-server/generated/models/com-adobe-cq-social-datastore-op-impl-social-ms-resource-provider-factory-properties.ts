import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties { 
  'solr.zk.timeout'?: ConfigNodePropertyString;
  'solr.commit'?: ConfigNodePropertyString;
  'cache.on'?: ConfigNodePropertyBoolean;
  'concurrency.level'?: ConfigNodePropertyInteger;
  'cache.start.size'?: ConfigNodePropertyInteger;
  'cache.ttl'?: ConfigNodePropertyInteger;
  'cache.size'?: ConfigNodePropertyInteger;
}

