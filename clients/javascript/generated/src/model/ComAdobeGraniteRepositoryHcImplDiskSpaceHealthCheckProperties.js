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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties model module.
 * @module model/ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
 * @version 1.0.0
 */
class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</code>.
     * @alias module:model/ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
     */
    constructor() { 
        
        ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties} The populated <code>ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties();

            if (data.hasOwnProperty('hc.tags')) {
                obj['hc.tags'] = ConfigNodePropertyArray.constructFromObject(data['hc.tags']);
            }
            if (data.hasOwnProperty('disk.space.warn.threshold')) {
                obj['disk.space.warn.threshold'] = ConfigNodePropertyInteger.constructFromObject(data['disk.space.warn.threshold']);
            }
            if (data.hasOwnProperty('disk.space.error.threshold')) {
                obj['disk.space.error.threshold'] = ConfigNodePropertyInteger.constructFromObject(data['disk.space.error.threshold']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} hc.tags
 */
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.prototype['hc.tags'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} disk.space.warn.threshold
 */
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.prototype['disk.space.warn.threshold'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} disk.space.error.threshold
 */
ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties.prototype['disk.space.error.threshold'] = undefined;






export default ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties;

