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
 * The OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties model module.
 * @module model/OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties
 * @version 1.0.0
 */
class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties</code>.
     * @alias module:model/OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties
     */
    constructor() { 
        
        OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties} The populated <code>OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties();

            if (data.hasOwnProperty('ignorePropertyNameRegex')) {
                obj['ignorePropertyNameRegex'] = ConfigNodePropertyArray.constructFromObject(data['ignorePropertyNameRegex']);
            }
            if (data.hasOwnProperty('configCollectionPropertiesResourceNames')) {
                obj['configCollectionPropertiesResourceNames'] = ConfigNodePropertyArray.constructFromObject(data['configCollectionPropertiesResourceNames']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} ignorePropertyNameRegex
 */
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties.prototype['ignorePropertyNameRegex'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} configCollectionPropertiesResourceNames
 */
OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties.prototype['configCollectionPropertiesResourceNames'] = undefined;






export default OrgApacheSlingCaconfigManagementImplConfigurationManagementSettingsImplProperties;

