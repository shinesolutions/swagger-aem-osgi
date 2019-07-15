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
import ComDayCqDamCoreImplMissingMetadataNotificationJobProperties from './ComDayCqDamCoreImplMissingMetadataNotificationJobProperties';

/**
 * The ComDayCqDamCoreImplMissingMetadataNotificationJobInfo model module.
 * @module model/ComDayCqDamCoreImplMissingMetadataNotificationJobInfo
 * @version 1.0.0
 */
class ComDayCqDamCoreImplMissingMetadataNotificationJobInfo {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</code>.
     * @alias module:model/ComDayCqDamCoreImplMissingMetadataNotificationJobInfo
     */
    constructor() { 
        
        ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplMissingMetadataNotificationJobInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplMissingMetadataNotificationJobInfo} The populated <code>ComDayCqDamCoreImplMissingMetadataNotificationJobInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplMissingMetadataNotificationJobInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = ComDayCqDamCoreImplMissingMetadataNotificationJobProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamCoreImplMissingMetadataNotificationJobProperties} properties
 */
ComDayCqDamCoreImplMissingMetadataNotificationJobInfo.prototype['properties'] = undefined;






export default ComDayCqDamCoreImplMissingMetadataNotificationJobInfo;

