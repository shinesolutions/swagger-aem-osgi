//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
  /// Returns a new [ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties] instance.
  ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties({
    this.adapterPeriodCondition,
    this.taskmanagerPeriodAdmingroups,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? adapterPeriodCondition;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? taskmanagerPeriodAdmingroups;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties &&
    other.adapterPeriodCondition == adapterPeriodCondition &&
    other.taskmanagerPeriodAdmingroups == taskmanagerPeriodAdmingroups;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adapterPeriodCondition == null ? 0 : adapterPeriodCondition!.hashCode) +
    (taskmanagerPeriodAdmingroups == null ? 0 : taskmanagerPeriodAdmingroups!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties[adapterPeriodCondition=$adapterPeriodCondition, taskmanagerPeriodAdmingroups=$taskmanagerPeriodAdmingroups]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adapterPeriodCondition != null) {
      json[r'adapter.condition'] = this.adapterPeriodCondition;
    } else {
      json[r'adapter.condition'] = null;
    }
    if (this.taskmanagerPeriodAdmingroups != null) {
      json[r'taskmanager.admingroups'] = this.taskmanagerPeriodAdmingroups;
    } else {
      json[r'taskmanager.admingroups'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties(
        adapterPeriodCondition: ConfigNodePropertyString.fromJson(json[r'adapter.condition']),
        taskmanagerPeriodAdmingroups: ConfigNodePropertyArray.fromJson(json[r'taskmanager.admingroups']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

