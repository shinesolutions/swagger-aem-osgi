//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {
  /// Returns a new [OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties] instance.
  OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties({
    this.javaPeriodNamingPeriodFactoryPeriodInitial,
    this.javaPeriodNamingPeriodProviderPeriodUrl,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? javaPeriodNamingPeriodFactoryPeriodInitial;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? javaPeriodNamingPeriodProviderPeriodUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties &&
    other.javaPeriodNamingPeriodFactoryPeriodInitial == javaPeriodNamingPeriodFactoryPeriodInitial &&
    other.javaPeriodNamingPeriodProviderPeriodUrl == javaPeriodNamingPeriodProviderPeriodUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (javaPeriodNamingPeriodFactoryPeriodInitial == null ? 0 : javaPeriodNamingPeriodFactoryPeriodInitial!.hashCode) +
    (javaPeriodNamingPeriodProviderPeriodUrl == null ? 0 : javaPeriodNamingPeriodProviderPeriodUrl!.hashCode);

  @override
  String toString() => 'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties[javaPeriodNamingPeriodFactoryPeriodInitial=$javaPeriodNamingPeriodFactoryPeriodInitial, javaPeriodNamingPeriodProviderPeriodUrl=$javaPeriodNamingPeriodProviderPeriodUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.javaPeriodNamingPeriodFactoryPeriodInitial != null) {
      json[r'java.naming.factory.initial'] = this.javaPeriodNamingPeriodFactoryPeriodInitial;
    } else {
      json[r'java.naming.factory.initial'] = null;
    }
    if (this.javaPeriodNamingPeriodProviderPeriodUrl != null) {
      json[r'java.naming.provider.url'] = this.javaPeriodNamingPeriodProviderPeriodUrl;
    } else {
      json[r'java.naming.provider.url'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties(
        javaPeriodNamingPeriodFactoryPeriodInitial: ConfigNodePropertyString.fromJson(json[r'java.naming.factory.initial']),
        javaPeriodNamingPeriodProviderPeriodUrl: ConfigNodePropertyString.fromJson(json[r'java.naming.provider.url']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

