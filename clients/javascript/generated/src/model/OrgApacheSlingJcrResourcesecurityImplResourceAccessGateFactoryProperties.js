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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties model module.
 * @module model/OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
 * @version 1.0.0
 */
class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
    /**
     * Constructs a new <code>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</code>.
     * @alias module:model/OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
     */
    constructor() { 
        
        OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties} The populated <code>OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties();

            if (data.hasOwnProperty('path')) {
                obj['path'] = ConfigNodePropertyString.constructFromObject(data['path']);
            }
            if (data.hasOwnProperty('checkpath.prefix')) {
                obj['checkpath.prefix'] = ConfigNodePropertyString.constructFromObject(data['checkpath.prefix']);
            }
            if (data.hasOwnProperty('jcrPath')) {
                obj['jcrPath'] = ConfigNodePropertyString.constructFromObject(data['jcrPath']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} path
 */
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.prototype['path'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} checkpath.prefix
 */
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.prototype['checkpath.prefix'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} jcrPath
 */
OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.prototype['jcrPath'] = undefined;






export default OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties;
