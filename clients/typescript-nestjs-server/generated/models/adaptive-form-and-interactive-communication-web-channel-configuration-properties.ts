import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties { 
  showPlaceholder?: ConfigNodePropertyBoolean;
  maximumCacheEntries?: ConfigNodePropertyInteger;
  'af.scripting.compatversion'?: ConfigNodePropertyDropDown;
  makeFileNameUnique?: ConfigNodePropertyBoolean;
  generatingCompliantData?: ConfigNodePropertyBoolean;
}

