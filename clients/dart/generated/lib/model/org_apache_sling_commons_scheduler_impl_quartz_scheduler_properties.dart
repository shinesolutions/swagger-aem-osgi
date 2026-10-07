//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
  /// Returns a new [OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties] instance.
  OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties({
    this.poolName,
    this.allowedPoolNames,
    this.schedulerPeriodUseleaderforsingle,
    this.metricsPeriodFilters,
    this.slowThresholdMillis,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? poolName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? allowedPoolNames;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? schedulerPeriodUseleaderforsingle;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? metricsPeriodFilters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? slowThresholdMillis;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties &&
    other.poolName == poolName &&
    other.allowedPoolNames == allowedPoolNames &&
    other.schedulerPeriodUseleaderforsingle == schedulerPeriodUseleaderforsingle &&
    other.metricsPeriodFilters == metricsPeriodFilters &&
    other.slowThresholdMillis == slowThresholdMillis;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (poolName == null ? 0 : poolName!.hashCode) +
    (allowedPoolNames == null ? 0 : allowedPoolNames!.hashCode) +
    (schedulerPeriodUseleaderforsingle == null ? 0 : schedulerPeriodUseleaderforsingle!.hashCode) +
    (metricsPeriodFilters == null ? 0 : metricsPeriodFilters!.hashCode) +
    (slowThresholdMillis == null ? 0 : slowThresholdMillis!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties[poolName=$poolName, allowedPoolNames=$allowedPoolNames, schedulerPeriodUseleaderforsingle=$schedulerPeriodUseleaderforsingle, metricsPeriodFilters=$metricsPeriodFilters, slowThresholdMillis=$slowThresholdMillis]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.poolName != null) {
      json[r'poolName'] = this.poolName;
    } else {
      json[r'poolName'] = null;
    }
    if (this.allowedPoolNames != null) {
      json[r'allowedPoolNames'] = this.allowedPoolNames;
    } else {
      json[r'allowedPoolNames'] = null;
    }
    if (this.schedulerPeriodUseleaderforsingle != null) {
      json[r'scheduler.useleaderforsingle'] = this.schedulerPeriodUseleaderforsingle;
    } else {
      json[r'scheduler.useleaderforsingle'] = null;
    }
    if (this.metricsPeriodFilters != null) {
      json[r'metrics.filters'] = this.metricsPeriodFilters;
    } else {
      json[r'metrics.filters'] = null;
    }
    if (this.slowThresholdMillis != null) {
      json[r'slowThresholdMillis'] = this.slowThresholdMillis;
    } else {
      json[r'slowThresholdMillis'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties(
        poolName: ConfigNodePropertyString.fromJson(json[r'poolName']),
        allowedPoolNames: ConfigNodePropertyArray.fromJson(json[r'allowedPoolNames']),
        schedulerPeriodUseleaderforsingle: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.useleaderforsingle']),
        metricsPeriodFilters: ConfigNodePropertyArray.fromJson(json[r'metrics.filters']),
        slowThresholdMillis: ConfigNodePropertyInteger.fromJson(json[r'slowThresholdMillis']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

