import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteRepositoryServiceUserConfigurationProperties { 
  'service.ranking'?: ConfigNodePropertyInteger;
  'serviceusers.simpleSubjectPopulation'?: ConfigNodePropertyBoolean;
  'serviceusers.list'?: ConfigNodePropertyArray;
}

