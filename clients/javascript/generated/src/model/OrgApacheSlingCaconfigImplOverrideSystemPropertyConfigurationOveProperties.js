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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties model module.
 * @module model/OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
 * @version 1.0.0
 */
class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</code>.
     * @alias module:model/OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
     */
    constructor() { 
        
        OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties} The populated <code>OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
            if (data.hasOwnProperty('service.ranking')) {
                obj['service.ranking'] = ConfigNodePropertyInteger.constructFromObject(data['service.ranking']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.prototype['service.ranking'] = undefined;






export default OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties;

