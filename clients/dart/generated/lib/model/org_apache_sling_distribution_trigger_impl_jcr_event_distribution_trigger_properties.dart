//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {
  /// Returns a new [OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties] instance.
  OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties({
    this.name,
    this.path,
    this.ignoredPathsPatterns,
    this.serviceName,
    this.deep,
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
  ConfigNodePropertyArray? ignoredPathsPatterns;

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
  ConfigNodePropertyBoolean? deep;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties &&
    other.name == name &&
    other.path == path &&
    other.ignoredPathsPatterns == ignoredPathsPatterns &&
    other.serviceName == serviceName &&
    other.deep == deep;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (path == null ? 0 : path!.hashCode) +
    (ignoredPathsPatterns == null ? 0 : ignoredPathsPatterns!.hashCode) +
    (serviceName == null ? 0 : serviceName!.hashCode) +
    (deep == null ? 0 : deep!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties[name=$name, path=$path, ignoredPathsPatterns=$ignoredPathsPatterns, serviceName=$serviceName, deep=$deep]';

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
    if (this.ignoredPathsPatterns != null) {
      json[r'ignoredPathsPatterns'] = this.ignoredPathsPatterns;
    } else {
      json[r'ignoredPathsPatterns'] = null;
    }
    if (this.serviceName != null) {
      json[r'serviceName'] = this.serviceName;
    } else {
      json[r'serviceName'] = null;
    }
    if (this.deep != null) {
      json[r'deep'] = this.deep;
    } else {
      json[r'deep'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        ignoredPathsPatterns: ConfigNodePropertyArray.fromJson(json[r'ignoredPathsPatterns']),
        serviceName: ConfigNodePropertyString.fromJson(json[r'serviceName']),
        deep: ConfigNodePropertyBoolean.fromJson(json[r'deep']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

