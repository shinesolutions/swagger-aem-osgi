import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties { 
  'scheduler.period'?: ConfigNodePropertyInteger;
  'scheduler.concurrent'?: ConfigNodePropertyBoolean;
  'service.bad_link_tolerance_interval'?: ConfigNodePropertyInteger;
  'service.check_override_patterns'?: ConfigNodePropertyArray;
  'service.cache_broken_internal_links'?: ConfigNodePropertyBoolean;
  'service.special_link_prefix'?: ConfigNodePropertyArray;
  'service.special_link_patterns'?: ConfigNodePropertyArray;
}

