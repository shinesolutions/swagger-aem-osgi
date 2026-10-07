import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties { 
  'link.expired.prefix'?: ConfigNodePropertyString;
  'link.expired.remove'?: ConfigNodePropertyBoolean;
  'link.expired.suffix'?: ConfigNodePropertyString;
  'link.invalid.prefix'?: ConfigNodePropertyString;
  'link.invalid.remove'?: ConfigNodePropertyBoolean;
  'link.invalid.suffix'?: ConfigNodePropertyString;
  'link.predated.prefix'?: ConfigNodePropertyString;
  'link.predated.remove'?: ConfigNodePropertyBoolean;
  'link.predated.suffix'?: ConfigNodePropertyString;
  'link.wcmmodes'?: ConfigNodePropertyArray;
}

