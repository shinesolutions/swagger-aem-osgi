import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqAuthImplLoginSelectorHandlerProperties { 
  path?: ConfigNodePropertyString;
  'service.ranking'?: ConfigNodePropertyInteger;
  'auth.loginselector.mappings'?: ConfigNodePropertyArray;
  'auth.loginselector.changepw.mappings'?: ConfigNodePropertyArray;
  'auth.loginselector.defaultloginpage'?: ConfigNodePropertyString;
  'auth.loginselector.defaultchangepwpage'?: ConfigNodePropertyString;
  'auth.loginselector.handle'?: ConfigNodePropertyArray;
  'auth.loginselector.handle.all.extensions'?: ConfigNodePropertyBoolean;
}

