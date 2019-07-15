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

/**
 * The OrgApacheAriesJmxFrameworkStateConfigProperties model module.
 * @module model/OrgApacheAriesJmxFrameworkStateConfigProperties
 * @version 1.0.0
 */
class OrgApacheAriesJmxFrameworkStateConfigProperties {
    /**
     * Constructs a new <code>OrgApacheAriesJmxFrameworkStateConfigProperties</code>.
     * @alias module:model/OrgApacheAriesJmxFrameworkStateConfigProperties
     */
    constructor() { 
        
        OrgApacheAriesJmxFrameworkStateConfigProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheAriesJmxFrameworkStateConfigProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheAriesJmxFrameworkStateConfigProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheAriesJmxFrameworkStateConfigProperties} The populated <code>OrgApacheAriesJmxFrameworkStateConfigProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheAriesJmxFrameworkStateConfigProperties();

            if (data.hasOwnProperty('attributeChangeNotificationEnabled')) {
                obj['attributeChangeNotificationEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['attributeChangeNotificationEnabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyBoolean} attributeChangeNotificationEnabled
 */
OrgApacheAriesJmxFrameworkStateConfigProperties.prototype['attributeChangeNotificationEnabled'] = undefined;






export default OrgApacheAriesJmxFrameworkStateConfigProperties;

