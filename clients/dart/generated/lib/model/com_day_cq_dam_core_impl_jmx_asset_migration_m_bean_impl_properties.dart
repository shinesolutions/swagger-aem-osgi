//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {
  /// Returns a new [ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties] instance.
  ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties({
    this.jmxPeriodObjectname,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jmxPeriodObjectname;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties &&
    other.jmxPeriodObjectname == jmxPeriodObjectname;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jmxPeriodObjectname == null ? 0 : jmxPeriodObjectname!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties[jmxPeriodObjectname=$jmxPeriodObjectname]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jmxPeriodObjectname != null) {
      json[r'jmx.objectname'] = this.jmxPeriodObjectname;
    } else {
      json[r'jmx.objectname'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(
        jmxPeriodObjectname: ConfigNodePropertyString.fromJson(json[r'jmx.objectname']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

