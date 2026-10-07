//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
  /// Returns a new [ComDayCrxSecurityTokenImplTokenCleanupTaskProperties] instance.
  ComDayCrxSecurityTokenImplTokenCleanupTaskProperties({
    this.enablePeriodTokenPeriodCleanupPeriodTask,
    this.schedulerPeriodExpression,
    this.batchPeriodSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enablePeriodTokenPeriodCleanupPeriodTask;

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
  ConfigNodePropertyInteger? batchPeriodSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCrxSecurityTokenImplTokenCleanupTaskProperties &&
    other.enablePeriodTokenPeriodCleanupPeriodTask == enablePeriodTokenPeriodCleanupPeriodTask &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.batchPeriodSize == batchPeriodSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enablePeriodTokenPeriodCleanupPeriodTask == null ? 0 : enablePeriodTokenPeriodCleanupPeriodTask!.hashCode) +
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (batchPeriodSize == null ? 0 : batchPeriodSize!.hashCode);

  @override
  String toString() => 'ComDayCrxSecurityTokenImplTokenCleanupTaskProperties[enablePeriodTokenPeriodCleanupPeriodTask=$enablePeriodTokenPeriodCleanupPeriodTask, schedulerPeriodExpression=$schedulerPeriodExpression, batchPeriodSize=$batchPeriodSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enablePeriodTokenPeriodCleanupPeriodTask != null) {
      json[r'enable.token.cleanup.task'] = this.enablePeriodTokenPeriodCleanupPeriodTask;
    } else {
      json[r'enable.token.cleanup.task'] = null;
    }
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.batchPeriodSize != null) {
      json[r'batch.size'] = this.batchPeriodSize;
    } else {
      json[r'batch.size'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCrxSecurityTokenImplTokenCleanupTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCrxSecurityTokenImplTokenCleanupTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCrxSecurityTokenImplTokenCleanupTaskProperties(
        enablePeriodTokenPeriodCleanupPeriodTask: ConfigNodePropertyBoolean.fromJson(json[r'enable.token.cleanup.task']),
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        batchPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'batch.size']),
      );
    }
    return null;
  }

  static List<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCrxSecurityTokenImplTokenCleanupTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCrxSecurityTokenImplTokenCleanupTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCrxSecurityTokenImplTokenCleanupTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties-objects as value to a dart map
  static Map<String, List<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCrxSecurityTokenImplTokenCleanupTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

