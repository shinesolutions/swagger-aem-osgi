goog.provide('API.Client.configNodePropertyDropDown');

/**
 * @record
 */
API.Client.ConfigNodePropertyDropDown = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.isSet;

/**
 * @type {!API.Client.configNodePropertyDropDown_type}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.type;

/**
 * Property value
 * @type {!API.Client.Object}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.value;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyDropDown.prototype.description;

