import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties { 
  'manager.root'?: ConfigNodePropertyString;
  'http.service.filter'?: ConfigNodePropertyString;
  'default.render'?: ConfigNodePropertyString;
  realm?: ConfigNodePropertyString;
  username?: ConfigNodePropertyString;
  password?: ConfigNodePropertyString;
  category?: ConfigNodePropertyString;
  locale?: ConfigNodePropertyString;
  loglevel?: ConfigNodePropertyDropDown;
  plugins?: ConfigNodePropertyDropDown;
}

