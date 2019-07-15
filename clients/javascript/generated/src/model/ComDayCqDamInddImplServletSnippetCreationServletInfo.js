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
import ComDayCqDamInddImplServletSnippetCreationServletProperties from './ComDayCqDamInddImplServletSnippetCreationServletProperties';

/**
 * The ComDayCqDamInddImplServletSnippetCreationServletInfo model module.
 * @module model/ComDayCqDamInddImplServletSnippetCreationServletInfo
 * @version 1.0.0
 */
class ComDayCqDamInddImplServletSnippetCreationServletInfo {
    /**
     * Constructs a new <code>ComDayCqDamInddImplServletSnippetCreationServletInfo</code>.
     * @alias module:model/ComDayCqDamInddImplServletSnippetCreationServletInfo
     */
    constructor() { 
        
        ComDayCqDamInddImplServletSnippetCreationServletInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamInddImplServletSnippetCreationServletInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamInddImplServletSnippetCreationServletInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamInddImplServletSnippetCreationServletInfo} The populated <code>ComDayCqDamInddImplServletSnippetCreationServletInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamInddImplServletSnippetCreationServletInfo();

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
                obj['properties'] = ComDayCqDamInddImplServletSnippetCreationServletProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqDamInddImplServletSnippetCreationServletInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqDamInddImplServletSnippetCreationServletInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqDamInddImplServletSnippetCreationServletInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqDamInddImplServletSnippetCreationServletProperties} properties
 */
ComDayCqDamInddImplServletSnippetCreationServletInfo.prototype['properties'] = undefined;






export default ComDayCqDamInddImplServletSnippetCreationServletInfo;

