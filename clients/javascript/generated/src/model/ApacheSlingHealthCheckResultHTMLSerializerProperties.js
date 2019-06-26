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
 * The ApacheSlingHealthCheckResultHTMLSerializerProperties model module.
 * @module model/ApacheSlingHealthCheckResultHTMLSerializerProperties
 * @version 1.0.0
 */
class ApacheSlingHealthCheckResultHTMLSerializerProperties {
    /**
     * Constructs a new <code>ApacheSlingHealthCheckResultHTMLSerializerProperties</code>.
     * @alias module:model/ApacheSlingHealthCheckResultHTMLSerializerProperties
     */
    constructor() { 
        
        ApacheSlingHealthCheckResultHTMLSerializerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ApacheSlingHealthCheckResultHTMLSerializerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ApacheSlingHealthCheckResultHTMLSerializerProperties} obj Optional instance to populate.
     * @return {module:model/ApacheSlingHealthCheckResultHTMLSerializerProperties} The populated <code>ApacheSlingHealthCheckResultHTMLSerializerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApacheSlingHealthCheckResultHTMLSerializerProperties();

            if (data.hasOwnProperty('styleString')) {
                obj['styleString'] = ConfigNodePropertyString.constructFromObject(data['styleString']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} styleString
 */
ApacheSlingHealthCheckResultHTMLSerializerProperties.prototype['styleString'] = undefined;






export default ApacheSlingHealthCheckResultHTMLSerializerProperties;

