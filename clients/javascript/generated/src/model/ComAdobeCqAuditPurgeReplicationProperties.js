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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqAuditPurgeReplicationProperties model module.
 * @module model/ComAdobeCqAuditPurgeReplicationProperties
 * @version 1.0.0
 */
class ComAdobeCqAuditPurgeReplicationProperties {
    /**
     * Constructs a new <code>ComAdobeCqAuditPurgeReplicationProperties</code>.
     * @alias module:model/ComAdobeCqAuditPurgeReplicationProperties
     */
    constructor() { 
        
        ComAdobeCqAuditPurgeReplicationProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqAuditPurgeReplicationProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqAuditPurgeReplicationProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqAuditPurgeReplicationProperties} The populated <code>ComAdobeCqAuditPurgeReplicationProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqAuditPurgeReplicationProperties();

            if (data.hasOwnProperty('auditlog.rule.name')) {
                obj['auditlog.rule.name'] = ConfigNodePropertyString.constructFromObject(data['auditlog.rule.name']);
            }
            if (data.hasOwnProperty('auditlog.rule.contentpath')) {
                obj['auditlog.rule.contentpath'] = ConfigNodePropertyString.constructFromObject(data['auditlog.rule.contentpath']);
            }
            if (data.hasOwnProperty('auditlog.rule.minimumage')) {
                obj['auditlog.rule.minimumage'] = ConfigNodePropertyInteger.constructFromObject(data['auditlog.rule.minimumage']);
            }
            if (data.hasOwnProperty('auditlog.rule.types')) {
                obj['auditlog.rule.types'] = ConfigNodePropertyDropDown.constructFromObject(data['auditlog.rule.types']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} auditlog.rule.name
 */
ComAdobeCqAuditPurgeReplicationProperties.prototype['auditlog.rule.name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} auditlog.rule.contentpath
 */
ComAdobeCqAuditPurgeReplicationProperties.prototype['auditlog.rule.contentpath'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} auditlog.rule.minimumage
 */
ComAdobeCqAuditPurgeReplicationProperties.prototype['auditlog.rule.minimumage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} auditlog.rule.types
 */
ComAdobeCqAuditPurgeReplicationProperties.prototype['auditlog.rule.types'] = undefined;






export default ComAdobeCqAuditPurgeReplicationProperties;

