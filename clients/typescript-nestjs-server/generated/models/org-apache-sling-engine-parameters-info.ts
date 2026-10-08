import { OrgApacheSlingEngineParametersProperties } from './org-apache-sling-engine-parameters-properties';


export interface OrgApacheSlingEngineParametersInfo { 
  pid?: string;
  title?: string;
  description?: string;
  properties?: OrgApacheSlingEngineParametersProperties;
  bundle_location?: string;
  service_location?: string;
}

