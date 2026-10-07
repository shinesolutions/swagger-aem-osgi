//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties {
  /// Returns a new [OrgApacheSlingJmxProviderImplJMXResourceProviderProperties] instance.
  OrgApacheSlingJmxProviderImplJMXResourceProviderProperties({
    this.providerPeriodRoots,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? providerPeriodRoots;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJmxProviderImplJMXResourceProviderProperties &&
    other.providerPeriodRoots == providerPeriodRoots;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (providerPeriodRoots == null ? 0 : providerPeriodRoots!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJmxProviderImplJMXResourceProviderProperties[providerPeriodRoots=$providerPeriodRoots]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.providerPeriodRoots != null) {
      json[r'provider.roots'] = this.providerPeriodRoots;
    } else {
      json[r'provider.roots'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJmxProviderImplJMXResourceProviderProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJmxProviderImplJMXResourceProviderProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(
        providerPeriodRoots: ConfigNodePropertyString.fromJson(json[r'provider.roots']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJmxProviderImplJMXResourceProviderProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJmxProviderImplJMXResourceProviderProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJmxProviderImplJMXResourceProviderProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJmxProviderImplJMXResourceProviderProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJmxProviderImplJMXResourceProviderProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

