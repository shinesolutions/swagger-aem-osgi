//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties {
  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties] instance.
  OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties({
    this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName,
    this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties &&
    other.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName == orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName &&
    other.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName == orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName == null ? 0 : orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName!.hashCode) +
    (orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName == null ? 0 : orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties[orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName=$orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName, orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName=$orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName != null) {
      json[r'org.apache.jackrabbit.oak.authentication.appName'] = this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName;
    } else {
      json[r'org.apache.jackrabbit.oak.authentication.appName'] = null;
    }
    if (this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName != null) {
      json[r'org.apache.jackrabbit.oak.authentication.configSpiName'] = this.orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName;
    } else {
      json[r'org.apache.jackrabbit.oak.authentication.configSpiName'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties(
        orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodAppName: ConfigNodePropertyString.fromJson(json[r'org.apache.jackrabbit.oak.authentication.appName']),
        orgPeriodApachePeriodJackrabbitPeriodOakPeriodAuthenticationPeriodConfigSpiName: ConfigNodePropertyString.fromJson(json[r'org.apache.jackrabbit.oak.authentication.configSpiName']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

