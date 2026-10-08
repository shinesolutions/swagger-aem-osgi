//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
  /// Returns a new [ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties] instance.
  ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties({
    this.workflowpackageinfoproviderPeriodFilter,
    this.workflowpackageinfoproviderPeriodFilterPeriodRootpath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? workflowpackageinfoproviderPeriodFilter;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? workflowpackageinfoproviderPeriodFilterPeriodRootpath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties &&
    other.workflowpackageinfoproviderPeriodFilter == workflowpackageinfoproviderPeriodFilter &&
    other.workflowpackageinfoproviderPeriodFilterPeriodRootpath == workflowpackageinfoproviderPeriodFilterPeriodRootpath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (workflowpackageinfoproviderPeriodFilter == null ? 0 : workflowpackageinfoproviderPeriodFilter!.hashCode) +
    (workflowpackageinfoproviderPeriodFilterPeriodRootpath == null ? 0 : workflowpackageinfoproviderPeriodFilterPeriodRootpath!.hashCode);

  @override
  String toString() => 'ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties[workflowpackageinfoproviderPeriodFilter=$workflowpackageinfoproviderPeriodFilter, workflowpackageinfoproviderPeriodFilterPeriodRootpath=$workflowpackageinfoproviderPeriodFilterPeriodRootpath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.workflowpackageinfoproviderPeriodFilter != null) {
      json[r'workflowpackageinfoprovider.filter'] = this.workflowpackageinfoproviderPeriodFilter;
    } else {
      json[r'workflowpackageinfoprovider.filter'] = null;
    }
    if (this.workflowpackageinfoproviderPeriodFilterPeriodRootpath != null) {
      json[r'workflowpackageinfoprovider.filter.rootpath'] = this.workflowpackageinfoproviderPeriodFilterPeriodRootpath;
    } else {
      json[r'workflowpackageinfoprovider.filter.rootpath'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties(
        workflowpackageinfoproviderPeriodFilter: ConfigNodePropertyArray.fromJson(json[r'workflowpackageinfoprovider.filter']),
        workflowpackageinfoproviderPeriodFilterPeriodRootpath: ConfigNodePropertyString.fromJson(json[r'workflowpackageinfoprovider.filter.rootpath']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

