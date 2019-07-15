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

/**
 * The ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties model module.
 * @module model/ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
 * @version 1.0.0
 */
class ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</code>.
     * @alias module:model/ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
     */
    constructor() { 
        
        ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties} The populated <code>ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties();

            if (data.hasOwnProperty('hc.tags')) {
                obj['hc.tags'] = ConfigNodePropertyArray.constructFromObject(data['hc.tags']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} hc.tags
 */
ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties.prototype['hc.tags'] = undefined;






export default ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties;

