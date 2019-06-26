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

/**
 * The ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties model module.
 * @module model/ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
 * @version 1.0.0
 */
class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {
    /**
     * Constructs a new <code>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</code>.
     * @alias module:model/ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
     */
    constructor() { 
        
        ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties} The populated <code>ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties();

            if (data.hasOwnProperty('delete.name.regexps')) {
                obj['delete.name.regexps'] = ConfigNodePropertyArray.constructFromObject(data['delete.name.regexps']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} delete.name.regexps
 */
ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties.prototype['delete.name.regexps'] = undefined;






export default ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties;

