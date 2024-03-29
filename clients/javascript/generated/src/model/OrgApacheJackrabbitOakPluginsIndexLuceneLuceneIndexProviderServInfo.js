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
import OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties from './OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties';

/**
 * The OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo model module.
 * @module model/OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</code>.
     * @alias module:model/OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
     */
    constructor() { 
        
        OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo} The populated <code>OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo();

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
                obj['properties'] = OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties.constructFromObject(data['properties']);
            }
            if (data.hasOwnProperty('additionalProperties')) {
                obj['additionalProperties'] = ApiClient.convertToType(data['additionalProperties'], 'String');
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
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['description'] = undefined;

/**
 * @member {module:model/OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties} properties
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['properties'] = undefined;

/**
 * @member {String} additionalProperties
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['additionalProperties'] = undefined;

/**
 * @member {String} bundle_location
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo.prototype['service_location'] = undefined;






export default OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo;

