//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties {
  /// Returns a new [OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties] instance.
  OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties({
    this.hcPeriodName,
    this.hcPeriodTags,
    this.hcPeriodMbeanPeriodName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? hcPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? hcPeriodTags;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? hcPeriodMbeanPeriodName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties &&
    other.hcPeriodName == hcPeriodName &&
    other.hcPeriodTags == hcPeriodTags &&
    other.hcPeriodMbeanPeriodName == hcPeriodMbeanPeriodName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodName == null ? 0 : hcPeriodName!.hashCode) +
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (hcPeriodMbeanPeriodName == null ? 0 : hcPeriodMbeanPeriodName!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties[hcPeriodName=$hcPeriodName, hcPeriodTags=$hcPeriodTags, hcPeriodMbeanPeriodName=$hcPeriodMbeanPeriodName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodName != null) {
      json[r'hc.name'] = this.hcPeriodName;
    } else {
      json[r'hc.name'] = null;
    }
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.hcPeriodMbeanPeriodName != null) {
      json[r'hc.mbean.name'] = this.hcPeriodMbeanPeriodName;
    } else {
      json[r'hc.mbean.name'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties(
        hcPeriodName: ConfigNodePropertyString.fromJson(json[r'hc.name']),
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        hcPeriodMbeanPeriodName: ConfigNodePropertyString.fromJson(json[r'hc.mbean.name']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

