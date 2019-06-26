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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheSlingServletsGetDefaultGetServletProperties model module.
 * @module model/OrgApacheSlingServletsGetDefaultGetServletProperties
 * @version 1.0.0
 */
class OrgApacheSlingServletsGetDefaultGetServletProperties {
    /**
     * Constructs a new <code>OrgApacheSlingServletsGetDefaultGetServletProperties</code>.
     * @alias module:model/OrgApacheSlingServletsGetDefaultGetServletProperties
     */
    constructor() { 
        
        OrgApacheSlingServletsGetDefaultGetServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingServletsGetDefaultGetServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingServletsGetDefaultGetServletProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingServletsGetDefaultGetServletProperties} The populated <code>OrgApacheSlingServletsGetDefaultGetServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingServletsGetDefaultGetServletProperties();

            if (data.hasOwnProperty('aliases')) {
                obj['aliases'] = ConfigNodePropertyArray.constructFromObject(data['aliases']);
            }
            if (data.hasOwnProperty('index')) {
                obj['index'] = ConfigNodePropertyBoolean.constructFromObject(data['index']);
            }
            if (data.hasOwnProperty('index.files')) {
                obj['index.files'] = ConfigNodePropertyArray.constructFromObject(data['index.files']);
            }
            if (data.hasOwnProperty('enable.html')) {
                obj['enable.html'] = ConfigNodePropertyBoolean.constructFromObject(data['enable.html']);
            }
            if (data.hasOwnProperty('enable.json')) {
                obj['enable.json'] = ConfigNodePropertyBoolean.constructFromObject(data['enable.json']);
            }
            if (data.hasOwnProperty('enable.txt')) {
                obj['enable.txt'] = ConfigNodePropertyBoolean.constructFromObject(data['enable.txt']);
            }
            if (data.hasOwnProperty('enable.xml')) {
                obj['enable.xml'] = ConfigNodePropertyBoolean.constructFromObject(data['enable.xml']);
            }
            if (data.hasOwnProperty('json.maximumresults')) {
                obj['json.maximumresults'] = ConfigNodePropertyInteger.constructFromObject(data['json.maximumresults']);
            }
            if (data.hasOwnProperty('ecmaSuport')) {
                obj['ecmaSuport'] = ConfigNodePropertyBoolean.constructFromObject(data['ecmaSuport']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} aliases
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['aliases'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} index
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['index'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} index.files
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['index.files'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable.html
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['enable.html'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable.json
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['enable.json'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable.txt
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['enable.txt'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enable.xml
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['enable.xml'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} json.maximumresults
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['json.maximumresults'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} ecmaSuport
 */
OrgApacheSlingServletsGetDefaultGetServletProperties.prototype['ecmaSuport'] = undefined;






export default OrgApacheSlingServletsGetDefaultGetServletProperties;

