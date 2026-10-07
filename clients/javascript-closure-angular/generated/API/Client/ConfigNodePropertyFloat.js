goog.provide('API.Client.configNodePropertyFloat');

/**
 * @record
 */
API.Client.ConfigNodePropertyFloat = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.isSet;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.type;

/**
 * Property value
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.value;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyFloat.prototype.description;

