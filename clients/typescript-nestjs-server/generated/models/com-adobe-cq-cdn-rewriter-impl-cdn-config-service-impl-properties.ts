import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties { 
  'cdn.config.distribution.domain'?: ConfigNodePropertyString;
  'cdn.config.enable.rewriting'?: ConfigNodePropertyBoolean;
  'cdn.config.path.prefixes'?: ConfigNodePropertyArray;
  'cdn.config.cdnttl'?: ConfigNodePropertyInteger;
  'cdn.config.application.protocol'?: ConfigNodePropertyString;
}

