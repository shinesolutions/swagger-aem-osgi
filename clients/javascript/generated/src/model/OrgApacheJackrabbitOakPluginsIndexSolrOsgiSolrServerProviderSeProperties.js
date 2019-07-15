/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';

/**
 * The OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties model module.
 * @module model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties} The populated <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();

            if (data.hasOwnProperty('server.type')) {
                obj['server.type'] = ConfigNodePropertyDropDown.constructFromObject(data['server.type']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyDropDown} server.type
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.prototype['server.type'] = undefined;






export default OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties;

