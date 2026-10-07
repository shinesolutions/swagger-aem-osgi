//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixJaasConfigurationSpiProperties {
  /// Returns a new [OrgApacheFelixJaasConfigurationSpiProperties] instance.
  OrgApacheFelixJaasConfigurationSpiProperties({
    this.jaasPeriodDefaultRealmName,
    this.jaasPeriodConfigProviderName,
    this.jaasPeriodGlobalConfigPolicy,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodDefaultRealmName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodConfigProviderName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? jaasPeriodGlobalConfigPolicy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixJaasConfigurationSpiProperties &&
    other.jaasPeriodDefaultRealmName == jaasPeriodDefaultRealmName &&
    other.jaasPeriodConfigProviderName == jaasPeriodConfigProviderName &&
    other.jaasPeriodGlobalConfigPolicy == jaasPeriodGlobalConfigPolicy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jaasPeriodDefaultRealmName == null ? 0 : jaasPeriodDefaultRealmName!.hashCode) +
    (jaasPeriodConfigProviderName == null ? 0 : jaasPeriodConfigProviderName!.hashCode) +
    (jaasPeriodGlobalConfigPolicy == null ? 0 : jaasPeriodGlobalConfigPolicy!.hashCode);

  @override
  String toString() => 'OrgApacheFelixJaasConfigurationSpiProperties[jaasPeriodDefaultRealmName=$jaasPeriodDefaultRealmName, jaasPeriodConfigProviderName=$jaasPeriodConfigProviderName, jaasPeriodGlobalConfigPolicy=$jaasPeriodGlobalConfigPolicy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jaasPeriodDefaultRealmName != null) {
      json[r'jaas.defaultRealmName'] = this.jaasPeriodDefaultRealmName;
    } else {
      json[r'jaas.defaultRealmName'] = null;
    }
    if (this.jaasPeriodConfigProviderName != null) {
      json[r'jaas.configProviderName'] = this.jaasPeriodConfigProviderName;
    } else {
      json[r'jaas.configProviderName'] = null;
    }
    if (this.jaasPeriodGlobalConfigPolicy != null) {
      json[r'jaas.globalConfigPolicy'] = this.jaasPeriodGlobalConfigPolicy;
    } else {
      json[r'jaas.globalConfigPolicy'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixJaasConfigurationSpiProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixJaasConfigurationSpiProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixJaasConfigurationSpiProperties(
        jaasPeriodDefaultRealmName: ConfigNodePropertyString.fromJson(json[r'jaas.defaultRealmName']),
        jaasPeriodConfigProviderName: ConfigNodePropertyString.fromJson(json[r'jaas.configProviderName']),
        jaasPeriodGlobalConfigPolicy: ConfigNodePropertyDropDown.fromJson(json[r'jaas.globalConfigPolicy']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixJaasConfigurationSpiProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixJaasConfigurationSpiProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixJaasConfigurationSpiProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixJaasConfigurationSpiProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixJaasConfigurationSpiProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixJaasConfigurationSpiProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixJaasConfigurationSpiProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixJaasConfigurationSpiProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixJaasConfigurationSpiProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixJaasConfigurationSpiProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

