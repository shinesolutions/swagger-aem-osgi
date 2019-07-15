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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties model module.
 * @module model/ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</code>.
     * @alias module:model/ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
     */
    constructor() { 
        
        ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties} The populated <code>ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties();

            if (data.hasOwnProperty('offloading.jobcloner.enabled')) {
                obj['offloading.jobcloner.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['offloading.jobcloner.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} offloading.jobcloner.enabled
 */
ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.prototype['offloading.jobcloner.enabled'] = undefined;






export default ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties;

