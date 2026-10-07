//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
  /// Returns a new [ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties] instance.
  ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties({
    this.featurePeriodName,
    this.featurePeriodDescription,
    this.httpPeriodHeaderPeriodName,
    this.httpPeriodHeaderPeriodValuepattern,
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
  ConfigNodePropertyString? httpPeriodHeaderPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? httpPeriodHeaderPeriodValuepattern;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties &&
    other.featurePeriodName == featurePeriodName &&
    other.featurePeriodDescription == featurePeriodDescription &&
    other.httpPeriodHeaderPeriodName == httpPeriodHeaderPeriodName &&
    other.httpPeriodHeaderPeriodValuepattern == httpPeriodHeaderPeriodValuepattern;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (featurePeriodName == null ? 0 : featurePeriodName!.hashCode) +
    (featurePeriodDescription == null ? 0 : featurePeriodDescription!.hashCode) +
    (httpPeriodHeaderPeriodName == null ? 0 : httpPeriodHeaderPeriodName!.hashCode) +
    (httpPeriodHeaderPeriodValuepattern == null ? 0 : httpPeriodHeaderPeriodValuepattern!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties[featurePeriodName=$featurePeriodName, featurePeriodDescription=$featurePeriodDescription, httpPeriodHeaderPeriodName=$httpPeriodHeaderPeriodName, httpPeriodHeaderPeriodValuepattern=$httpPeriodHeaderPeriodValuepattern]';

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
    if (this.httpPeriodHeaderPeriodName != null) {
      json[r'http.header.name'] = this.httpPeriodHeaderPeriodName;
    } else {
      json[r'http.header.name'] = null;
    }
    if (this.httpPeriodHeaderPeriodValuepattern != null) {
      json[r'http.header.valuepattern'] = this.httpPeriodHeaderPeriodValuepattern;
    } else {
      json[r'http.header.valuepattern'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties(
        featurePeriodName: ConfigNodePropertyString.fromJson(json[r'feature.name']),
        featurePeriodDescription: ConfigNodePropertyString.fromJson(json[r'feature.description']),
        httpPeriodHeaderPeriodName: ConfigNodePropertyString.fromJson(json[r'http.header.name']),
        httpPeriodHeaderPeriodValuepattern: ConfigNodePropertyString.fromJson(json[r'http.header.valuepattern']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

