//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties {
  /// Returns a new [ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties] instance.
  ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties({
    this.largePeriodIndexPeriodCriticalPeriodThreshold,
    this.largePeriodIndexPeriodWarnPeriodThreshold,
    this.hcPeriodTags,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largePeriodIndexPeriodCriticalPeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largePeriodIndexPeriodWarnPeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties &&
    other.largePeriodIndexPeriodCriticalPeriodThreshold == largePeriodIndexPeriodCriticalPeriodThreshold &&
    other.largePeriodIndexPeriodWarnPeriodThreshold == largePeriodIndexPeriodWarnPeriodThreshold &&
    other.hcPeriodTags == hcPeriodTags;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (largePeriodIndexPeriodCriticalPeriodThreshold == null ? 0 : largePeriodIndexPeriodCriticalPeriodThreshold!.hashCode) +
    (largePeriodIndexPeriodWarnPeriodThreshold == null ? 0 : largePeriodIndexPeriodWarnPeriodThreshold!.hashCode) +
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties[largePeriodIndexPeriodCriticalPeriodThreshold=$largePeriodIndexPeriodCriticalPeriodThreshold, largePeriodIndexPeriodWarnPeriodThreshold=$largePeriodIndexPeriodWarnPeriodThreshold, hcPeriodTags=$hcPeriodTags]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.largePeriodIndexPeriodCriticalPeriodThreshold != null) {
      json[r'large.index.critical.threshold'] = this.largePeriodIndexPeriodCriticalPeriodThreshold;
    } else {
      json[r'large.index.critical.threshold'] = null;
    }
    if (this.largePeriodIndexPeriodWarnPeriodThreshold != null) {
      json[r'large.index.warn.threshold'] = this.largePeriodIndexPeriodWarnPeriodThreshold;
    } else {
      json[r'large.index.warn.threshold'] = null;
    }
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties(
        largePeriodIndexPeriodCriticalPeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'large.index.critical.threshold']),
        largePeriodIndexPeriodWarnPeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'large.index.warn.threshold']),
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

