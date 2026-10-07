import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties { 
  enable?: ConfigNodePropertyBoolean;
  UGCLimit?: ConfigNodePropertyInteger;
  ugcLimitDuration?: ConfigNodePropertyInteger;
  domains?: ConfigNodePropertyArray;
  toList?: ConfigNodePropertyArray;
}

