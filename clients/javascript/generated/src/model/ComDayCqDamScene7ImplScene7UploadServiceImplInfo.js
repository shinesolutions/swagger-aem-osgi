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
import ComDayCqDamScene7ImplScene7UploadServiceImplProperties from './ComDayCqDamScene7ImplScene7UploadServiceImplProperties';

/**
 * The ComDayCqDamScene7ImplScene7UploadServiceImplInfo model module.
 * @module model/ComDayCqDamScene7ImplScene7UploadServiceImplInfo
 * @version 1.0.0
 */
class ComDayCqDamScene7ImplScene7UploadServiceImplInfo {
    /**
     * Constructs a new <code>ComDayCqDamScene7ImplScene7UploadServiceImplInfo</code>.
     * @alias module:model/ComDayCqDamScene7ImplScene7UploadServiceImplInfo
     */
    constructor() { 
        
        ComDayCqDamScene7ImplScene7UploadServiceImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamScene7ImplScene7UploadServiceImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamScene7ImplScene7UploadServiceImplInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamScene7ImplScene7UploadServiceImplInfo} The populated <code>ComDayCqDamScene7ImplScene7UploadServiceImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamScene7ImplScene7UploadServiceImplInfo();

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
                obj['properties'] = ComDayCqDamScene7ImplScene7UploadServiceImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamScene7ImplScene7UploadServiceImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamScene7ImplScene7UploadServiceImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamScene7ImplScene7UploadServiceImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamScene7ImplScene7UploadServiceImplProperties} properties
 */
ComDayCqDamScene7ImplScene7UploadServiceImplInfo.prototype['properties'] = undefined;






export default ComDayCqDamScene7ImplScene7UploadServiceImplInfo;
