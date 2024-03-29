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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties model module.
 * @module model/OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
 * @version 1.0.0
 */
class OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties {
    /**
     * Constructs a new <code>OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</code>.
     * @alias module:model/OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
     */
    constructor() { 
        
        OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties} The populated <code>OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties();

            if (data.hasOwnProperty('alias')) {
                obj['alias'] = ConfigNodePropertyString.constructFromObject(data['alias']);
            }
            if (data.hasOwnProperty('dav.create-absolute-uri')) {
                obj['dav.create-absolute-uri'] = ConfigNodePropertyBoolean.constructFromObject(data['dav.create-absolute-uri']);
            }
            if (data.hasOwnProperty('dav.protectedhandlers')) {
                obj['dav.protectedhandlers'] = ConfigNodePropertyString.constructFromObject(data['dav.protectedhandlers']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} alias
 */
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.prototype['alias'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} dav.create-absolute-uri
 */
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.prototype['dav.create-absolute-uri'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} dav.protectedhandlers
 */
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.prototype['dav.protectedhandlers'] = undefined;






export default OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties;

