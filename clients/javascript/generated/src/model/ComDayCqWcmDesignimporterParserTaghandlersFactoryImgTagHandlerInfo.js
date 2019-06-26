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
import ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties from './ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties';

/**
 * The ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo model module.
 * @module model/ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo
 * @version 1.0.0
 */
class ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo {
    /**
     * Constructs a new <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo</code>.
     * @alias module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo
     */
    constructor() { 
        
        ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo} The populated <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo();

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
                obj['properties'] = ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties} properties
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo.prototype['properties'] = undefined;






export default ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo;

