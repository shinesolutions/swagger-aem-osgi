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

/**
 * The ConfigNodePropertyFloat model module.
 * @module model/ConfigNodePropertyFloat
 * @version 1.0.0
 */
class ConfigNodePropertyFloat {
    /**
     * Constructs a new <code>ConfigNodePropertyFloat</code>.
     * @alias module:model/ConfigNodePropertyFloat
     */
    constructor() { 
        
        ConfigNodePropertyFloat.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConfigNodePropertyFloat</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConfigNodePropertyFloat} obj Optional instance to populate.
     * @return {module:model/ConfigNodePropertyFloat} The populated <code>ConfigNodePropertyFloat</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConfigNodePropertyFloat();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('optional')) {
                obj['optional'] = ApiClient.convertToType(data['optional'], 'Boolean');
            }
            if (data.hasOwnProperty('is_set')) {
                obj['is_set'] = ApiClient.convertToType(data['is_set'], 'Boolean');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'Number');
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], 'Number');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
        }
        return obj;
    }


}

/**
 * property name
 * @member {String} name
 */
ConfigNodePropertyFloat.prototype['name'] = undefined;

/**
 * True if optional
 * @member {Boolean} optional
 */
ConfigNodePropertyFloat.prototype['optional'] = undefined;

/**
 * True if property is set
 * @member {Boolean} is_set
 */
ConfigNodePropertyFloat.prototype['is_set'] = undefined;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @member {Number} type
 */
ConfigNodePropertyFloat.prototype['type'] = undefined;

/**
 * Property value
 * @member {Number} values
 */
ConfigNodePropertyFloat.prototype['values'] = undefined;

/**
 * Property description
 * @member {String} description
 */
ConfigNodePropertyFloat.prototype['description'] = undefined;






export default ConfigNodePropertyFloat;
