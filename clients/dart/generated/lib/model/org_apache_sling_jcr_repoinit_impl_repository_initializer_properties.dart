//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {
  /// Returns a new [OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] instance.
  OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties({
    this.references,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? references;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties &&
    other.references == references;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (references == null ? 0 : references!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties[references=$references]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.references != null) {
      json[r'references'] = this.references;
    } else {
      json[r'references'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties(
        references: ConfigNodePropertyArray.fromJson(json[r'references']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

