//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteOptoutImplOptOutServiceImplProperties {
  /// Returns a new [ComAdobeGraniteOptoutImplOptOutServiceImplProperties] instance.
  ComAdobeGraniteOptoutImplOptOutServiceImplProperties({
    this.optoutPeriodCookies,
    this.optoutPeriodHeaders,
    this.optoutPeriodWhitelistPeriodCookies,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? optoutPeriodCookies;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? optoutPeriodHeaders;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? optoutPeriodWhitelistPeriodCookies;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteOptoutImplOptOutServiceImplProperties &&
    other.optoutPeriodCookies == optoutPeriodCookies &&
    other.optoutPeriodHeaders == optoutPeriodHeaders &&
    other.optoutPeriodWhitelistPeriodCookies == optoutPeriodWhitelistPeriodCookies;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (optoutPeriodCookies == null ? 0 : optoutPeriodCookies!.hashCode) +
    (optoutPeriodHeaders == null ? 0 : optoutPeriodHeaders!.hashCode) +
    (optoutPeriodWhitelistPeriodCookies == null ? 0 : optoutPeriodWhitelistPeriodCookies!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteOptoutImplOptOutServiceImplProperties[optoutPeriodCookies=$optoutPeriodCookies, optoutPeriodHeaders=$optoutPeriodHeaders, optoutPeriodWhitelistPeriodCookies=$optoutPeriodWhitelistPeriodCookies]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.optoutPeriodCookies != null) {
      json[r'optout.cookies'] = this.optoutPeriodCookies;
    } else {
      json[r'optout.cookies'] = null;
    }
    if (this.optoutPeriodHeaders != null) {
      json[r'optout.headers'] = this.optoutPeriodHeaders;
    } else {
      json[r'optout.headers'] = null;
    }
    if (this.optoutPeriodWhitelistPeriodCookies != null) {
      json[r'optout.whitelist.cookies'] = this.optoutPeriodWhitelistPeriodCookies;
    } else {
      json[r'optout.whitelist.cookies'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteOptoutImplOptOutServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteOptoutImplOptOutServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteOptoutImplOptOutServiceImplProperties(
        optoutPeriodCookies: ConfigNodePropertyArray.fromJson(json[r'optout.cookies']),
        optoutPeriodHeaders: ConfigNodePropertyArray.fromJson(json[r'optout.headers']),
        optoutPeriodWhitelistPeriodCookies: ConfigNodePropertyArray.fromJson(json[r'optout.whitelist.cookies']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteOptoutImplOptOutServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteOptoutImplOptOutServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteOptoutImplOptOutServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteOptoutImplOptOutServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteOptoutImplOptOutServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteOptoutImplOptOutServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteOptoutImplOptOutServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteOptoutImplOptOutServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteOptoutImplOptOutServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteOptoutImplOptOutServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

