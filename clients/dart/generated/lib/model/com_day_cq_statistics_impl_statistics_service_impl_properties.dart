//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqStatisticsImplStatisticsServiceImplProperties {
  /// Returns a new [ComDayCqStatisticsImplStatisticsServiceImplProperties] instance.
  ComDayCqStatisticsImplStatisticsServiceImplProperties({
    this.schedulerPeriodPeriod,
    this.schedulerPeriodConcurrent,
    this.path,
    this.workspace,
    this.keywordsPath,
    this.asyncEntries,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? schedulerPeriodPeriod;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? schedulerPeriodConcurrent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? workspace;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? keywordsPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? asyncEntries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqStatisticsImplStatisticsServiceImplProperties &&
    other.schedulerPeriodPeriod == schedulerPeriodPeriod &&
    other.schedulerPeriodConcurrent == schedulerPeriodConcurrent &&
    other.path == path &&
    other.workspace == workspace &&
    other.keywordsPath == keywordsPath &&
    other.asyncEntries == asyncEntries;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodPeriod == null ? 0 : schedulerPeriodPeriod!.hashCode) +
    (schedulerPeriodConcurrent == null ? 0 : schedulerPeriodConcurrent!.hashCode) +
    (path == null ? 0 : path!.hashCode) +
    (workspace == null ? 0 : workspace!.hashCode) +
    (keywordsPath == null ? 0 : keywordsPath!.hashCode) +
    (asyncEntries == null ? 0 : asyncEntries!.hashCode);

  @override
  String toString() => 'ComDayCqStatisticsImplStatisticsServiceImplProperties[schedulerPeriodPeriod=$schedulerPeriodPeriod, schedulerPeriodConcurrent=$schedulerPeriodConcurrent, path=$path, workspace=$workspace, keywordsPath=$keywordsPath, asyncEntries=$asyncEntries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodPeriod != null) {
      json[r'scheduler.period'] = this.schedulerPeriodPeriod;
    } else {
      json[r'scheduler.period'] = null;
    }
    if (this.schedulerPeriodConcurrent != null) {
      json[r'scheduler.concurrent'] = this.schedulerPeriodConcurrent;
    } else {
      json[r'scheduler.concurrent'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.workspace != null) {
      json[r'workspace'] = this.workspace;
    } else {
      json[r'workspace'] = null;
    }
    if (this.keywordsPath != null) {
      json[r'keywordsPath'] = this.keywordsPath;
    } else {
      json[r'keywordsPath'] = null;
    }
    if (this.asyncEntries != null) {
      json[r'asyncEntries'] = this.asyncEntries;
    } else {
      json[r'asyncEntries'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqStatisticsImplStatisticsServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqStatisticsImplStatisticsServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqStatisticsImplStatisticsServiceImplProperties(
        schedulerPeriodPeriod: ConfigNodePropertyInteger.fromJson(json[r'scheduler.period']),
        schedulerPeriodConcurrent: ConfigNodePropertyBoolean.fromJson(json[r'scheduler.concurrent']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        workspace: ConfigNodePropertyString.fromJson(json[r'workspace']),
        keywordsPath: ConfigNodePropertyString.fromJson(json[r'keywordsPath']),
        asyncEntries: ConfigNodePropertyBoolean.fromJson(json[r'asyncEntries']),
      );
    }
    return null;
  }

  static List<ComDayCqStatisticsImplStatisticsServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqStatisticsImplStatisticsServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqStatisticsImplStatisticsServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqStatisticsImplStatisticsServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqStatisticsImplStatisticsServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqStatisticsImplStatisticsServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqStatisticsImplStatisticsServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqStatisticsImplStatisticsServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqStatisticsImplStatisticsServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqStatisticsImplStatisticsServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

