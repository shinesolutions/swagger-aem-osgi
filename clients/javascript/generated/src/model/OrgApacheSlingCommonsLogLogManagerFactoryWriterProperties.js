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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties model module.
 * @module model/OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
 * @version 1.0.0
 */
class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    /**
     * Constructs a new <code>OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</code>.
     * @alias module:model/OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
     */
    constructor() { 
        
        OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties} The populated <code>OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties();

            if (data.hasOwnProperty('org.apache.sling.commons.log.file')) {
                obj['org.apache.sling.commons.log.file'] = ConfigNodePropertyString.constructFromObject(data['org.apache.sling.commons.log.file']);
            }
            if (data.hasOwnProperty('org.apache.sling.commons.log.file.number')) {
                obj['org.apache.sling.commons.log.file.number'] = ConfigNodePropertyInteger.constructFromObject(data['org.apache.sling.commons.log.file.number']);
            }
            if (data.hasOwnProperty('org.apache.sling.commons.log.file.size')) {
                obj['org.apache.sling.commons.log.file.size'] = ConfigNodePropertyString.constructFromObject(data['org.apache.sling.commons.log.file.size']);
            }
            if (data.hasOwnProperty('org.apache.sling.commons.log.file.buffered')) {
                obj['org.apache.sling.commons.log.file.buffered'] = ConfigNodePropertyBoolean.constructFromObject(data['org.apache.sling.commons.log.file.buffered']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} org.apache.sling.commons.log.file
 */
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.prototype['org.apache.sling.commons.log.file'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} org.apache.sling.commons.log.file.number
 */
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.prototype['org.apache.sling.commons.log.file.number'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} org.apache.sling.commons.log.file.size
 */
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.prototype['org.apache.sling.commons.log.file.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} org.apache.sling.commons.log.file.buffered
 */
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.prototype['org.apache.sling.commons.log.file.buffered'] = undefined;






export default OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties;

