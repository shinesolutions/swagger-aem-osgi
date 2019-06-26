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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';

/**
 * The OrgApacheSlingJcrRepoinitRepositoryInitializerProperties model module.
 * @module model/OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
 * @version 1.0.0
 */
class OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {
    /**
     * Constructs a new <code>OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</code>.
     * @alias module:model/OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
     */
    constructor() { 
        
        OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingJcrRepoinitRepositoryInitializerProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingJcrRepoinitRepositoryInitializerProperties} The populated <code>OrgApacheSlingJcrRepoinitRepositoryInitializerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();

            if (data.hasOwnProperty('references')) {
                obj['references'] = ConfigNodePropertyArray.constructFromObject(data['references']);
            }
            if (data.hasOwnProperty('scripts')) {
                obj['scripts'] = ConfigNodePropertyArray.constructFromObject(data['scripts']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} references
 */
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.prototype['references'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} scripts
 */
OrgApacheSlingJcrRepoinitRepositoryInitializerProperties.prototype['scripts'] = undefined;






export default OrgApacheSlingJcrRepoinitRepositoryInitializerProperties;
