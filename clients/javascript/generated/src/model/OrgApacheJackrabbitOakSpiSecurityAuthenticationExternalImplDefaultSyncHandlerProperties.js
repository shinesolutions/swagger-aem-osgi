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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties model module.
 * @module model/OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties
 * @version 1.0.0
 */
class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties {
    /**
     * Constructs a new <code>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties</code>.
     * @alias module:model/OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties
     */
    constructor() { 
        
        OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties} The populated <code>OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties();

            if (data.hasOwnProperty('handler.name')) {
                obj['handler.name'] = ConfigNodePropertyString.constructFromObject(data['handler.name']);
            }
            if (data.hasOwnProperty('user.expirationTime')) {
                obj['user.expirationTime'] = ConfigNodePropertyString.constructFromObject(data['user.expirationTime']);
            }
            if (data.hasOwnProperty('user.autoMembership')) {
                obj['user.autoMembership'] = ConfigNodePropertyArray.constructFromObject(data['user.autoMembership']);
            }
            if (data.hasOwnProperty('user.propertyMapping')) {
                obj['user.propertyMapping'] = ConfigNodePropertyArray.constructFromObject(data['user.propertyMapping']);
            }
            if (data.hasOwnProperty('user.pathPrefix')) {
                obj['user.pathPrefix'] = ConfigNodePropertyString.constructFromObject(data['user.pathPrefix']);
            }
            if (data.hasOwnProperty('user.membershipExpTime')) {
                obj['user.membershipExpTime'] = ConfigNodePropertyString.constructFromObject(data['user.membershipExpTime']);
            }
            if (data.hasOwnProperty('user.membershipNestingDepth')) {
                obj['user.membershipNestingDepth'] = ConfigNodePropertyInteger.constructFromObject(data['user.membershipNestingDepth']);
            }
            if (data.hasOwnProperty('user.dynamicMembership')) {
                obj['user.dynamicMembership'] = ConfigNodePropertyBoolean.constructFromObject(data['user.dynamicMembership']);
            }
            if (data.hasOwnProperty('user.disableMissing')) {
                obj['user.disableMissing'] = ConfigNodePropertyBoolean.constructFromObject(data['user.disableMissing']);
            }
            if (data.hasOwnProperty('group.expirationTime')) {
                obj['group.expirationTime'] = ConfigNodePropertyString.constructFromObject(data['group.expirationTime']);
            }
            if (data.hasOwnProperty('group.autoMembership')) {
                obj['group.autoMembership'] = ConfigNodePropertyArray.constructFromObject(data['group.autoMembership']);
            }
            if (data.hasOwnProperty('group.propertyMapping')) {
                obj['group.propertyMapping'] = ConfigNodePropertyArray.constructFromObject(data['group.propertyMapping']);
            }
            if (data.hasOwnProperty('group.pathPrefix')) {
                obj['group.pathPrefix'] = ConfigNodePropertyString.constructFromObject(data['group.pathPrefix']);
            }
            if (data.hasOwnProperty('enableRFC7613UsercaseMappedProfile')) {
                obj['enableRFC7613UsercaseMappedProfile'] = ConfigNodePropertyBoolean.constructFromObject(data['enableRFC7613UsercaseMappedProfile']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} handler.name
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['handler.name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} user.expirationTime
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.expirationTime'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} user.autoMembership
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.autoMembership'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} user.propertyMapping
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.propertyMapping'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} user.pathPrefix
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.pathPrefix'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} user.membershipExpTime
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.membershipExpTime'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} user.membershipNestingDepth
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.membershipNestingDepth'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} user.dynamicMembership
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.dynamicMembership'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} user.disableMissing
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['user.disableMissing'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} group.expirationTime
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['group.expirationTime'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} group.autoMembership
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['group.autoMembership'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} group.propertyMapping
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['group.propertyMapping'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} group.pathPrefix
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['group.pathPrefix'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enableRFC7613UsercaseMappedProfile
 */
OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties.prototype['enableRFC7613UsercaseMappedProfile'] = undefined;






export default OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDefaultSyncHandlerProperties;

