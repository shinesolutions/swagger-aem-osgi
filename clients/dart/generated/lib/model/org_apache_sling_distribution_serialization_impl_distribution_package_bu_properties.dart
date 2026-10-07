//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties {
  /// Returns a new [OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties] instance.
  OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties({
    this.name,
    this.type,
    this.formatPeriodTarget,
    this.tempFsFolder,
    this.fileThreshold,
    this.memoryUnit,
    this.useOffHeapMemory,
    this.digestAlgorithm,
    this.monitoringQueueSize,
    this.cleanupDelay,
    this.packagePeriodFilters,
    this.propertyPeriodFilters,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? type;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? formatPeriodTarget;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tempFsFolder;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? fileThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? memoryUnit;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? useOffHeapMemory;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? digestAlgorithm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? monitoringQueueSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cleanupDelay;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? packagePeriodFilters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? propertyPeriodFilters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties &&
    other.name == name &&
    other.type == type &&
    other.formatPeriodTarget == formatPeriodTarget &&
    other.tempFsFolder == tempFsFolder &&
    other.fileThreshold == fileThreshold &&
    other.memoryUnit == memoryUnit &&
    other.useOffHeapMemory == useOffHeapMemory &&
    other.digestAlgorithm == digestAlgorithm &&
    other.monitoringQueueSize == monitoringQueueSize &&
    other.cleanupDelay == cleanupDelay &&
    other.packagePeriodFilters == packagePeriodFilters &&
    other.propertyPeriodFilters == propertyPeriodFilters;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (formatPeriodTarget == null ? 0 : formatPeriodTarget!.hashCode) +
    (tempFsFolder == null ? 0 : tempFsFolder!.hashCode) +
    (fileThreshold == null ? 0 : fileThreshold!.hashCode) +
    (memoryUnit == null ? 0 : memoryUnit!.hashCode) +
    (useOffHeapMemory == null ? 0 : useOffHeapMemory!.hashCode) +
    (digestAlgorithm == null ? 0 : digestAlgorithm!.hashCode) +
    (monitoringQueueSize == null ? 0 : monitoringQueueSize!.hashCode) +
    (cleanupDelay == null ? 0 : cleanupDelay!.hashCode) +
    (packagePeriodFilters == null ? 0 : packagePeriodFilters!.hashCode) +
    (propertyPeriodFilters == null ? 0 : propertyPeriodFilters!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties[name=$name, type=$type, formatPeriodTarget=$formatPeriodTarget, tempFsFolder=$tempFsFolder, fileThreshold=$fileThreshold, memoryUnit=$memoryUnit, useOffHeapMemory=$useOffHeapMemory, digestAlgorithm=$digestAlgorithm, monitoringQueueSize=$monitoringQueueSize, cleanupDelay=$cleanupDelay, packagePeriodFilters=$packagePeriodFilters, propertyPeriodFilters=$propertyPeriodFilters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.formatPeriodTarget != null) {
      json[r'format.target'] = this.formatPeriodTarget;
    } else {
      json[r'format.target'] = null;
    }
    if (this.tempFsFolder != null) {
      json[r'tempFsFolder'] = this.tempFsFolder;
    } else {
      json[r'tempFsFolder'] = null;
    }
    if (this.fileThreshold != null) {
      json[r'fileThreshold'] = this.fileThreshold;
    } else {
      json[r'fileThreshold'] = null;
    }
    if (this.memoryUnit != null) {
      json[r'memoryUnit'] = this.memoryUnit;
    } else {
      json[r'memoryUnit'] = null;
    }
    if (this.useOffHeapMemory != null) {
      json[r'useOffHeapMemory'] = this.useOffHeapMemory;
    } else {
      json[r'useOffHeapMemory'] = null;
    }
    if (this.digestAlgorithm != null) {
      json[r'digestAlgorithm'] = this.digestAlgorithm;
    } else {
      json[r'digestAlgorithm'] = null;
    }
    if (this.monitoringQueueSize != null) {
      json[r'monitoringQueueSize'] = this.monitoringQueueSize;
    } else {
      json[r'monitoringQueueSize'] = null;
    }
    if (this.cleanupDelay != null) {
      json[r'cleanupDelay'] = this.cleanupDelay;
    } else {
      json[r'cleanupDelay'] = null;
    }
    if (this.packagePeriodFilters != null) {
      json[r'package.filters'] = this.packagePeriodFilters;
    } else {
      json[r'package.filters'] = null;
    }
    if (this.propertyPeriodFilters != null) {
      json[r'property.filters'] = this.propertyPeriodFilters;
    } else {
      json[r'property.filters'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        type: ConfigNodePropertyDropDown.fromJson(json[r'type']),
        formatPeriodTarget: ConfigNodePropertyString.fromJson(json[r'format.target']),
        tempFsFolder: ConfigNodePropertyString.fromJson(json[r'tempFsFolder']),
        fileThreshold: ConfigNodePropertyInteger.fromJson(json[r'fileThreshold']),
        memoryUnit: ConfigNodePropertyDropDown.fromJson(json[r'memoryUnit']),
        useOffHeapMemory: ConfigNodePropertyBoolean.fromJson(json[r'useOffHeapMemory']),
        digestAlgorithm: ConfigNodePropertyDropDown.fromJson(json[r'digestAlgorithm']),
        monitoringQueueSize: ConfigNodePropertyInteger.fromJson(json[r'monitoringQueueSize']),
        cleanupDelay: ConfigNodePropertyInteger.fromJson(json[r'cleanupDelay']),
        packagePeriodFilters: ConfigNodePropertyArray.fromJson(json[r'package.filters']),
        propertyPeriodFilters: ConfigNodePropertyArray.fromJson(json[r'property.filters']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

