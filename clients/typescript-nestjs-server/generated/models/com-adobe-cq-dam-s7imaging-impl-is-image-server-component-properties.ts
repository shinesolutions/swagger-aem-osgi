import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeCqDamS7imagingImplIsImageServerComponentProperties { 
  TcpPort?: ConfigNodePropertyString;
  AllowRemoteAccess?: ConfigNodePropertyBoolean;
  MaxRenderRgnPixels?: ConfigNodePropertyString;
  MaxMessageSize?: ConfigNodePropertyString;
  RandomAccessUrlTimeout?: ConfigNodePropertyInteger;
  WorkerThreads?: ConfigNodePropertyInteger;
}

