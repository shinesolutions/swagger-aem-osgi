import { OrgApacheSlingDiscoveryOakConfigProperties } from './org-apache-sling-discovery-oak-config-properties';


export interface OrgApacheSlingDiscoveryOakConfigInfo { 
  pid?: string;
  title?: string;
  description?: string;
  properties?: OrgApacheSlingDiscoveryOakConfigProperties;
  bundle_location?: string;
  service_location?: string;
}

