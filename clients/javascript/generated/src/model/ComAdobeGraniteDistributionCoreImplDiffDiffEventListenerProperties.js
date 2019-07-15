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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties model module.
 * @module model/ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
 * @version 1.0.0
 */
class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</code>.
     * @alias module:model/ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
     */
    constructor() { 
        
        ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties} The populated <code>ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties();

            if (data.hasOwnProperty('diffPath')) {
                obj['diffPath'] = ConfigNodePropertyString.constructFromObject(data['diffPath']);
            }
            if (data.hasOwnProperty('serviceName')) {
                obj['serviceName'] = ConfigNodePropertyString.constructFromObject(data['serviceName']);
            }
            if (data.hasOwnProperty('serviceUser.target')) {
                obj['serviceUser.target'] = ConfigNodePropertyString.constructFromObject(data['serviceUser.target']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} diffPath
 */
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.prototype['diffPath'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} serviceName
 */
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.prototype['serviceName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} serviceUser.target
 */
ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.prototype['serviceUser.target'] = undefined;






export default ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties;

