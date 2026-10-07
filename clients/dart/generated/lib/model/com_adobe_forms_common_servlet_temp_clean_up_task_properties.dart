//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeFormsCommonServletTempCleanUpTaskProperties {
  /// Returns a new [ComAdobeFormsCommonServletTempCleanUpTaskProperties] instance.
  ComAdobeFormsCommonServletTempCleanUpTaskProperties({
    this.schedulerPeriodExpression,
    this.durationForTemporaryStorage,
    this.durationForAnonymousStorage,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? schedulerPeriodExpression;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? durationForTemporaryStorage;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? durationForAnonymousStorage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeFormsCommonServletTempCleanUpTaskProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.durationForTemporaryStorage == durationForTemporaryStorage &&
    other.durationForAnonymousStorage == durationForAnonymousStorage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (durationForTemporaryStorage == null ? 0 : durationForTemporaryStorage!.hashCode) +
    (durationForAnonymousStorage == null ? 0 : durationForAnonymousStorage!.hashCode);

  @override
  String toString() => 'ComAdobeFormsCommonServletTempCleanUpTaskProperties[schedulerPeriodExpression=$schedulerPeriodExpression, durationForTemporaryStorage=$durationForTemporaryStorage, durationForAnonymousStorage=$durationForAnonymousStorage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.durationForTemporaryStorage != null) {
      json[r'Duration for Temporary Storage'] = this.durationForTemporaryStorage;
    } else {
      json[r'Duration for Temporary Storage'] = null;
    }
    if (this.durationForAnonymousStorage != null) {
      json[r'Duration for Anonymous Storage'] = this.durationForAnonymousStorage;
    } else {
      json[r'Duration for Anonymous Storage'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeFormsCommonServletTempCleanUpTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeFormsCommonServletTempCleanUpTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeFormsCommonServletTempCleanUpTaskProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        durationForTemporaryStorage: ConfigNodePropertyString.fromJson(json[r'Duration for Temporary Storage']),
        durationForAnonymousStorage: ConfigNodePropertyString.fromJson(json[r'Duration for Anonymous Storage']),
      );
    }
    return null;
  }

  static List<ComAdobeFormsCommonServletTempCleanUpTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeFormsCommonServletTempCleanUpTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeFormsCommonServletTempCleanUpTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeFormsCommonServletTempCleanUpTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeFormsCommonServletTempCleanUpTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeFormsCommonServletTempCleanUpTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeFormsCommonServletTempCleanUpTaskProperties-objects as value to a dart map
  static Map<String, List<ComAdobeFormsCommonServletTempCleanUpTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeFormsCommonServletTempCleanUpTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeFormsCommonServletTempCleanUpTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

