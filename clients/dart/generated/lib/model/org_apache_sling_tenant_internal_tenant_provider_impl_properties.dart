//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingTenantInternalTenantProviderImplProperties {
  /// Returns a new [OrgApacheSlingTenantInternalTenantProviderImplProperties] instance.
  OrgApacheSlingTenantInternalTenantProviderImplProperties({
    this.tenantPeriodRoot,
    this.tenantPeriodPathPeriodMatcher,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tenantPeriodRoot;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? tenantPeriodPathPeriodMatcher;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingTenantInternalTenantProviderImplProperties &&
    other.tenantPeriodRoot == tenantPeriodRoot &&
    other.tenantPeriodPathPeriodMatcher == tenantPeriodPathPeriodMatcher;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (tenantPeriodRoot == null ? 0 : tenantPeriodRoot!.hashCode) +
    (tenantPeriodPathPeriodMatcher == null ? 0 : tenantPeriodPathPeriodMatcher!.hashCode);

  @override
  String toString() => 'OrgApacheSlingTenantInternalTenantProviderImplProperties[tenantPeriodRoot=$tenantPeriodRoot, tenantPeriodPathPeriodMatcher=$tenantPeriodPathPeriodMatcher]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.tenantPeriodRoot != null) {
      json[r'tenant.root'] = this.tenantPeriodRoot;
    } else {
      json[r'tenant.root'] = null;
    }
    if (this.tenantPeriodPathPeriodMatcher != null) {
      json[r'tenant.path.matcher'] = this.tenantPeriodPathPeriodMatcher;
    } else {
      json[r'tenant.path.matcher'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingTenantInternalTenantProviderImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingTenantInternalTenantProviderImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingTenantInternalTenantProviderImplProperties(
        tenantPeriodRoot: ConfigNodePropertyString.fromJson(json[r'tenant.root']),
        tenantPeriodPathPeriodMatcher: ConfigNodePropertyArray.fromJson(json[r'tenant.path.matcher']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingTenantInternalTenantProviderImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingTenantInternalTenantProviderImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingTenantInternalTenantProviderImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingTenantInternalTenantProviderImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingTenantInternalTenantProviderImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingTenantInternalTenantProviderImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingTenantInternalTenantProviderImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingTenantInternalTenantProviderImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingTenantInternalTenantProviderImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingTenantInternalTenantProviderImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

