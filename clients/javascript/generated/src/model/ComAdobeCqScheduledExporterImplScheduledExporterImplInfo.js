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
import ComAdobeCqScheduledExporterImplScheduledExporterImplProperties from './ComAdobeCqScheduledExporterImplScheduledExporterImplProperties';

/**
 * The ComAdobeCqScheduledExporterImplScheduledExporterImplInfo model module.
 * @module model/ComAdobeCqScheduledExporterImplScheduledExporterImplInfo
 * @version 1.0.0
 */
class ComAdobeCqScheduledExporterImplScheduledExporterImplInfo {
    /**
     * Constructs a new <code>ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</code>.
     * @alias module:model/ComAdobeCqScheduledExporterImplScheduledExporterImplInfo
     */
    constructor() { 
        
        ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqScheduledExporterImplScheduledExporterImplInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqScheduledExporterImplScheduledExporterImplInfo} The populated <code>ComAdobeCqScheduledExporterImplScheduledExporterImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqScheduledExporterImplScheduledExporterImplInfo();

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
                obj['properties'] = ComAdobeCqScheduledExporterImplScheduledExporterImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqScheduledExporterImplScheduledExporterImplProperties} properties
 */
ComAdobeCqScheduledExporterImplScheduledExporterImplInfo.prototype['properties'] = undefined;






export default ComAdobeCqScheduledExporterImplScheduledExporterImplInfo;

