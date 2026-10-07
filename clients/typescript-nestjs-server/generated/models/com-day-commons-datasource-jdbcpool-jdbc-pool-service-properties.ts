import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';
import { ConfigNodePropertyBoolean } from './config-node-property-boolean';
import { ConfigNodePropertyArray } from './config-node-property-array';


export interface ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties { 
  'jdbc.driver.class'?: ConfigNodePropertyString;
  'jdbc.connection.uri'?: ConfigNodePropertyString;
  'jdbc.username'?: ConfigNodePropertyString;
  'jdbc.password'?: ConfigNodePropertyString;
  'jdbc.validation.query'?: ConfigNodePropertyString;
  'default.readonly'?: ConfigNodePropertyBoolean;
  'default.autocommit'?: ConfigNodePropertyBoolean;
  'pool.size'?: ConfigNodePropertyInteger;
  'pool.max.wait.msec'?: ConfigNodePropertyInteger;
  'datasource.name'?: ConfigNodePropertyString;
  'datasource.svc.properties'?: ConfigNodePropertyArray;
}

