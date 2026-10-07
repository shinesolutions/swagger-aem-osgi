//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties {
  /// Returns a new [ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties] instance.
  ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties({
    this.schedulerPeriodExpression,
    this.jobPeriodPurgePeriodThreshold,
    this.jobPeriodPurgePeriodMaxPeriodJobs,
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
  ConfigNodePropertyInteger? jobPeriodPurgePeriodThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? jobPeriodPurgePeriodMaxPeriodJobs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.jobPeriodPurgePeriodThreshold == jobPeriodPurgePeriodThreshold &&
    other.jobPeriodPurgePeriodMaxPeriodJobs == jobPeriodPurgePeriodMaxPeriodJobs;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (jobPeriodPurgePeriodThreshold == null ? 0 : jobPeriodPurgePeriodThreshold!.hashCode) +
    (jobPeriodPurgePeriodMaxPeriodJobs == null ? 0 : jobPeriodPurgePeriodMaxPeriodJobs!.hashCode);

  @override
  String toString() => 'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties[schedulerPeriodExpression=$schedulerPeriodExpression, jobPeriodPurgePeriodThreshold=$jobPeriodPurgePeriodThreshold, jobPeriodPurgePeriodMaxPeriodJobs=$jobPeriodPurgePeriodMaxPeriodJobs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.jobPeriodPurgePeriodThreshold != null) {
      json[r'job.purge.threshold'] = this.jobPeriodPurgePeriodThreshold;
    } else {
      json[r'job.purge.threshold'] = null;
    }
    if (this.jobPeriodPurgePeriodMaxPeriodJobs != null) {
      json[r'job.purge.max.jobs'] = this.jobPeriodPurgePeriodMaxPeriodJobs;
    } else {
      json[r'job.purge.max.jobs'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        jobPeriodPurgePeriodThreshold: ConfigNodePropertyInteger.fromJson(json[r'job.purge.threshold']),
        jobPeriodPurgePeriodMaxPeriodJobs: ConfigNodePropertyInteger.fromJson(json[r'job.purge.max.jobs']),
      );
    }
    return null;
  }

  static List<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

