import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';


export interface OrgApacheFelixHttpSslfilterSslFilterProperties { 
  'ssl-forward.header'?: ConfigNodePropertyString;
  'ssl-forward.value'?: ConfigNodePropertyString;
  'ssl-forward-cert.header'?: ConfigNodePropertyString;
  'rewrite.absolute.urls'?: ConfigNodePropertyBoolean;
}

