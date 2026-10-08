import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties { 
  'service.ranking'?: ConfigNodePropertyInteger;
  'keypair.id'?: ConfigNodePropertyString;
  'keypair.alias'?: ConfigNodePropertyString;
  'cdnrewriter.attributes'?: ConfigNodePropertyArray;
  'cdn.rewriter.distribution.domain'?: ConfigNodePropertyString;
}

