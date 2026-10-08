import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties { 
  'datasource.name'?: ConfigNodePropertyString;
  'datasource.svc.prop.name'?: ConfigNodePropertyString;
  'datasource.jndi.name'?: ConfigNodePropertyString;
  'jndi.properties'?: ConfigNodePropertyArray;
}

