import { OrgApacheFelixJaasConfigurationSpiProperties } from './org-apache-felix-jaas-configuration-spi-properties';


export interface OrgApacheFelixJaasConfigurationSpiInfo { 
  pid?: string;
  title?: string;
  description?: string;
  properties?: OrgApacheFelixJaasConfigurationSpiProperties;
  bundle_location?: string;
  service_location?: string;
}

