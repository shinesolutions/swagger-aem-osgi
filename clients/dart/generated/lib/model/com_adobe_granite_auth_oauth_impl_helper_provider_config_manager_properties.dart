//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties {
  /// Returns a new [ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties] instance.
  ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties({
    this.oauthPeriodCookiePeriodLoginPeriodTimeout,
    this.oauthPeriodCookiePeriodMaxPeriodAge,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodCookiePeriodLoginPeriodTimeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? oauthPeriodCookiePeriodMaxPeriodAge;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties &&
    other.oauthPeriodCookiePeriodLoginPeriodTimeout == oauthPeriodCookiePeriodLoginPeriodTimeout &&
    other.oauthPeriodCookiePeriodMaxPeriodAge == oauthPeriodCookiePeriodMaxPeriodAge;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodCookiePeriodLoginPeriodTimeout == null ? 0 : oauthPeriodCookiePeriodLoginPeriodTimeout!.hashCode) +
    (oauthPeriodCookiePeriodMaxPeriodAge == null ? 0 : oauthPeriodCookiePeriodMaxPeriodAge!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties[oauthPeriodCookiePeriodLoginPeriodTimeout=$oauthPeriodCookiePeriodLoginPeriodTimeout, oauthPeriodCookiePeriodMaxPeriodAge=$oauthPeriodCookiePeriodMaxPeriodAge]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodCookiePeriodLoginPeriodTimeout != null) {
      json[r'oauth.cookie.login.timeout'] = this.oauthPeriodCookiePeriodLoginPeriodTimeout;
    } else {
      json[r'oauth.cookie.login.timeout'] = null;
    }
    if (this.oauthPeriodCookiePeriodMaxPeriodAge != null) {
      json[r'oauth.cookie.max.age'] = this.oauthPeriodCookiePeriodMaxPeriodAge;
    } else {
      json[r'oauth.cookie.max.age'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties(
        oauthPeriodCookiePeriodLoginPeriodTimeout: ConfigNodePropertyString.fromJson(json[r'oauth.cookie.login.timeout']),
        oauthPeriodCookiePeriodMaxPeriodAge: ConfigNodePropertyString.fromJson(json[r'oauth.cookie.max.age']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

