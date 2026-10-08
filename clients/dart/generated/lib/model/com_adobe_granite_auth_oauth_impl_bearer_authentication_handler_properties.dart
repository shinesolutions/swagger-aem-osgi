//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties {
  /// Returns a new [ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties] instance.
  ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties({
    this.path,
    this.oauthPeriodClientIdsPeriodAllowed,
    this.authPeriodBearerPeriodSyncPeriodIms,
    this.authPeriodTokenRequestParameter,
    this.oauthPeriodBearerPeriodConfigid,
    this.oauthPeriodJwtPeriodSupport,
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
  ConfigNodePropertyArray? oauthPeriodClientIdsPeriodAllowed;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? authPeriodBearerPeriodSyncPeriodIms;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? authPeriodTokenRequestParameter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodBearerPeriodConfigid;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? oauthPeriodJwtPeriodSupport;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties &&
    other.path == path &&
    other.oauthPeriodClientIdsPeriodAllowed == oauthPeriodClientIdsPeriodAllowed &&
    other.authPeriodBearerPeriodSyncPeriodIms == authPeriodBearerPeriodSyncPeriodIms &&
    other.authPeriodTokenRequestParameter == authPeriodTokenRequestParameter &&
    other.oauthPeriodBearerPeriodConfigid == oauthPeriodBearerPeriodConfigid &&
    other.oauthPeriodJwtPeriodSupport == oauthPeriodJwtPeriodSupport;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (oauthPeriodClientIdsPeriodAllowed == null ? 0 : oauthPeriodClientIdsPeriodAllowed!.hashCode) +
    (authPeriodBearerPeriodSyncPeriodIms == null ? 0 : authPeriodBearerPeriodSyncPeriodIms!.hashCode) +
    (authPeriodTokenRequestParameter == null ? 0 : authPeriodTokenRequestParameter!.hashCode) +
    (oauthPeriodBearerPeriodConfigid == null ? 0 : oauthPeriodBearerPeriodConfigid!.hashCode) +
    (oauthPeriodJwtPeriodSupport == null ? 0 : oauthPeriodJwtPeriodSupport!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties[path=$path, oauthPeriodClientIdsPeriodAllowed=$oauthPeriodClientIdsPeriodAllowed, authPeriodBearerPeriodSyncPeriodIms=$authPeriodBearerPeriodSyncPeriodIms, authPeriodTokenRequestParameter=$authPeriodTokenRequestParameter, oauthPeriodBearerPeriodConfigid=$oauthPeriodBearerPeriodConfigid, oauthPeriodJwtPeriodSupport=$oauthPeriodJwtPeriodSupport]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.oauthPeriodClientIdsPeriodAllowed != null) {
      json[r'oauth.clientIds.allowed'] = this.oauthPeriodClientIdsPeriodAllowed;
    } else {
      json[r'oauth.clientIds.allowed'] = null;
    }
    if (this.authPeriodBearerPeriodSyncPeriodIms != null) {
      json[r'auth.bearer.sync.ims'] = this.authPeriodBearerPeriodSyncPeriodIms;
    } else {
      json[r'auth.bearer.sync.ims'] = null;
    }
    if (this.authPeriodTokenRequestParameter != null) {
      json[r'auth.tokenRequestParameter'] = this.authPeriodTokenRequestParameter;
    } else {
      json[r'auth.tokenRequestParameter'] = null;
    }
    if (this.oauthPeriodBearerPeriodConfigid != null) {
      json[r'oauth.bearer.configid'] = this.oauthPeriodBearerPeriodConfigid;
    } else {
      json[r'oauth.bearer.configid'] = null;
    }
    if (this.oauthPeriodJwtPeriodSupport != null) {
      json[r'oauth.jwt.support'] = this.oauthPeriodJwtPeriodSupport;
    } else {
      json[r'oauth.jwt.support'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        oauthPeriodClientIdsPeriodAllowed: ConfigNodePropertyArray.fromJson(json[r'oauth.clientIds.allowed']),
        authPeriodBearerPeriodSyncPeriodIms: ConfigNodePropertyBoolean.fromJson(json[r'auth.bearer.sync.ims']),
        authPeriodTokenRequestParameter: ConfigNodePropertyString.fromJson(json[r'auth.tokenRequestParameter']),
        oauthPeriodBearerPeriodConfigid: ConfigNodePropertyString.fromJson(json[r'oauth.bearer.configid']),
        oauthPeriodJwtPeriodSupport: ConfigNodePropertyBoolean.fromJson(json[r'oauth.jwt.support']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

