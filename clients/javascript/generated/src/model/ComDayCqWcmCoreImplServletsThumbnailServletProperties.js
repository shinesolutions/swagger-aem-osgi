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
 * The ComDayCqWcmCoreImplServletsThumbnailServletProperties model module.
 * @module model/ComDayCqWcmCoreImplServletsThumbnailServletProperties
 * @version 1.0.0
 */
class ComDayCqWcmCoreImplServletsThumbnailServletProperties {
    /**
     * Constructs a new <code>ComDayCqWcmCoreImplServletsThumbnailServletProperties</code>.
     * @alias module:model/ComDayCqWcmCoreImplServletsThumbnailServletProperties
     */
    constructor() { 
        
        ComDayCqWcmCoreImplServletsThumbnailServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmCoreImplServletsThumbnailServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmCoreImplServletsThumbnailServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmCoreImplServletsThumbnailServletProperties} The populated <code>ComDayCqWcmCoreImplServletsThumbnailServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmCoreImplServletsThumbnailServletProperties();

            if (data.hasOwnProperty('workspace')) {
                obj['workspace'] = ConfigNodePropertyString.constructFromObject(data['workspace']);
            }
            if (data.hasOwnProperty('dimensions')) {
                obj['dimensions'] = ConfigNodePropertyArray.constructFromObject(data['dimensions']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} workspace
 */
ComDayCqWcmCoreImplServletsThumbnailServletProperties.prototype['workspace'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} dimensions
 */
ComDayCqWcmCoreImplServletsThumbnailServletProperties.prototype['dimensions'] = undefined;






export default ComDayCqWcmCoreImplServletsThumbnailServletProperties;
