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
 * The ComAdobeGraniteHttpcacheFileFileCacheStoreProperties model module.
 * @module model/ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
 * @version 1.0.0
 */
class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</code>.
     * @alias module:model/ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
     */
    constructor() { 
        
        ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteHttpcacheFileFileCacheStoreProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteHttpcacheFileFileCacheStoreProperties} The populated <code>ComAdobeGraniteHttpcacheFileFileCacheStoreProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();

            if (data.hasOwnProperty('com.adobe.granite.httpcache.file.documentRoot')) {
                obj['com.adobe.granite.httpcache.file.documentRoot'] = ConfigNodePropertyString.constructFromObject(data['com.adobe.granite.httpcache.file.documentRoot']);
            }
            if (data.hasOwnProperty('com.adobe.granite.httpcache.file.includeHost')) {
                obj['com.adobe.granite.httpcache.file.includeHost'] = ConfigNodePropertyString.constructFromObject(data['com.adobe.granite.httpcache.file.includeHost']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} com.adobe.granite.httpcache.file.documentRoot
 */
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.prototype['com.adobe.granite.httpcache.file.documentRoot'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} com.adobe.granite.httpcache.file.includeHost
 */
ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.prototype['com.adobe.granite.httpcache.file.includeHost'] = undefined;






export default ComAdobeGraniteHttpcacheFileFileCacheStoreProperties;

