import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties { 
  path?: ConfigNodePropertyString;
  'token.required.attr'?: ConfigNodePropertyDropDown;
  'token.alternate.url'?: ConfigNodePropertyString;
  'token.encapsulated'?: ConfigNodePropertyBoolean;
  'skip.token.refresh'?: ConfigNodePropertyArray;
}

