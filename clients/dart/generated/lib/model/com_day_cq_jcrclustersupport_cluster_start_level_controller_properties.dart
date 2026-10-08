//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqJcrclustersupportClusterStartLevelControllerProperties {
  /// Returns a new [ComDayCqJcrclustersupportClusterStartLevelControllerProperties] instance.
  ComDayCqJcrclustersupportClusterStartLevelControllerProperties({
    this.clusterPeriodLevelPeriodEnable,
    this.clusterPeriodMasterPeriodLevel,
    this.clusterPeriodSlavePeriodLevel,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? clusterPeriodLevelPeriodEnable;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? clusterPeriodMasterPeriodLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? clusterPeriodSlavePeriodLevel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqJcrclustersupportClusterStartLevelControllerProperties &&
    other.clusterPeriodLevelPeriodEnable == clusterPeriodLevelPeriodEnable &&
    other.clusterPeriodMasterPeriodLevel == clusterPeriodMasterPeriodLevel &&
    other.clusterPeriodSlavePeriodLevel == clusterPeriodSlavePeriodLevel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (clusterPeriodLevelPeriodEnable == null ? 0 : clusterPeriodLevelPeriodEnable!.hashCode) +
    (clusterPeriodMasterPeriodLevel == null ? 0 : clusterPeriodMasterPeriodLevel!.hashCode) +
    (clusterPeriodSlavePeriodLevel == null ? 0 : clusterPeriodSlavePeriodLevel!.hashCode);

  @override
  String toString() => 'ComDayCqJcrclustersupportClusterStartLevelControllerProperties[clusterPeriodLevelPeriodEnable=$clusterPeriodLevelPeriodEnable, clusterPeriodMasterPeriodLevel=$clusterPeriodMasterPeriodLevel, clusterPeriodSlavePeriodLevel=$clusterPeriodSlavePeriodLevel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.clusterPeriodLevelPeriodEnable != null) {
      json[r'cluster.level.enable'] = this.clusterPeriodLevelPeriodEnable;
    } else {
      json[r'cluster.level.enable'] = null;
    }
    if (this.clusterPeriodMasterPeriodLevel != null) {
      json[r'cluster.master.level'] = this.clusterPeriodMasterPeriodLevel;
    } else {
      json[r'cluster.master.level'] = null;
    }
    if (this.clusterPeriodSlavePeriodLevel != null) {
      json[r'cluster.slave.level'] = this.clusterPeriodSlavePeriodLevel;
    } else {
      json[r'cluster.slave.level'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqJcrclustersupportClusterStartLevelControllerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqJcrclustersupportClusterStartLevelControllerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqJcrclustersupportClusterStartLevelControllerProperties(
        clusterPeriodLevelPeriodEnable: ConfigNodePropertyBoolean.fromJson(json[r'cluster.level.enable']),
        clusterPeriodMasterPeriodLevel: ConfigNodePropertyInteger.fromJson(json[r'cluster.master.level']),
        clusterPeriodSlavePeriodLevel: ConfigNodePropertyInteger.fromJson(json[r'cluster.slave.level']),
      );
    }
    return null;
  }

  static List<ComDayCqJcrclustersupportClusterStartLevelControllerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqJcrclustersupportClusterStartLevelControllerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqJcrclustersupportClusterStartLevelControllerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqJcrclustersupportClusterStartLevelControllerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqJcrclustersupportClusterStartLevelControllerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqJcrclustersupportClusterStartLevelControllerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqJcrclustersupportClusterStartLevelControllerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqJcrclustersupportClusterStartLevelControllerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqJcrclustersupportClusterStartLevelControllerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqJcrclustersupportClusterStartLevelControllerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

