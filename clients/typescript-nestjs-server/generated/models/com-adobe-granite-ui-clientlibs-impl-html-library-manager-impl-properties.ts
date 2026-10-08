import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties { 
  'htmllibmanager.timing'?: ConfigNodePropertyBoolean;
  'htmllibmanager.debug.init.js'?: ConfigNodePropertyString;
  'htmllibmanager.minify'?: ConfigNodePropertyBoolean;
  'htmllibmanager.debug'?: ConfigNodePropertyBoolean;
  'htmllibmanager.gzip'?: ConfigNodePropertyBoolean;
  'htmllibmanager.maxDataUriSize'?: ConfigNodePropertyInteger;
  'htmllibmanager.maxage'?: ConfigNodePropertyInteger;
  'htmllibmanager.forceCQUrlInfo'?: ConfigNodePropertyBoolean;
  'htmllibmanager.defaultthemename'?: ConfigNodePropertyString;
  'htmllibmanager.defaultuserthemename'?: ConfigNodePropertyString;
  'htmllibmanager.clientmanager'?: ConfigNodePropertyString;
  'htmllibmanager.path.list'?: ConfigNodePropertyArray;
  'htmllibmanager.excluded.path.list'?: ConfigNodePropertyArray;
  'htmllibmanager.processor.js'?: ConfigNodePropertyArray;
  'htmllibmanager.processor.css'?: ConfigNodePropertyArray;
  'htmllibmanager.longcache.patterns'?: ConfigNodePropertyArray;
  'htmllibmanager.longcache.format'?: ConfigNodePropertyString;
  'htmllibmanager.useFileSystemOutputCache'?: ConfigNodePropertyBoolean;
  'htmllibmanager.fileSystemOutputCacheLocation'?: ConfigNodePropertyString;
  'htmllibmanager.disable.replacement'?: ConfigNodePropertyArray;
}

