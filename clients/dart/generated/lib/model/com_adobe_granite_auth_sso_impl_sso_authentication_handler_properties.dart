//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {
  /// Returns a new [ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] instance.
  ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties({
    this.path,
    this.servicePeriodRanking,
    this.jaasPeriodControlFlag,
    this.jaasPeriodRealmName,
    this.jaasPeriodRanking,
    this.headers,
    this.cookies,
    this.parameters,
    this.usermap,
    this.format,
    this.trustedCredentialsAttribute,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? servicePeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodControlFlag;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodRealmName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? jaasPeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? headers;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cookies;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? parameters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? usermap;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? format;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? trustedCredentialsAttribute;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties &&
    other.path == path &&
    other.servicePeriodRanking == servicePeriodRanking &&
    other.jaasPeriodControlFlag == jaasPeriodControlFlag &&
    other.jaasPeriodRealmName == jaasPeriodRealmName &&
    other.jaasPeriodRanking == jaasPeriodRanking &&
    other.headers == headers &&
    other.cookies == cookies &&
    other.parameters == parameters &&
    other.usermap == usermap &&
    other.format == format &&
    other.trustedCredentialsAttribute == trustedCredentialsAttribute;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (servicePeriodRanking == null ? 0 : servicePeriodRanking!.hashCode) +
    (jaasPeriodControlFlag == null ? 0 : jaasPeriodControlFlag!.hashCode) +
    (jaasPeriodRealmName == null ? 0 : jaasPeriodRealmName!.hashCode) +
    (jaasPeriodRanking == null ? 0 : jaasPeriodRanking!.hashCode) +
    (headers == null ? 0 : headers!.hashCode) +
    (cookies == null ? 0 : cookies!.hashCode) +
    (parameters == null ? 0 : parameters!.hashCode) +
    (usermap == null ? 0 : usermap!.hashCode) +
    (format == null ? 0 : format!.hashCode) +
    (trustedCredentialsAttribute == null ? 0 : trustedCredentialsAttribute!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties[path=$path, servicePeriodRanking=$servicePeriodRanking, jaasPeriodControlFlag=$jaasPeriodControlFlag, jaasPeriodRealmName=$jaasPeriodRealmName, jaasPeriodRanking=$jaasPeriodRanking, headers=$headers, cookies=$cookies, parameters=$parameters, usermap=$usermap, format=$format, trustedCredentialsAttribute=$trustedCredentialsAttribute]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.servicePeriodRanking != null) {
      json[r'service.ranking'] = this.servicePeriodRanking;
    } else {
      json[r'service.ranking'] = null;
    }
    if (this.jaasPeriodControlFlag != null) {
      json[r'jaas.controlFlag'] = this.jaasPeriodControlFlag;
    } else {
      json[r'jaas.controlFlag'] = null;
    }
    if (this.jaasPeriodRealmName != null) {
      json[r'jaas.realmName'] = this.jaasPeriodRealmName;
    } else {
      json[r'jaas.realmName'] = null;
    }
    if (this.jaasPeriodRanking != null) {
      json[r'jaas.ranking'] = this.jaasPeriodRanking;
    } else {
      json[r'jaas.ranking'] = null;
    }
    if (this.headers != null) {
      json[r'headers'] = this.headers;
    } else {
      json[r'headers'] = null;
    }
    if (this.cookies != null) {
      json[r'cookies'] = this.cookies;
    } else {
      json[r'cookies'] = null;
    }
    if (this.parameters != null) {
      json[r'parameters'] = this.parameters;
    } else {
      json[r'parameters'] = null;
    }
    if (this.usermap != null) {
      json[r'usermap'] = this.usermap;
    } else {
      json[r'usermap'] = null;
    }
    if (this.format != null) {
      json[r'format'] = this.format;
    } else {
      json[r'format'] = null;
    }
    if (this.trustedCredentialsAttribute != null) {
      json[r'trustedCredentialsAttribute'] = this.trustedCredentialsAttribute;
    } else {
      json[r'trustedCredentialsAttribute'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        servicePeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'service.ranking']),
        jaasPeriodControlFlag: ConfigNodePropertyString.fromJson(json[r'jaas.controlFlag']),
        jaasPeriodRealmName: ConfigNodePropertyString.fromJson(json[r'jaas.realmName']),
        jaasPeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'jaas.ranking']),
        headers: ConfigNodePropertyArray.fromJson(json[r'headers']),
        cookies: ConfigNodePropertyArray.fromJson(json[r'cookies']),
        parameters: ConfigNodePropertyArray.fromJson(json[r'parameters']),
        usermap: ConfigNodePropertyArray.fromJson(json[r'usermap']),
        format: ConfigNodePropertyString.fromJson(json[r'format']),
        trustedCredentialsAttribute: ConfigNodePropertyString.fromJson(json[r'trustedCredentialsAttribute']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

