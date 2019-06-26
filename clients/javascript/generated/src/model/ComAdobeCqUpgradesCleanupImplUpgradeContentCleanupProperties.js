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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties model module.
 * @module model/ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
 * @version 1.0.0
 */
class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
    /**
     * Constructs a new <code>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</code>.
     * @alias module:model/ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
     */
    constructor() { 
        
        ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties} The populated <code>ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties();

            if (data.hasOwnProperty('delete.path.regexps')) {
                obj['delete.path.regexps'] = ConfigNodePropertyArray.constructFromObject(data['delete.path.regexps']);
            }
            if (data.hasOwnProperty('delete.sql2.query')) {
                obj['delete.sql2.query'] = ConfigNodePropertyString.constructFromObject(data['delete.sql2.query']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} delete.path.regexps
 */
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.prototype['delete.path.regexps'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} delete.sql2.query
 */
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.prototype['delete.sql2.query'] = undefined;






export default ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties;
