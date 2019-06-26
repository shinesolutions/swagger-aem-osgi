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
import OrgApacheFelixScrScrServiceProperties from './OrgApacheFelixScrScrServiceProperties';

/**
 * The OrgApacheFelixScrScrServiceInfo model module.
 * @module model/OrgApacheFelixScrScrServiceInfo
 * @version 1.0.0
 */
class OrgApacheFelixScrScrServiceInfo {
    /**
     * Constructs a new <code>OrgApacheFelixScrScrServiceInfo</code>.
     * @alias module:model/OrgApacheFelixScrScrServiceInfo
     */
    constructor() { 
        
        OrgApacheFelixScrScrServiceInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheFelixScrScrServiceInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheFelixScrScrServiceInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheFelixScrScrServiceInfo} The populated <code>OrgApacheFelixScrScrServiceInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheFelixScrScrServiceInfo();

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
                obj['properties'] = OrgApacheFelixScrScrServiceProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
OrgApacheFelixScrScrServiceInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheFelixScrScrServiceInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheFelixScrScrServiceInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheFelixScrScrServiceProperties} properties
 */
OrgApacheFelixScrScrServiceInfo.prototype['properties'] = undefined;






export default OrgApacheFelixScrScrServiceInfo;

