//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteCsrfImplCSRFFilterProperties {
  /// Returns a new [ComAdobeGraniteCsrfImplCSRFFilterProperties] instance.
  ComAdobeGraniteCsrfImplCSRFFilterProperties({
    this.filterPeriodMethods,
    this.filterPeriodEnablePeriodSafePeriodUserPeriodAgents,
    this.filterPeriodSafePeriodUserPeriodAgents,
    this.filterPeriodExcludedPeriodPaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodMethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? filterPeriodEnablePeriodSafePeriodUserPeriodAgents;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodSafePeriodUserPeriodAgents;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodExcludedPeriodPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteCsrfImplCSRFFilterProperties &&
    other.filterPeriodMethods == filterPeriodMethods &&
    other.filterPeriodEnablePeriodSafePeriodUserPeriodAgents == filterPeriodEnablePeriodSafePeriodUserPeriodAgents &&
    other.filterPeriodSafePeriodUserPeriodAgents == filterPeriodSafePeriodUserPeriodAgents &&
    other.filterPeriodExcludedPeriodPaths == filterPeriodExcludedPeriodPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (filterPeriodMethods == null ? 0 : filterPeriodMethods!.hashCode) +
    (filterPeriodEnablePeriodSafePeriodUserPeriodAgents == null ? 0 : filterPeriodEnablePeriodSafePeriodUserPeriodAgents!.hashCode) +
    (filterPeriodSafePeriodUserPeriodAgents == null ? 0 : filterPeriodSafePeriodUserPeriodAgents!.hashCode) +
    (filterPeriodExcludedPeriodPaths == null ? 0 : filterPeriodExcludedPeriodPaths!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteCsrfImplCSRFFilterProperties[filterPeriodMethods=$filterPeriodMethods, filterPeriodEnablePeriodSafePeriodUserPeriodAgents=$filterPeriodEnablePeriodSafePeriodUserPeriodAgents, filterPeriodSafePeriodUserPeriodAgents=$filterPeriodSafePeriodUserPeriodAgents, filterPeriodExcludedPeriodPaths=$filterPeriodExcludedPeriodPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.filterPeriodMethods != null) {
      json[r'filter.methods'] = this.filterPeriodMethods;
    } else {
      json[r'filter.methods'] = null;
    }
    if (this.filterPeriodEnablePeriodSafePeriodUserPeriodAgents != null) {
      json[r'filter.enable.safe.user.agents'] = this.filterPeriodEnablePeriodSafePeriodUserPeriodAgents;
    } else {
      json[r'filter.enable.safe.user.agents'] = null;
    }
    if (this.filterPeriodSafePeriodUserPeriodAgents != null) {
      json[r'filter.safe.user.agents'] = this.filterPeriodSafePeriodUserPeriodAgents;
    } else {
      json[r'filter.safe.user.agents'] = null;
    }
    if (this.filterPeriodExcludedPeriodPaths != null) {
      json[r'filter.excluded.paths'] = this.filterPeriodExcludedPeriodPaths;
    } else {
      json[r'filter.excluded.paths'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteCsrfImplCSRFFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteCsrfImplCSRFFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteCsrfImplCSRFFilterProperties(
        filterPeriodMethods: ConfigNodePropertyArray.fromJson(json[r'filter.methods']),
        filterPeriodEnablePeriodSafePeriodUserPeriodAgents: ConfigNodePropertyBoolean.fromJson(json[r'filter.enable.safe.user.agents']),
        filterPeriodSafePeriodUserPeriodAgents: ConfigNodePropertyArray.fromJson(json[r'filter.safe.user.agents']),
        filterPeriodExcludedPeriodPaths: ConfigNodePropertyArray.fromJson(json[r'filter.excluded.paths']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteCsrfImplCSRFFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteCsrfImplCSRFFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteCsrfImplCSRFFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteCsrfImplCSRFFilterProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteCsrfImplCSRFFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteCsrfImplCSRFFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteCsrfImplCSRFFilterProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteCsrfImplCSRFFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteCsrfImplCSRFFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteCsrfImplCSRFFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

