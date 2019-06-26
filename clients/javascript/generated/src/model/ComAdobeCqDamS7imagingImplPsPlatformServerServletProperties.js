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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties model module.
 * @module model/ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
 * @version 1.0.0
 */
class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
    /**
     * Constructs a new <code>ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</code>.
     * @alias module:model/ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
     */
    constructor() { 
        
        ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties} The populated <code>ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties();

            if (data.hasOwnProperty('cache.enable')) {
                obj['cache.enable'] = ConfigNodePropertyBoolean.constructFromObject(data['cache.enable']);
            }
            if (data.hasOwnProperty('cache.rootPaths')) {
                obj['cache.rootPaths'] = ConfigNodePropertyArray.constructFromObject(data['cache.rootPaths']);
            }
            if (data.hasOwnProperty('cache.maxSize')) {
                obj['cache.maxSize'] = ConfigNodePropertyInteger.constructFromObject(data['cache.maxSize']);
            }
            if (data.hasOwnProperty('cache.maxEntries')) {
                obj['cache.maxEntries'] = ConfigNodePropertyInteger.constructFromObject(data['cache.maxEntries']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} cache.enable
 */
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.prototype['cache.enable'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} cache.rootPaths
 */
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.prototype['cache.rootPaths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache.maxSize
 */
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.prototype['cache.maxSize'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cache.maxEntries
 */
ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties.prototype['cache.maxEntries'] = undefined;






export default ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties;

