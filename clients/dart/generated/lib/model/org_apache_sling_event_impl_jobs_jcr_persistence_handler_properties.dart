//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties {
  /// Returns a new [OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties] instance.
  OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties({
    this.jobPeriodConsumermanagerPeriodDisableDistribution,
    this.startupPeriodDelay,
    this.cleanupPeriodPeriod,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? jobPeriodConsumermanagerPeriodDisableDistribution;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? startupPeriodDelay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cleanupPeriodPeriod;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties &&
    other.jobPeriodConsumermanagerPeriodDisableDistribution == jobPeriodConsumermanagerPeriodDisableDistribution &&
    other.startupPeriodDelay == startupPeriodDelay &&
    other.cleanupPeriodPeriod == cleanupPeriodPeriod;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jobPeriodConsumermanagerPeriodDisableDistribution == null ? 0 : jobPeriodConsumermanagerPeriodDisableDistribution!.hashCode) +
    (startupPeriodDelay == null ? 0 : startupPeriodDelay!.hashCode) +
    (cleanupPeriodPeriod == null ? 0 : cleanupPeriodPeriod!.hashCode);

  @override
  String toString() => 'OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties[jobPeriodConsumermanagerPeriodDisableDistribution=$jobPeriodConsumermanagerPeriodDisableDistribution, startupPeriodDelay=$startupPeriodDelay, cleanupPeriodPeriod=$cleanupPeriodPeriod]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jobPeriodConsumermanagerPeriodDisableDistribution != null) {
      json[r'job.consumermanager.disableDistribution'] = this.jobPeriodConsumermanagerPeriodDisableDistribution;
    } else {
      json[r'job.consumermanager.disableDistribution'] = null;
    }
    if (this.startupPeriodDelay != null) {
      json[r'startup.delay'] = this.startupPeriodDelay;
    } else {
      json[r'startup.delay'] = null;
    }
    if (this.cleanupPeriodPeriod != null) {
      json[r'cleanup.period'] = this.cleanupPeriodPeriod;
    } else {
      json[r'cleanup.period'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties(
        jobPeriodConsumermanagerPeriodDisableDistribution: ConfigNodePropertyBoolean.fromJson(json[r'job.consumermanager.disableDistribution']),
        startupPeriodDelay: ConfigNodePropertyInteger.fromJson(json[r'startup.delay']),
        cleanupPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'cleanup.period']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

