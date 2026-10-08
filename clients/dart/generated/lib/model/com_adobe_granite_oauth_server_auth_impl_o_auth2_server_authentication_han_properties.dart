//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties {
  /// Returns a new [ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties] instance.
  ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties({
    this.path,
    this.jaasPeriodControlFlag,
    this.jaasPeriodRealmName,
    this.jaasPeriodRanking,
    this.oauthPeriodOfflinePeriodValidation,
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
  ConfigNodePropertyBoolean? oauthPeriodOfflinePeriodValidation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties &&
    other.path == path &&
    other.jaasPeriodControlFlag == jaasPeriodControlFlag &&
    other.jaasPeriodRealmName == jaasPeriodRealmName &&
    other.jaasPeriodRanking == jaasPeriodRanking &&
    other.oauthPeriodOfflinePeriodValidation == oauthPeriodOfflinePeriodValidation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (jaasPeriodControlFlag == null ? 0 : jaasPeriodControlFlag!.hashCode) +
    (jaasPeriodRealmName == null ? 0 : jaasPeriodRealmName!.hashCode) +
    (jaasPeriodRanking == null ? 0 : jaasPeriodRanking!.hashCode) +
    (oauthPeriodOfflinePeriodValidation == null ? 0 : oauthPeriodOfflinePeriodValidation!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties[path=$path, jaasPeriodControlFlag=$jaasPeriodControlFlag, jaasPeriodRealmName=$jaasPeriodRealmName, jaasPeriodRanking=$jaasPeriodRanking, oauthPeriodOfflinePeriodValidation=$oauthPeriodOfflinePeriodValidation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
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
    if (this.oauthPeriodOfflinePeriodValidation != null) {
      json[r'oauth.offline.validation'] = this.oauthPeriodOfflinePeriodValidation;
    } else {
      json[r'oauth.offline.validation'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        jaasPeriodControlFlag: ConfigNodePropertyString.fromJson(json[r'jaas.controlFlag']),
        jaasPeriodRealmName: ConfigNodePropertyString.fromJson(json[r'jaas.realmName']),
        jaasPeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'jaas.ranking']),
        oauthPeriodOfflinePeriodValidation: ConfigNodePropertyBoolean.fromJson(json[r'oauth.offline.validation']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

