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
import OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceProperties from './OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceProperties';

/**
 * The OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo model module.
 * @module model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo} The populated <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceProperties} properties
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo.prototype['properties'] = undefined;






export default OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProviderServiceInfo;
