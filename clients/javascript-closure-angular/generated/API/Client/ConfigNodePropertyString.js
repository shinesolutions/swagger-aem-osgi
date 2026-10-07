goog.provide('API.Client.configNodePropertyString');

/**
 * @record
 */
API.Client.ConfigNodePropertyString = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.isSet;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.type;

/**
 * Property value
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.value;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyString.prototype.description;

