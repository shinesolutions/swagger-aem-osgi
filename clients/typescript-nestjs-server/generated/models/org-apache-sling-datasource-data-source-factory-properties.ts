import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';
import { ConfigNodePropertyDropDown } from './config-node-property-drop-down';


export interface OrgApacheSlingDatasourceDataSourceFactoryProperties { 
  'datasource.name'?: ConfigNodePropertyString;
  'datasource.svc.prop.name'?: ConfigNodePropertyString;
  driverClassName?: ConfigNodePropertyString;
  url?: ConfigNodePropertyString;
  username?: ConfigNodePropertyString;
  password?: ConfigNodePropertyString;
  defaultAutoCommit?: ConfigNodePropertyDropDown;
  defaultReadOnly?: ConfigNodePropertyDropDown;
  defaultTransactionIsolation?: ConfigNodePropertyDropDown;
  defaultCatalog?: ConfigNodePropertyString;
  maxActive?: ConfigNodePropertyInteger;
  maxIdle?: ConfigNodePropertyInteger;
  minIdle?: ConfigNodePropertyInteger;
  initialSize?: ConfigNodePropertyInteger;
  maxWait?: ConfigNodePropertyInteger;
  maxAge?: ConfigNodePropertyInteger;
  testOnBorrow?: ConfigNodePropertyBoolean;
  testOnReturn?: ConfigNodePropertyBoolean;
  testWhileIdle?: ConfigNodePropertyBoolean;
  validationQuery?: ConfigNodePropertyString;
  validationQueryTimeout?: ConfigNodePropertyInteger;
  timeBetweenEvictionRunsMillis?: ConfigNodePropertyInteger;
  minEvictableIdleTimeMillis?: ConfigNodePropertyInteger;
  connectionProperties?: ConfigNodePropertyString;
  initSQL?: ConfigNodePropertyString;
  jdbcInterceptors?: ConfigNodePropertyString;
  validationInterval?: ConfigNodePropertyInteger;
  logValidationErrors?: ConfigNodePropertyBoolean;
  'datasource.svc.properties'?: ConfigNodePropertyArray;
}

