import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteCsrfImplCSRFFilterProperties { 
  'filter.methods'?: ConfigNodePropertyArray;
  'filter.enable.safe.user.agents'?: ConfigNodePropertyBoolean;
  'filter.safe.user.agents'?: ConfigNodePropertyArray;
  'filter.excluded.paths'?: ConfigNodePropertyArray;
}

