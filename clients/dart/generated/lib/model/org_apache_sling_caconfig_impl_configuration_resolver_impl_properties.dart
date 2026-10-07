//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCaconfigImplConfigurationResolverImplProperties {
  /// Returns a new [OrgApacheSlingCaconfigImplConfigurationResolverImplProperties] instance.
  OrgApacheSlingCaconfigImplConfigurationResolverImplProperties({
    this.configBucketNames,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? configBucketNames;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCaconfigImplConfigurationResolverImplProperties &&
    other.configBucketNames == configBucketNames;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (configBucketNames == null ? 0 : configBucketNames!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCaconfigImplConfigurationResolverImplProperties[configBucketNames=$configBucketNames]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.configBucketNames != null) {
      json[r'configBucketNames'] = this.configBucketNames;
    } else {
      json[r'configBucketNames'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCaconfigImplConfigurationResolverImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCaconfigImplConfigurationResolverImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCaconfigImplConfigurationResolverImplProperties(
        configBucketNames: ConfigNodePropertyArray.fromJson(json[r'configBucketNames']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCaconfigImplConfigurationResolverImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCaconfigImplConfigurationResolverImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCaconfigImplConfigurationResolverImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCaconfigImplConfigurationResolverImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCaconfigImplConfigurationResolverImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCaconfigImplConfigurationResolverImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

