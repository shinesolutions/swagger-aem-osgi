import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties { 
  'default.transport.agent-to-worker.prefix'?: ConfigNodePropertyString;
  'default.transport.agent-to-master.prefix'?: ConfigNodePropertyString;
  'default.transport.input.package'?: ConfigNodePropertyString;
  'default.transport.output.package'?: ConfigNodePropertyString;
  'default.transport.replication.synchronous'?: ConfigNodePropertyBoolean;
  'default.transport.contentpackage'?: ConfigNodePropertyBoolean;
  'offloading.transporter.default.enabled'?: ConfigNodePropertyBoolean;
}

