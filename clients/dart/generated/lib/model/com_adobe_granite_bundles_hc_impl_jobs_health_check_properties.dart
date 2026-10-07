//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties {
  /// Returns a new [ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties] instance.
  ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties({
    this.hcPeriodTags,
    this.maxPeriodQueuedPeriodJobs,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPeriodQueuedPeriodJobs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties &&
    other.hcPeriodTags == hcPeriodTags &&
    other.maxPeriodQueuedPeriodJobs == maxPeriodQueuedPeriodJobs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (maxPeriodQueuedPeriodJobs == null ? 0 : maxPeriodQueuedPeriodJobs!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties[hcPeriodTags=$hcPeriodTags, maxPeriodQueuedPeriodJobs=$maxPeriodQueuedPeriodJobs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.maxPeriodQueuedPeriodJobs != null) {
      json[r'max.queued.jobs'] = this.maxPeriodQueuedPeriodJobs;
    } else {
      json[r'max.queued.jobs'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        maxPeriodQueuedPeriodJobs: ConfigNodePropertyInteger.fromJson(json[r'max.queued.jobs']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

