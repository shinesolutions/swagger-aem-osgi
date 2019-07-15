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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties model module.
 * @module model/OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
 * @version 1.0.0
 */
class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</code>.
     * @alias module:model/OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
     */
    constructor() { 
        
        OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties} The populated <code>OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();

            if (data.hasOwnProperty('description')) {
                obj['description'] = ConfigNodePropertyString.constructFromObject(data['description']);
            }
            if (data.hasOwnProperty('overrides')) {
                obj['overrides'] = ConfigNodePropertyArray.constructFromObject(data['overrides']);
            }
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
 * @member {module:model/ConfigNodePropertyString} description
 */
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.prototype['description'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} overrides
 */
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.prototype['overrides'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} service.ranking
 */
OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.prototype['service.ranking'] = undefined;






export default OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties;

