import { ConfigNodePropertyString } from './config-node-property-string';
import { ConfigNodePropertyInteger } from './config-node-property-integer';


export interface OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties { 
  'solr.http.url'?: ConfigNodePropertyString;
  'solr.zk.host'?: ConfigNodePropertyString;
  'solr.collection'?: ConfigNodePropertyString;
  'solr.socket.timeout'?: ConfigNodePropertyInteger;
  'solr.connection.timeout'?: ConfigNodePropertyInteger;
  'solr.shards.no'?: ConfigNodePropertyInteger;
  'solr.replication.factor'?: ConfigNodePropertyInteger;
  'solr.conf.dir'?: ConfigNodePropertyString;
}

