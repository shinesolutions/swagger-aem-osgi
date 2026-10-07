import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties { 
  'scheduler.period'?: ConfigNodePropertyInteger;
  'scheduler.concurrent'?: ConfigNodePropertyBoolean;
  good_link_test_interval?: ConfigNodePropertyInteger;
  bad_link_test_interval?: ConfigNodePropertyInteger;
  link_unused_interval?: ConfigNodePropertyInteger;
  'connection.timeout'?: ConfigNodePropertyInteger;
}

