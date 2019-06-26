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
 * The ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties model module.
 * @module model/ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
 * @version 1.0.0
 */
class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
    /**
     * Constructs a new <code>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</code>.
     * @alias module:model/ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
     */
    constructor() { 
        
        ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties} The populated <code>ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties();

            if (data.hasOwnProperty('process.label')) {
                obj['process.label'] = ConfigNodePropertyString.constructFromObject(data['process.label']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} process.label
 */
ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.prototype['process.label'] = undefined;






export default ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties;
