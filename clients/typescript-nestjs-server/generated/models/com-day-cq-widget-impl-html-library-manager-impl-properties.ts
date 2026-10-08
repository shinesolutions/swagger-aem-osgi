import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCqWidgetImplHtmlLibraryManagerImplProperties { 
  'htmllibmanager.clientmanager'?: ConfigNodePropertyString;
  'htmllibmanager.debug'?: ConfigNodePropertyBoolean;
  'htmllibmanager.debug.console'?: ConfigNodePropertyBoolean;
  'htmllibmanager.debug.init.js'?: ConfigNodePropertyString;
  'htmllibmanager.defaultthemename'?: ConfigNodePropertyString;
  'htmllibmanager.defaultuserthemename'?: ConfigNodePropertyString;
  'htmllibmanager.firebuglite.path'?: ConfigNodePropertyString;
  'htmllibmanager.forceCQUrlInfo'?: ConfigNodePropertyBoolean;
  'htmllibmanager.gzip'?: ConfigNodePropertyBoolean;
  'htmllibmanager.maxage'?: ConfigNodePropertyInteger;
  'htmllibmanager.maxDataUriSize'?: ConfigNodePropertyInteger;
  'htmllibmanager.minify'?: ConfigNodePropertyBoolean;
  'htmllibmanager.path.list'?: ConfigNodePropertyArray;
  'htmllibmanager.timing'?: ConfigNodePropertyBoolean;
}

