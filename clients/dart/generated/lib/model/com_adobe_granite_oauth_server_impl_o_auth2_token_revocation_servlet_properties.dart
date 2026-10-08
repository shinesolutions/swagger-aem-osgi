//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties {
  /// Returns a new [ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] instance.
  ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties({
    this.oauthPeriodTokenPeriodRevocationPeriodActive,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? oauthPeriodTokenPeriodRevocationPeriodActive;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties &&
    other.oauthPeriodTokenPeriodRevocationPeriodActive == oauthPeriodTokenPeriodRevocationPeriodActive;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (oauthPeriodTokenPeriodRevocationPeriodActive == null ? 0 : oauthPeriodTokenPeriodRevocationPeriodActive!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties[oauthPeriodTokenPeriodRevocationPeriodActive=$oauthPeriodTokenPeriodRevocationPeriodActive]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.oauthPeriodTokenPeriodRevocationPeriodActive != null) {
      json[r'oauth.token.revocation.active'] = this.oauthPeriodTokenPeriodRevocationPeriodActive;
    } else {
      json[r'oauth.token.revocation.active'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties(
        oauthPeriodTokenPeriodRevocationPeriodActive: ConfigNodePropertyBoolean.fromJson(json[r'oauth.token.revocation.active']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

