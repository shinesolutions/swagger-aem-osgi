//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
  /// Returns a new [OrgApacheSlingEventImplJobsDefaultJobManagerProperties] instance.
  OrgApacheSlingEventImplJobsDefaultJobManagerProperties({
    this.queuePeriodPriority,
    this.queuePeriodRetries,
    this.queuePeriodRetrydelay,
    this.queuePeriodMaxparallel,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? queuePeriodPriority;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodRetries;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodRetrydelay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queuePeriodMaxparallel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEventImplJobsDefaultJobManagerProperties &&
    other.queuePeriodPriority == queuePeriodPriority &&
    other.queuePeriodRetries == queuePeriodRetries &&
    other.queuePeriodRetrydelay == queuePeriodRetrydelay &&
    other.queuePeriodMaxparallel == queuePeriodMaxparallel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (queuePeriodPriority == null ? 0 : queuePeriodPriority!.hashCode) +
    (queuePeriodRetries == null ? 0 : queuePeriodRetries!.hashCode) +
    (queuePeriodRetrydelay == null ? 0 : queuePeriodRetrydelay!.hashCode) +
    (queuePeriodMaxparallel == null ? 0 : queuePeriodMaxparallel!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEventImplJobsDefaultJobManagerProperties[queuePeriodPriority=$queuePeriodPriority, queuePeriodRetries=$queuePeriodRetries, queuePeriodRetrydelay=$queuePeriodRetrydelay, queuePeriodMaxparallel=$queuePeriodMaxparallel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.queuePeriodPriority != null) {
      json[r'queue.priority'] = this.queuePeriodPriority;
    } else {
      json[r'queue.priority'] = null;
    }
    if (this.queuePeriodRetries != null) {
      json[r'queue.retries'] = this.queuePeriodRetries;
    } else {
      json[r'queue.retries'] = null;
    }
    if (this.queuePeriodRetrydelay != null) {
      json[r'queue.retrydelay'] = this.queuePeriodRetrydelay;
    } else {
      json[r'queue.retrydelay'] = null;
    }
    if (this.queuePeriodMaxparallel != null) {
      json[r'queue.maxparallel'] = this.queuePeriodMaxparallel;
    } else {
      json[r'queue.maxparallel'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEventImplJobsDefaultJobManagerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEventImplJobsDefaultJobManagerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEventImplJobsDefaultJobManagerProperties(
        queuePeriodPriority: ConfigNodePropertyDropDown.fromJson(json[r'queue.priority']),
        queuePeriodRetries: ConfigNodePropertyInteger.fromJson(json[r'queue.retries']),
        queuePeriodRetrydelay: ConfigNodePropertyInteger.fromJson(json[r'queue.retrydelay']),
        queuePeriodMaxparallel: ConfigNodePropertyInteger.fromJson(json[r'queue.maxparallel']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEventImplJobsDefaultJobManagerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEventImplJobsDefaultJobManagerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEventImplJobsDefaultJobManagerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEventImplJobsDefaultJobManagerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEventImplJobsDefaultJobManagerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEventImplJobsDefaultJobManagerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEventImplJobsDefaultJobManagerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEventImplJobsDefaultJobManagerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEventImplJobsDefaultJobManagerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEventImplJobsDefaultJobManagerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

