goog.provide('API.Client.configNodePropertyBoolean');

/**
 * @record
 */
API.Client.ConfigNodePropertyBoolean = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.isSet;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.type;

/**
 * Property value
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.value;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyBoolean.prototype.description;

