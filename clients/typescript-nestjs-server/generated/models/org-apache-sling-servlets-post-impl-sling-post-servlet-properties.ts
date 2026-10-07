import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingServletsPostImplSlingPostServletProperties { 
  'servlet.post.dateFormats'?: ConfigNodePropertyArray;
  'servlet.post.nodeNameHints'?: ConfigNodePropertyArray;
  'servlet.post.nodeNameMaxLength'?: ConfigNodePropertyInteger;
  'servlet.post.checkinNewVersionableNodes'?: ConfigNodePropertyBoolean;
  'servlet.post.autoCheckout'?: ConfigNodePropertyBoolean;
  'servlet.post.autoCheckin'?: ConfigNodePropertyBoolean;
  'servlet.post.ignorePattern'?: ConfigNodePropertyString;
}

