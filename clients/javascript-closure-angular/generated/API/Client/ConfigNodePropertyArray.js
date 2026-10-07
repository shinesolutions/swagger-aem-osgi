goog.provide('API.Client.configNodePropertyArray');

/**
 * @record
 */
API.Client.ConfigNodePropertyArray = function() {}

/**
 * property name
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.name;

/**
 * True if optional
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.optional;

/**
 * True if property is set
 * @type {!boolean}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.isSet;

/**
 * Property type, 1=String, 2=Long, 3=Integer, 7=Float, 11=Boolean, 12=Secrets(String)
 * @type {!number}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.type;

/**
 * Property value
 * @type {!Array<!string>}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.values;

/**
 * Property description
 * @type {!string}
 * @export
 */
API.Client.ConfigNodePropertyArray.prototype.description;

