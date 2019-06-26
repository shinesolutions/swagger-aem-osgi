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
import ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryProperties from './ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryProperties';

/**
 * The ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo model module.
 * @module model/ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo
 * @version 1.0.0
 */
class ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo {
    /**
     * Constructs a new <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo</code>.
     * @alias module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo
     */
    constructor() { 
        
        ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo} The populated <code>ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo();

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
                obj['properties'] = ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryProperties} properties
 */
ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo.prototype['properties'] = undefined;






export default ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentTagHandlerFactoryInfo;
