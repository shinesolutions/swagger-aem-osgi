//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteFragsImplRandomFeatureProperties {
  /// Returns a new [ComAdobeGraniteFragsImplRandomFeatureProperties] instance.
  ComAdobeGraniteFragsImplRandomFeatureProperties({
    this.featurePeriodName,
    this.featurePeriodDescription,
    this.activePeriodPercentage,
    this.cookiePeriodName,
    this.cookiePeriodMaxAge,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? featurePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? featurePeriodDescription;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? activePeriodPercentage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cookiePeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cookiePeriodMaxAge;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteFragsImplRandomFeatureProperties &&
    other.featurePeriodName == featurePeriodName &&
    other.featurePeriodDescription == featurePeriodDescription &&
    other.activePeriodPercentage == activePeriodPercentage &&
    other.cookiePeriodName == cookiePeriodName &&
    other.cookiePeriodMaxAge == cookiePeriodMaxAge;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (featurePeriodName == null ? 0 : featurePeriodName!.hashCode) +
    (featurePeriodDescription == null ? 0 : featurePeriodDescription!.hashCode) +
    (activePeriodPercentage == null ? 0 : activePeriodPercentage!.hashCode) +
    (cookiePeriodName == null ? 0 : cookiePeriodName!.hashCode) +
    (cookiePeriodMaxAge == null ? 0 : cookiePeriodMaxAge!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteFragsImplRandomFeatureProperties[featurePeriodName=$featurePeriodName, featurePeriodDescription=$featurePeriodDescription, activePeriodPercentage=$activePeriodPercentage, cookiePeriodName=$cookiePeriodName, cookiePeriodMaxAge=$cookiePeriodMaxAge]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.featurePeriodName != null) {
      json[r'feature.name'] = this.featurePeriodName;
    } else {
      json[r'feature.name'] = null;
    }
    if (this.featurePeriodDescription != null) {
      json[r'feature.description'] = this.featurePeriodDescription;
    } else {
      json[r'feature.description'] = null;
    }
    if (this.activePeriodPercentage != null) {
      json[r'active.percentage'] = this.activePeriodPercentage;
    } else {
      json[r'active.percentage'] = null;
    }
    if (this.cookiePeriodName != null) {
      json[r'cookie.name'] = this.cookiePeriodName;
    } else {
      json[r'cookie.name'] = null;
    }
    if (this.cookiePeriodMaxAge != null) {
      json[r'cookie.maxAge'] = this.cookiePeriodMaxAge;
    } else {
      json[r'cookie.maxAge'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteFragsImplRandomFeatureProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteFragsImplRandomFeatureProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteFragsImplRandomFeatureProperties(
        featurePeriodName: ConfigNodePropertyString.fromJson(json[r'feature.name']),
        featurePeriodDescription: ConfigNodePropertyString.fromJson(json[r'feature.description']),
        activePeriodPercentage: ConfigNodePropertyString.fromJson(json[r'active.percentage']),
        cookiePeriodName: ConfigNodePropertyString.fromJson(json[r'cookie.name']),
        cookiePeriodMaxAge: ConfigNodePropertyInteger.fromJson(json[r'cookie.maxAge']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteFragsImplRandomFeatureProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteFragsImplRandomFeatureProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteFragsImplRandomFeatureProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteFragsImplRandomFeatureProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteFragsImplRandomFeatureProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteFragsImplRandomFeatureProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteFragsImplRandomFeatureProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteFragsImplRandomFeatureProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteFragsImplRandomFeatureProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteFragsImplRandomFeatureProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

