/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties model module.
 * @module model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties} The populated <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties();

            if (data.hasOwnProperty('solr.http.url')) {
                obj['solr.http.url'] = ConfigNodePropertyString.constructFromObject(data['solr.http.url']);
            }
            if (data.hasOwnProperty('solr.zk.host')) {
                obj['solr.zk.host'] = ConfigNodePropertyString.constructFromObject(data['solr.zk.host']);
            }
            if (data.hasOwnProperty('solr.collection')) {
                obj['solr.collection'] = ConfigNodePropertyString.constructFromObject(data['solr.collection']);
            }
            if (data.hasOwnProperty('solr.socket.timeout')) {
                obj['solr.socket.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['solr.socket.timeout']);
            }
            if (data.hasOwnProperty('solr.connection.timeout')) {
                obj['solr.connection.timeout'] = ConfigNodePropertyInteger.constructFromObject(data['solr.connection.timeout']);
            }
            if (data.hasOwnProperty('solr.shards.no')) {
                obj['solr.shards.no'] = ConfigNodePropertyInteger.constructFromObject(data['solr.shards.no']);
            }
            if (data.hasOwnProperty('solr.replication.factor')) {
                obj['solr.replication.factor'] = ConfigNodePropertyInteger.constructFromObject(data['solr.replication.factor']);
            }
            if (data.hasOwnProperty('solr.conf.dir')) {
                obj['solr.conf.dir'] = ConfigNodePropertyString.constructFromObject(data['solr.conf.dir']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} solr.http.url
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.http.url'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} solr.zk.host
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.zk.host'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} solr.collection
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.collection'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} solr.socket.timeout
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.socket.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} solr.connection.timeout
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.connection.timeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} solr.shards.no
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.shards.no'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} solr.replication.factor
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.replication.factor'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} solr.conf.dir
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties.prototype['solr.conf.dir'] = undefined;






export default OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfigurationProviderProperties;

