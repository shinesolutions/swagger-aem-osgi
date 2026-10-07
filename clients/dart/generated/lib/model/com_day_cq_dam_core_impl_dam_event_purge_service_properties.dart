//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplDamEventPurgeServiceProperties {
  /// Returns a new [ComDayCqDamCoreImplDamEventPurgeServiceProperties] instance.
  ComDayCqDamCoreImplDamEventPurgeServiceProperties({
    this.schedulerPeriodExpression,
    this.maxSavedActivities,
    this.saveInterval,
    this.enableActivityPurge,
    this.eventTypes,
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
  ConfigNodePropertyInteger? maxSavedActivities;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? saveInterval;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableActivityPurge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? eventTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplDamEventPurgeServiceProperties &&
    other.schedulerPeriodExpression == schedulerPeriodExpression &&
    other.maxSavedActivities == maxSavedActivities &&
    other.saveInterval == saveInterval &&
    other.enableActivityPurge == enableActivityPurge &&
    other.eventTypes == eventTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (schedulerPeriodExpression == null ? 0 : schedulerPeriodExpression!.hashCode) +
    (maxSavedActivities == null ? 0 : maxSavedActivities!.hashCode) +
    (saveInterval == null ? 0 : saveInterval!.hashCode) +
    (enableActivityPurge == null ? 0 : enableActivityPurge!.hashCode) +
    (eventTypes == null ? 0 : eventTypes!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplDamEventPurgeServiceProperties[schedulerPeriodExpression=$schedulerPeriodExpression, maxSavedActivities=$maxSavedActivities, saveInterval=$saveInterval, enableActivityPurge=$enableActivityPurge, eventTypes=$eventTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.schedulerPeriodExpression != null) {
      json[r'scheduler.expression'] = this.schedulerPeriodExpression;
    } else {
      json[r'scheduler.expression'] = null;
    }
    if (this.maxSavedActivities != null) {
      json[r'maxSavedActivities'] = this.maxSavedActivities;
    } else {
      json[r'maxSavedActivities'] = null;
    }
    if (this.saveInterval != null) {
      json[r'saveInterval'] = this.saveInterval;
    } else {
      json[r'saveInterval'] = null;
    }
    if (this.enableActivityPurge != null) {
      json[r'enableActivityPurge'] = this.enableActivityPurge;
    } else {
      json[r'enableActivityPurge'] = null;
    }
    if (this.eventTypes != null) {
      json[r'eventTypes'] = this.eventTypes;
    } else {
      json[r'eventTypes'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplDamEventPurgeServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplDamEventPurgeServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplDamEventPurgeServiceProperties(
        schedulerPeriodExpression: ConfigNodePropertyString.fromJson(json[r'scheduler.expression']),
        maxSavedActivities: ConfigNodePropertyInteger.fromJson(json[r'maxSavedActivities']),
        saveInterval: ConfigNodePropertyInteger.fromJson(json[r'saveInterval']),
        enableActivityPurge: ConfigNodePropertyBoolean.fromJson(json[r'enableActivityPurge']),
        eventTypes: ConfigNodePropertyDropDown.fromJson(json[r'eventTypes']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplDamEventPurgeServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplDamEventPurgeServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplDamEventPurgeServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplDamEventPurgeServiceProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplDamEventPurgeServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplDamEventPurgeServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplDamEventPurgeServiceProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplDamEventPurgeServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplDamEventPurgeServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplDamEventPurgeServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

