import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties { 
  'translate.language'?: ConfigNodePropertyDropDown;
  'translate.display'?: ConfigNodePropertyDropDown;
  'translate.attribution'?: ConfigNodePropertyBoolean;
  'translate.caching'?: ConfigNodePropertyDropDown;
  'translate.smart.rendering'?: ConfigNodePropertyDropDown;
  'translate.caching.duration'?: ConfigNodePropertyString;
  'translate.session.save.interval'?: ConfigNodePropertyString;
  'translate.session.save.batchLimit'?: ConfigNodePropertyString;
}

