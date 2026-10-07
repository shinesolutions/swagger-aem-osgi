import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties { 
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath'?: ConfigNodePropertyArray;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout'?: ConfigNodePropertyInteger;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport'?: ConfigNodePropertyInteger;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls'?: ConfigNodePropertyBoolean;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username'?: ConfigNodePropertyString;
  'com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password'?: ConfigNodePropertyString;
}

