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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties model module.
 * @module model/ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
 * @version 1.0.0
 */
class ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties {
    /**
     * Constructs a new <code>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</code>.
     * @alias module:model/ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
     */
    constructor() { 
        
        ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties} The populated <code>ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties();

            if (data.hasOwnProperty('endpointUri')) {
                obj['endpointUri'] = ConfigNodePropertyString.constructFromObject(data['endpointUri']);
            }
            if (data.hasOwnProperty('connectionTimeout')) {
                obj['connectionTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['connectionTimeout']);
            }
            if (data.hasOwnProperty('socketTimeout')) {
                obj['socketTimeout'] = ConfigNodePropertyInteger.constructFromObject(data['socketTimeout']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} endpointUri
 */
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.prototype['endpointUri'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} connectionTimeout
 */
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.prototype['connectionTimeout'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} socketTimeout
 */
ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties.prototype['socketTimeout'] = undefined;






export default ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties;

