//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
  /// Returns a new [OrgApacheSlingCommonsMetricsInternalLogReporterProperties] instance.
  OrgApacheSlingCommonsMetricsInternalLogReporterProperties({
    this.period,
    this.timeUnit,
    this.level,
    this.loggerName,
    this.prefix,
    this.pattern,
    this.registryName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? period;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? timeUnit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? level;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? loggerName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? prefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? pattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? registryName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsMetricsInternalLogReporterProperties &&
    other.period == period &&
    other.timeUnit == timeUnit &&
    other.level == level &&
    other.loggerName == loggerName &&
    other.prefix == prefix &&
    other.pattern == pattern &&
    other.registryName == registryName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (period == null ? 0 : period!.hashCode) +
    (timeUnit == null ? 0 : timeUnit!.hashCode) +
    (level == null ? 0 : level!.hashCode) +
    (loggerName == null ? 0 : loggerName!.hashCode) +
    (prefix == null ? 0 : prefix!.hashCode) +
    (pattern == null ? 0 : pattern!.hashCode) +
    (registryName == null ? 0 : registryName!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsMetricsInternalLogReporterProperties[period=$period, timeUnit=$timeUnit, level=$level, loggerName=$loggerName, prefix=$prefix, pattern=$pattern, registryName=$registryName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.period != null) {
      json[r'period'] = this.period;
    } else {
      json[r'period'] = null;
    }
    if (this.timeUnit != null) {
      json[r'timeUnit'] = this.timeUnit;
    } else {
      json[r'timeUnit'] = null;
    }
    if (this.level != null) {
      json[r'level'] = this.level;
    } else {
      json[r'level'] = null;
    }
    if (this.loggerName != null) {
      json[r'loggerName'] = this.loggerName;
    } else {
      json[r'loggerName'] = null;
    }
    if (this.prefix != null) {
      json[r'prefix'] = this.prefix;
    } else {
      json[r'prefix'] = null;
    }
    if (this.pattern != null) {
      json[r'pattern'] = this.pattern;
    } else {
      json[r'pattern'] = null;
    }
    if (this.registryName != null) {
      json[r'registryName'] = this.registryName;
    } else {
      json[r'registryName'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsMetricsInternalLogReporterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsMetricsInternalLogReporterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsMetricsInternalLogReporterProperties(
        period: ConfigNodePropertyInteger.fromJson(json[r'period']),
        timeUnit: ConfigNodePropertyDropDown.fromJson(json[r'timeUnit']),
        level: ConfigNodePropertyDropDown.fromJson(json[r'level']),
        loggerName: ConfigNodePropertyString.fromJson(json[r'loggerName']),
        prefix: ConfigNodePropertyString.fromJson(json[r'prefix']),
        pattern: ConfigNodePropertyString.fromJson(json[r'pattern']),
        registryName: ConfigNodePropertyString.fromJson(json[r'registryName']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsMetricsInternalLogReporterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsMetricsInternalLogReporterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsMetricsInternalLogReporterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsMetricsInternalLogReporterProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsMetricsInternalLogReporterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsMetricsInternalLogReporterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsMetricsInternalLogReporterProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsMetricsInternalLogReporterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsMetricsInternalLogReporterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsMetricsInternalLogReporterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

