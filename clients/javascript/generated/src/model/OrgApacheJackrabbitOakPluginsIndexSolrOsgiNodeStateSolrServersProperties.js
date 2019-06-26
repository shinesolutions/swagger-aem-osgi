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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties model module.
 * @module model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties} The populated <code>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties.prototype['enabled'] = undefined;






export default OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties;

