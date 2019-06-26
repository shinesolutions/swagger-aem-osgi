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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';

/**
 * The ComDayCqDamCoreImplServletAssetDownloadServletProperties model module.
 * @module model/ComDayCqDamCoreImplServletAssetDownloadServletProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplServletAssetDownloadServletProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplServletAssetDownloadServletProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplServletAssetDownloadServletProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplServletAssetDownloadServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplServletAssetDownloadServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplServletAssetDownloadServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplServletAssetDownloadServletProperties} The populated <code>ComDayCqDamCoreImplServletAssetDownloadServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplServletAssetDownloadServletProperties();

            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
ComDayCqDamCoreImplServletAssetDownloadServletProperties.prototype['enabled'] = undefined;






export default ComDayCqDamCoreImplServletAssetDownloadServletProperties;
