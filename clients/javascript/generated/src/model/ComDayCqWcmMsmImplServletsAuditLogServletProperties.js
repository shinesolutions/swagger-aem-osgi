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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmMsmImplServletsAuditLogServletProperties model module.
 * @module model/ComDayCqWcmMsmImplServletsAuditLogServletProperties
 * @version 1.0.0
 */
class ComDayCqWcmMsmImplServletsAuditLogServletProperties {
    /**
     * Constructs a new <code>ComDayCqWcmMsmImplServletsAuditLogServletProperties</code>.
     * @alias module:model/ComDayCqWcmMsmImplServletsAuditLogServletProperties
     */
    constructor() { 
        
        ComDayCqWcmMsmImplServletsAuditLogServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmMsmImplServletsAuditLogServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmMsmImplServletsAuditLogServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmMsmImplServletsAuditLogServletProperties} The populated <code>ComDayCqWcmMsmImplServletsAuditLogServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmMsmImplServletsAuditLogServletProperties();

            if (data.hasOwnProperty('auditlogservlet.default.events.count')) {
                obj['auditlogservlet.default.events.count'] = ConfigNodePropertyInteger.constructFromObject(data['auditlogservlet.default.events.count']);
            }
            if (data.hasOwnProperty('auditlogservlet.default.path')) {
                obj['auditlogservlet.default.path'] = ConfigNodePropertyString.constructFromObject(data['auditlogservlet.default.path']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} auditlogservlet.default.events.count
 */
ComDayCqWcmMsmImplServletsAuditLogServletProperties.prototype['auditlogservlet.default.events.count'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} auditlogservlet.default.path
 */
ComDayCqWcmMsmImplServletsAuditLogServletProperties.prototype['auditlogservlet.default.path'] = undefined;






export default ComDayCqWcmMsmImplServletsAuditLogServletProperties;
