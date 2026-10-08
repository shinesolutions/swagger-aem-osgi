import { OrgApacheFelixHttpProperties } from './org-apache-felix-http-properties';


export interface OrgApacheFelixHttpInfo { 
  pid?: string;
  title?: string;
  description?: string;
  properties?: OrgApacheFelixHttpProperties;
  bundle_location?: string;
  service_location?: string;
}

