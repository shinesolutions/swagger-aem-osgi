//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {
  /// Returns a new [OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties] instance.
  OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties({
    this.name,
    this.jcrPrivilege,
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
  ConfigNodePropertyString? jcrPrivilege;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties &&
    other.name == name &&
    other.jcrPrivilege == jcrPrivilege;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name == null ? 0 : name!.hashCode) +
    (jcrPrivilege == null ? 0 : jcrPrivilege!.hashCode);

  @override
  String toString() => 'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties[name=$name, jcrPrivilege=$jcrPrivilege]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.jcrPrivilege != null) {
      json[r'jcrPrivilege'] = this.jcrPrivilege;
    } else {
      json[r'jcrPrivilege'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties(
        name: ConfigNodePropertyString.fromJson(json[r'name']),
        jcrPrivilege: ConfigNodePropertyString.fromJson(json[r'jcrPrivilege']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

