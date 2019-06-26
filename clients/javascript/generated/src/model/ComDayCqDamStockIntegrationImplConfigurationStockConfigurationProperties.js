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
 * The ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties model module.
 * @module model/ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
 * @version 1.0.0
 */
class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {
    /**
     * Constructs a new <code>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</code>.
     * @alias module:model/ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
     */
    constructor() { 
        
        ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties} The populated <code>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('locale')) {
                obj['locale'] = ConfigNodePropertyString.constructFromObject(data['locale']);
            }
            if (data.hasOwnProperty('imsConfig')) {
                obj['imsConfig'] = ConfigNodePropertyString.constructFromObject(data['imsConfig']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} locale
 */
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.prototype['locale'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} imsConfig
 */
ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties.prototype['imsConfig'] = undefined;






export default ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties;

