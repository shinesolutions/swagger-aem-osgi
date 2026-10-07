//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties {
  /// Returns a new [ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties] instance.
  ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties({
    this.purgeCompleted,
    this.completedAge,
    this.purgeActive,
    this.activeAge,
    this.saveThreshold,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? purgeCompleted;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? completedAge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? purgeActive;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? activeAge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? saveThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties &&
    other.purgeCompleted == purgeCompleted &&
    other.completedAge == completedAge &&
    other.purgeActive == purgeActive &&
    other.activeAge == activeAge &&
    other.saveThreshold == saveThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (purgeCompleted == null ? 0 : purgeCompleted!.hashCode) +
    (completedAge == null ? 0 : completedAge!.hashCode) +
    (purgeActive == null ? 0 : purgeActive!.hashCode) +
    (activeAge == null ? 0 : activeAge!.hashCode) +
    (saveThreshold == null ? 0 : saveThreshold!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties[purgeCompleted=$purgeCompleted, completedAge=$completedAge, purgeActive=$purgeActive, activeAge=$activeAge, saveThreshold=$saveThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.purgeCompleted != null) {
      json[r'purgeCompleted'] = this.purgeCompleted;
    } else {
      json[r'purgeCompleted'] = null;
    }
    if (this.completedAge != null) {
      json[r'completedAge'] = this.completedAge;
    } else {
      json[r'completedAge'] = null;
    }
    if (this.purgeActive != null) {
      json[r'purgeActive'] = this.purgeActive;
    } else {
      json[r'purgeActive'] = null;
    }
    if (this.activeAge != null) {
      json[r'activeAge'] = this.activeAge;
    } else {
      json[r'activeAge'] = null;
    }
    if (this.saveThreshold != null) {
      json[r'saveThreshold'] = this.saveThreshold;
    } else {
      json[r'saveThreshold'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties(
        purgeCompleted: ConfigNodePropertyBoolean.fromJson(json[r'purgeCompleted']),
        completedAge: ConfigNodePropertyInteger.fromJson(json[r'completedAge']),
        purgeActive: ConfigNodePropertyBoolean.fromJson(json[r'purgeActive']),
        activeAge: ConfigNodePropertyInteger.fromJson(json[r'activeAge']),
        saveThreshold: ConfigNodePropertyInteger.fromJson(json[r'saveThreshold']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

