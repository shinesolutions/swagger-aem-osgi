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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingHcCoreImplScriptableHealthCheckProperties model module.
 * @module model/OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
 * @version 1.0.0
 */
class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {
    /**
     * Constructs a new <code>OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</code>.
     * @alias module:model/OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
     */
    constructor() { 
        
        OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingHcCoreImplScriptableHealthCheckProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingHcCoreImplScriptableHealthCheckProperties} The populated <code>OrgApacheSlingHcCoreImplScriptableHealthCheckProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingHcCoreImplScriptableHealthCheckProperties();

            if (data.hasOwnProperty('hc.name')) {
                obj['hc.name'] = ConfigNodePropertyString.constructFromObject(data['hc.name']);
            }
            if (data.hasOwnProperty('hc.tags')) {
                obj['hc.tags'] = ConfigNodePropertyArray.constructFromObject(data['hc.tags']);
            }
            if (data.hasOwnProperty('hc.mbean.name')) {
                obj['hc.mbean.name'] = ConfigNodePropertyString.constructFromObject(data['hc.mbean.name']);
            }
            if (data.hasOwnProperty('expression')) {
                obj['expression'] = ConfigNodePropertyString.constructFromObject(data['expression']);
            }
            if (data.hasOwnProperty('language.extension')) {
                obj['language.extension'] = ConfigNodePropertyString.constructFromObject(data['language.extension']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} hc.name
 */
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.prototype['hc.name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} hc.tags
 */
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.prototype['hc.tags'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} hc.mbean.name
 */
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.prototype['hc.mbean.name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} expression
 */
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.prototype['expression'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} language.extension
 */
OrgApacheSlingHcCoreImplScriptableHealthCheckProperties.prototype['language.extension'] = undefined;






export default OrgApacheSlingHcCoreImplScriptableHealthCheckProperties;

