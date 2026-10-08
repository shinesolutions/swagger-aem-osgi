//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
  /// Returns a new [OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties] instance.
  OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties({
    this.enabled,
    this.configPath,
    this.fallbackPaths,
    this.configCollectionInheritancePropertyNames,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? configPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? fallbackPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? configCollectionInheritancePropertyNames;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties &&
    other.enabled == enabled &&
    other.configPath == configPath &&
    other.fallbackPaths == fallbackPaths &&
    other.configCollectionInheritancePropertyNames == configCollectionInheritancePropertyNames;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabled == null ? 0 : enabled!.hashCode) +
    (configPath == null ? 0 : configPath!.hashCode) +
    (fallbackPaths == null ? 0 : fallbackPaths!.hashCode) +
    (configCollectionInheritancePropertyNames == null ? 0 : configCollectionInheritancePropertyNames!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties[enabled=$enabled, configPath=$configPath, fallbackPaths=$fallbackPaths, configCollectionInheritancePropertyNames=$configCollectionInheritancePropertyNames]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
    if (this.configPath != null) {
      json[r'configPath'] = this.configPath;
    } else {
      json[r'configPath'] = null;
    }
    if (this.fallbackPaths != null) {
      json[r'fallbackPaths'] = this.fallbackPaths;
    } else {
      json[r'fallbackPaths'] = null;
    }
    if (this.configCollectionInheritancePropertyNames != null) {
      json[r'configCollectionInheritancePropertyNames'] = this.configCollectionInheritancePropertyNames;
    } else {
      json[r'configCollectionInheritancePropertyNames'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties(
        enabled: ConfigNodePropertyBoolean.fromJson(json[r'enabled']),
        configPath: ConfigNodePropertyString.fromJson(json[r'configPath']),
        fallbackPaths: ConfigNodePropertyArray.fromJson(json[r'fallbackPaths']),
        configCollectionInheritancePropertyNames: ConfigNodePropertyArray.fromJson(json[r'configCollectionInheritancePropertyNames']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

