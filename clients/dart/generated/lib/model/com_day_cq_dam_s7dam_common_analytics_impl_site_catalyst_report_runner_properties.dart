//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties {
  /// Returns a new [ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties] instance.
  ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties({
    this.schedulerPeriodExpression,
    this.schedulerPeriodConcurrent,
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
  ConfigNodePropertyBoolean? schedulerPeriodConcurrent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.schedulerPeriodConcurrent == schedulerPeriodConcurrent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (schedulerPeriodConcurrent == null ? 0 : schedulerPeriodConcurrent!.hashCode);

  @override
  String toString() => 'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties[schedulerPeriodExpression=$schedulerPeriodExpression, schedulerPeriodConcurrent=$schedulerPeriodConcurrent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.schedulerPeriodConcurrent != null) {
      json[r'scheduler.concurrent'] = this.schedulerPeriodConcurrent;
    } else {
      json[r'scheduler.concurrent'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        schedulerPeriodConcurrent: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.concurrent']),
      );
    }
    return null;
  }

  static List<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

