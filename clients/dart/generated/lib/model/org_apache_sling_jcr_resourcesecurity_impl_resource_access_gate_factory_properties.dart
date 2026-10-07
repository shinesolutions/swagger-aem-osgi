//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties {
  /// Returns a new [OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties] instance.
  OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties({
    this.path,
    this.checkpathPeriodPrefix,
    this.jcrPath,
  });

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
  ConfigNodePropertyString? checkpathPeriodPrefix;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jcrPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties &&
    other.path == path &&
    other.checkpathPeriodPrefix == checkpathPeriodPrefix &&
    other.jcrPath == jcrPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (path == null ? 0 : path!.hashCode) +
    (checkpathPeriodPrefix == null ? 0 : checkpathPeriodPrefix!.hashCode) +
    (jcrPath == null ? 0 : jcrPath!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties[path=$path, checkpathPeriodPrefix=$checkpathPeriodPrefix, jcrPath=$jcrPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.path != null) {
      json[r'path'] = this.path;
    } else {
      json[r'path'] = null;
    }
    if (this.checkpathPeriodPrefix != null) {
      json[r'checkpath.prefix'] = this.checkpathPeriodPrefix;
    } else {
      json[r'checkpath.prefix'] = null;
    }
    if (this.jcrPath != null) {
      json[r'jcrPath'] = this.jcrPath;
    } else {
      json[r'jcrPath'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties(
        path: ConfigNodePropertyString.fromJson(json[r'path']),
        checkpathPeriodPrefix: ConfigNodePropertyString.fromJson(json[r'checkpath.prefix']),
        jcrPath: ConfigNodePropertyString.fromJson(json[r'jcrPath']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

