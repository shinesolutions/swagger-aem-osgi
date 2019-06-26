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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties model module.
 * @module model/OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties
 * @version 1.0.0
 */
class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties</code>.
     * @alias module:model/OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties
     */
    constructor() { 
        
        OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties} The populated <code>OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
            if (data.hasOwnProperty('configPath')) {
                obj['configPath'] = ConfigNodePropertyString.constructFromObject(data['configPath']);
            }
            if (data.hasOwnProperty('fallbackPaths')) {
                obj['fallbackPaths'] = ConfigNodePropertyArray.constructFromObject(data['fallbackPaths']);
            }
            if (data.hasOwnProperty('configCollectionInheritancePropertyNames')) {
                obj['configCollectionInheritancePropertyNames'] = ConfigNodePropertyArray.constructFromObject(data['configCollectionInheritancePropertyNames']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties.prototype['enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} configPath
 */
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties.prototype['configPath'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} fallbackPaths
 */
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties.prototype['fallbackPaths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} configCollectionInheritancePropertyNames
 */
OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties.prototype['configCollectionInheritancePropertyNames'] = undefined;






export default OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourceResolvingStrategyProperties;

