goog.provide('API.Client.configNodePropertyInteger');

/**
 * @record
 */
API.Client.ConfigNodePropertyInteger = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.isSet;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.type;

/**
 * Property value
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.value;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyInteger.prototype.description;

