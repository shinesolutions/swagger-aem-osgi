import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties { 
  'event.filter'?: ConfigNodePropertyString;
  'launches.eventhandler.threadpool.maxsize'?: ConfigNodePropertyInteger;
  'launches.eventhandler.threadpool.priority'?: ConfigNodePropertyDropDown;
  'launches.eventhandler.updatelastmodification'?: ConfigNodePropertyBoolean;
}

