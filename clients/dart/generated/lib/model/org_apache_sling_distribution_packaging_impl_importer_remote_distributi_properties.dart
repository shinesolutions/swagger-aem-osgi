//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties {
  /// Returns a new [OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties] instance.
  OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties({
    this.name,
    this.endpoints,
    this.transportSecretProviderPeriodTarget,
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
  ConfigNodePropertyArray? endpoints;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? transportSecretProviderPeriodTarget;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties &&
    other.name == name &&
    other.endpoints == endpoints &&
    other.transportSecretProviderPeriodTarget == transportSecretProviderPeriodTarget;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (endpoints == null ? 0 : endpoints!.hashCode) +
    (transportSecretProviderPeriodTarget == null ? 0 : transportSecretProviderPeriodTarget!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties[name=$name, endpoints=$endpoints, transportSecretProviderPeriodTarget=$transportSecretProviderPeriodTarget]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.endpoints != null) {
      json[r'endpoints'] = this.endpoints;
    } else {
      json[r'endpoints'] = null;
    }
    if (this.transportSecretProviderPeriodTarget != null) {
      json[r'transportSecretProvider.target'] = this.transportSecretProviderPeriodTarget;
    } else {
      json[r'transportSecretProvider.target'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        endpoints: ConfigNodePropertyArray.fromJson(json[r'endpoints']),
        transportSecretProviderPeriodTarget: ConfigNodePropertyString.fromJson(json[r'transportSecretProvider.target']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

