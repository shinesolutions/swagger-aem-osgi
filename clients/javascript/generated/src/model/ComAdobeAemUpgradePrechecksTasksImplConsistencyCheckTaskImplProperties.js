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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties model module.
 * @module model/ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
 * @version 1.0.0
 */
class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {
    /**
     * Constructs a new <code>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</code>.
     * @alias module:model/ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
     */
    constructor() { 
        
        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties} The populated <code>ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();

            if (data.hasOwnProperty('root.path')) {
                obj['root.path'] = ConfigNodePropertyString.constructFromObject(data['root.path']);
            }
            if (data.hasOwnProperty('fix.inconsistencies')) {
                obj['fix.inconsistencies'] = ConfigNodePropertyBoolean.constructFromObject(data['fix.inconsistencies']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} root.path
 */
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.prototype['root.path'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} fix.inconsistencies
 */
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.prototype['fix.inconsistencies'] = undefined;






export default ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties;
