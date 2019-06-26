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
 * The ComDayCqWcmCoreMvtMVTStatisticsImplProperties model module.
 * @module model/ComDayCqWcmCoreMvtMVTStatisticsImplProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreMvtMVTStatisticsImplProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreMvtMVTStatisticsImplProperties</code>.
     * @alias module:model/ComDayCqWcmCoreMvtMVTStatisticsImplProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreMvtMVTStatisticsImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreMvtMVTStatisticsImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreMvtMVTStatisticsImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreMvtMVTStatisticsImplProperties} The populated <code>ComDayCqWcmCoreMvtMVTStatisticsImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreMvtMVTStatisticsImplProperties();

            if (data.hasOwnProperty('mvtstatistics.trackingurl')) {
                obj['mvtstatistics.trackingurl'] = ConfigNodePropertyString.constructFromObject(data['mvtstatistics.trackingurl']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} mvtstatistics.trackingurl
 */
ComDayCqWcmCoreMvtMVTStatisticsImplProperties.prototype['mvtstatistics.trackingurl'] = undefined;






export default ComDayCqWcmCoreMvtMVTStatisticsImplProperties;
