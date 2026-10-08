//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {
  /// Returns a new [OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties] instance.
  OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties({
    this.name,
    this.path,
    this.serviceName,
    this.nuggetsPath,
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
  ConfigNodePropertyString? path;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? serviceName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? nuggetsPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties &&
    other.name == name &&
    other.path == path &&
    other.serviceName == serviceName &&
    other.nuggetsPath == nuggetsPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (path == null ? 0 : path!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (nuggetsPath == null ? 0 : nuggetsPath!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties[name=$name, path=$path, serviceName=$serviceName, nuggetsPath=$nuggetsPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.nuggetsPath != null) {
      json[r'nuggetsPath'] = this.nuggetsPath;
    } else {
      json[r'nuggetsPath'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        nuggetsPath: ConfigNodePropertyString.fromJson(json[r'nuggetsPath']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

