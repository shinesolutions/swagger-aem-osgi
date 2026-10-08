//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {
  /// Returns a new [ComDayCqDamCoreImplReportsReportPurgeServiceProperties] instance.
  ComDayCqDamCoreImplReportsReportPurgeServiceProperties({
    this.schedulerPeriodExpression,
    this.maxSavedReports,
    this.timeDuration,
    this.enableReportPurge,
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
  ConfigNodePropertyInteger? maxSavedReports;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? timeDuration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableReportPurge;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplReportsReportPurgeServiceProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.maxSavedReports == maxSavedReports &&
    other.timeDuration == timeDuration &&
    other.enableReportPurge == enableReportPurge;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (maxSavedReports == null ? 0 : maxSavedReports!.hashCode) +
    (timeDuration == null ? 0 : timeDuration!.hashCode) +
    (enableReportPurge == null ? 0 : enableReportPurge!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplReportsReportPurgeServiceProperties[schedulerPeriodExpression=$schedulerPeriodExpression, maxSavedReports=$maxSavedReports, timeDuration=$timeDuration, enableReportPurge=$enableReportPurge]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.maxSavedReports != null) {
      json[r'maxSavedReports'] = this.maxSavedReports;
    } else {
      json[r'maxSavedReports'] = null;
    }
    if (this.timeDuration != null) {
      json[r'timeDuration'] = this.timeDuration;
    } else {
      json[r'timeDuration'] = null;
    }
    if (this.enableReportPurge != null) {
      json[r'enableReportPurge'] = this.enableReportPurge;
    } else {
      json[r'enableReportPurge'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplReportsReportPurgeServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplReportsReportPurgeServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplReportsReportPurgeServiceProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        maxSavedReports: ConfigNodePropertyInteger.fromJson(json[r'maxSavedReports']),
        timeDuration: ConfigNodePropertyInteger.fromJson(json[r'timeDuration']),
        enableReportPurge: ConfigNodePropertyBoolean.fromJson(json[r'enableReportPurge']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplReportsReportPurgeServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplReportsReportPurgeServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplReportsReportPurgeServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplReportsReportPurgeServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplReportsReportPurgeServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplReportsReportPurgeServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplReportsReportPurgeServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplReportsReportPurgeServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplReportsReportPurgeServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplReportsReportPurgeServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

