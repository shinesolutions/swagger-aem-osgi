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
import OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties from './OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties';

/**
 * The OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo model module.
 * @module model/OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo
 * @version 1.0.0
 */
class OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo {
    /**
     * Constructs a new <code>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</code>.
     * @alias module:model/OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo
     */
    constructor() { 
        
        OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo} The populated <code>OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo();

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
                obj['properties'] = OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.constructFromObject(data['properties']);
            }
            if (data.hasOwnProperty('bundle_location')) {
                obj['bundle_location'] = ApiClient.convertToType(data['bundle_location'], 'String');
            }
            if (data.hasOwnProperty('service_location')) {
                obj['service_location'] = ApiClient.convertToType(data['service_location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties} properties
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo.prototype['service_location'] = undefined;






export default OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo;

