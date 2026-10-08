import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqCdnRewriterImplCDNRewriterProperties { 
  'service.ranking'?: ConfigNodePropertyInteger;
  'cdnrewriter.attributes'?: ConfigNodePropertyArray;
  'cdn.rewriter.distribution.domain'?: ConfigNodePropertyString;
}

