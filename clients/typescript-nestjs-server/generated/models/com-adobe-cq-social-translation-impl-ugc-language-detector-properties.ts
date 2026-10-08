import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties { 
  'event.topics'?: ConfigNodePropertyString;
  'event.filter'?: ConfigNodePropertyString;
  'translate.listener.type'?: ConfigNodePropertyArray;
  'translate.property.list'?: ConfigNodePropertyArray;
  poolSize?: ConfigNodePropertyInteger;
  maxPoolSize?: ConfigNodePropertyInteger;
  queueSize?: ConfigNodePropertyInteger;
  keepAliveTime?: ConfigNodePropertyInteger;
}

