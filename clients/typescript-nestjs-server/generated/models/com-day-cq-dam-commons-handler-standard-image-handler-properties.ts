import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComDayCqDamCommonsHandlerStandardImageHandlerProperties { 
  large_file_threshold?: ConfigNodePropertyInteger;
  large_comment_threshold?: ConfigNodePropertyInteger;
  'cq.dam.enable.ext.meta.extraction'?: ConfigNodePropertyBoolean;
}

