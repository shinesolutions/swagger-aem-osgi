//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties {
  /// Returns a new [OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties] instance.
  OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties({
    this.maxPeriodQuartzJobPeriodDurationPeriodAcceptable,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPeriodQuartzJobPeriodDurationPeriodAcceptable;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties &&
    other.maxPeriodQuartzJobPeriodDurationPeriodAcceptable == maxPeriodQuartzJobPeriodDurationPeriodAcceptable;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxPeriodQuartzJobPeriodDurationPeriodAcceptable == null ? 0 : maxPeriodQuartzJobPeriodDurationPeriodAcceptable!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties[maxPeriodQuartzJobPeriodDurationPeriodAcceptable=$maxPeriodQuartzJobPeriodDurationPeriodAcceptable]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxPeriodQuartzJobPeriodDurationPeriodAcceptable != null) {
      json[r'max.quartzJob.duration.acceptable'] = this.maxPeriodQuartzJobPeriodDurationPeriodAcceptable;
    } else {
      json[r'max.quartzJob.duration.acceptable'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties(
        maxPeriodQuartzJobPeriodDurationPeriodAcceptable: ConfigNodePropertyInteger.fromJson(json[r'max.quartzJob.duration.acceptable']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

