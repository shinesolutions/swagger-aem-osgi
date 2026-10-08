//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmMsmImplRolloutManagerImplProperties {
  /// Returns a new [ComDayCqWcmMsmImplRolloutManagerImplProperties] instance.
  ComDayCqWcmMsmImplRolloutManagerImplProperties({
    this.eventPeriodFilter,
    this.rolloutmgrPeriodExcludedpropsPeriodDefault,
    this.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault,
    this.rolloutmgrPeriodExcludednodetypesPeriodDefault,
    this.rolloutmgrPeriodThreadpoolPeriodMaxsize,
    this.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime,
    this.rolloutmgrPeriodThreadpoolPeriodPriority,
    this.rolloutmgrPeriodCommitPeriodSize,
    this.rolloutmgrPeriodConflicthandlingPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? eventPeriodFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? rolloutmgrPeriodExcludedpropsPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? rolloutmgrPeriodExcludedparagraphpropsPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? rolloutmgrPeriodExcludednodetypesPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? rolloutmgrPeriodThreadpoolPeriodMaxsize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? rolloutmgrPeriodThreadpoolPeriodPriority;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? rolloutmgrPeriodCommitPeriodSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? rolloutmgrPeriodConflicthandlingPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmMsmImplRolloutManagerImplProperties &&
    other.eventPeriodFilter == eventPeriodFilter &&
    other.rolloutmgrPeriodExcludedpropsPeriodDefault == rolloutmgrPeriodExcludedpropsPeriodDefault &&
    other.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault == rolloutmgrPeriodExcludedparagraphpropsPeriodDefault &&
    other.rolloutmgrPeriodExcludednodetypesPeriodDefault == rolloutmgrPeriodExcludednodetypesPeriodDefault &&
    other.rolloutmgrPeriodThreadpoolPeriodMaxsize == rolloutmgrPeriodThreadpoolPeriodMaxsize &&
    other.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime == rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime &&
    other.rolloutmgrPeriodThreadpoolPeriodPriority == rolloutmgrPeriodThreadpoolPeriodPriority &&
    other.rolloutmgrPeriodCommitPeriodSize == rolloutmgrPeriodCommitPeriodSize &&
    other.rolloutmgrPeriodConflicthandlingPeriodEnabled == rolloutmgrPeriodConflicthandlingPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventPeriodFilter == null ? 0 : eventPeriodFilter!.hashCode) +
    (rolloutmgrPeriodExcludedpropsPeriodDefault == null ? 0 : rolloutmgrPeriodExcludedpropsPeriodDefault!.hashCode) +
    (rolloutmgrPeriodExcludedparagraphpropsPeriodDefault == null ? 0 : rolloutmgrPeriodExcludedparagraphpropsPeriodDefault!.hashCode) +
    (rolloutmgrPeriodExcludednodetypesPeriodDefault == null ? 0 : rolloutmgrPeriodExcludednodetypesPeriodDefault!.hashCode) +
    (rolloutmgrPeriodThreadpoolPeriodMaxsize == null ? 0 : rolloutmgrPeriodThreadpoolPeriodMaxsize!.hashCode) +
    (rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime == null ? 0 : rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime!.hashCode) +
    (rolloutmgrPeriodThreadpoolPeriodPriority == null ? 0 : rolloutmgrPeriodThreadpoolPeriodPriority!.hashCode) +
    (rolloutmgrPeriodCommitPeriodSize == null ? 0 : rolloutmgrPeriodCommitPeriodSize!.hashCode) +
    (rolloutmgrPeriodConflicthandlingPeriodEnabled == null ? 0 : rolloutmgrPeriodConflicthandlingPeriodEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqWcmMsmImplRolloutManagerImplProperties[eventPeriodFilter=$eventPeriodFilter, rolloutmgrPeriodExcludedpropsPeriodDefault=$rolloutmgrPeriodExcludedpropsPeriodDefault, rolloutmgrPeriodExcludedparagraphpropsPeriodDefault=$rolloutmgrPeriodExcludedparagraphpropsPeriodDefault, rolloutmgrPeriodExcludednodetypesPeriodDefault=$rolloutmgrPeriodExcludednodetypesPeriodDefault, rolloutmgrPeriodThreadpoolPeriodMaxsize=$rolloutmgrPeriodThreadpoolPeriodMaxsize, rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime=$rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime, rolloutmgrPeriodThreadpoolPeriodPriority=$rolloutmgrPeriodThreadpoolPeriodPriority, rolloutmgrPeriodCommitPeriodSize=$rolloutmgrPeriodCommitPeriodSize, rolloutmgrPeriodConflicthandlingPeriodEnabled=$rolloutmgrPeriodConflicthandlingPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventPeriodFilter != null) {
      json[r'event.filter'] = this.eventPeriodFilter;
    } else {
      json[r'event.filter'] = null;
    }
    if (this.rolloutmgrPeriodExcludedpropsPeriodDefault != null) {
      json[r'rolloutmgr.excludedprops.default'] = this.rolloutmgrPeriodExcludedpropsPeriodDefault;
    } else {
      json[r'rolloutmgr.excludedprops.default'] = null;
    }
    if (this.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault != null) {
      json[r'rolloutmgr.excludedparagraphprops.default'] = this.rolloutmgrPeriodExcludedparagraphpropsPeriodDefault;
    } else {
      json[r'rolloutmgr.excludedparagraphprops.default'] = null;
    }
    if (this.rolloutmgrPeriodExcludednodetypesPeriodDefault != null) {
      json[r'rolloutmgr.excludednodetypes.default'] = this.rolloutmgrPeriodExcludednodetypesPeriodDefault;
    } else {
      json[r'rolloutmgr.excludednodetypes.default'] = null;
    }
    if (this.rolloutmgrPeriodThreadpoolPeriodMaxsize != null) {
      json[r'rolloutmgr.threadpool.maxsize'] = this.rolloutmgrPeriodThreadpoolPeriodMaxsize;
    } else {
      json[r'rolloutmgr.threadpool.maxsize'] = null;
    }
    if (this.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime != null) {
      json[r'rolloutmgr.threadpool.maxshutdowntime'] = this.rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime;
    } else {
      json[r'rolloutmgr.threadpool.maxshutdowntime'] = null;
    }
    if (this.rolloutmgrPeriodThreadpoolPeriodPriority != null) {
      json[r'rolloutmgr.threadpool.priority'] = this.rolloutmgrPeriodThreadpoolPeriodPriority;
    } else {
      json[r'rolloutmgr.threadpool.priority'] = null;
    }
    if (this.rolloutmgrPeriodCommitPeriodSize != null) {
      json[r'rolloutmgr.commit.size'] = this.rolloutmgrPeriodCommitPeriodSize;
    } else {
      json[r'rolloutmgr.commit.size'] = null;
    }
    if (this.rolloutmgrPeriodConflicthandlingPeriodEnabled != null) {
      json[r'rolloutmgr.conflicthandling.enabled'] = this.rolloutmgrPeriodConflicthandlingPeriodEnabled;
    } else {
      json[r'rolloutmgr.conflicthandling.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmMsmImplRolloutManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmMsmImplRolloutManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmMsmImplRolloutManagerImplProperties(
        eventPeriodFilter: ConfigNodePropertyString.fromJson(json[r'event.filter']),
        rolloutmgrPeriodExcludedpropsPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'rolloutmgr.excludedprops.default']),
        rolloutmgrPeriodExcludedparagraphpropsPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'rolloutmgr.excludedparagraphprops.default']),
        rolloutmgrPeriodExcludednodetypesPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'rolloutmgr.excludednodetypes.default']),
        rolloutmgrPeriodThreadpoolPeriodMaxsize: ConfigNodePropertyInteger.fromJson(json[r'rolloutmgr.threadpool.maxsize']),
        rolloutmgrPeriodThreadpoolPeriodMaxshutdowntime: ConfigNodePropertyInteger.fromJson(json[r'rolloutmgr.threadpool.maxshutdowntime']),
        rolloutmgrPeriodThreadpoolPeriodPriority: ConfigNodePropertyDropDown.fromJson(json[r'rolloutmgr.threadpool.priority']),
        rolloutmgrPeriodCommitPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'rolloutmgr.commit.size']),
        rolloutmgrPeriodConflicthandlingPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'rolloutmgr.conflicthandling.enabled']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmMsmImplRolloutManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmMsmImplRolloutManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmMsmImplRolloutManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmMsmImplRolloutManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmMsmImplRolloutManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmMsmImplRolloutManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmMsmImplRolloutManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmMsmImplRolloutManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmMsmImplRolloutManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmMsmImplRolloutManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

