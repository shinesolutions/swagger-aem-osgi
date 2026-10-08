import { ComDayCqSecurityACLSetupProperties } from './com-day-cq-security-acl-setup-properties';


export interface ComDayCqSecurityACLSetupInfo { 
  pid?: string;
  title?: string;
  description?: string;
  properties?: ComDayCqSecurityACLSetupProperties;
  bundle_location?: string;
  service_location?: string;
}

