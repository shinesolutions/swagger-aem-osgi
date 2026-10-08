//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties {
  /// Returns a new [OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties] instance.
  OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties({
    this.name,
    this.path,
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

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties &&
    other.name == name &&
    other.path == path;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (path == null ? 0 : path!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties[name=$name, path=$path]';

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
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        path: ConfigNodePropertyString.fromJson(json[r'path']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

