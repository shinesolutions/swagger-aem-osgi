//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingSecurityImplReferrerFilterProperties {
  /// Returns a new [OrgApacheSlingSecurityImplReferrerFilterProperties] instance.
  OrgApacheSlingSecurityImplReferrerFilterProperties({
    this.allowPeriodEmpty,
    this.allowPeriodHosts,
    this.allowPeriodHostsPeriodRegexp,
    this.filterPeriodMethods,
    this.excludePeriodAgentsPeriodRegexp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? allowPeriodEmpty;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? allowPeriodHosts;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? allowPeriodHostsPeriodRegexp;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? filterPeriodMethods;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? excludePeriodAgentsPeriodRegexp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingSecurityImplReferrerFilterProperties &&
    other.allowPeriodEmpty == allowPeriodEmpty &&
    other.allowPeriodHosts == allowPeriodHosts &&
    other.allowPeriodHostsPeriodRegexp == allowPeriodHostsPeriodRegexp &&
    other.filterPeriodMethods == filterPeriodMethods &&
    other.excludePeriodAgentsPeriodRegexp == excludePeriodAgentsPeriodRegexp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (allowPeriodEmpty == null ? 0 : allowPeriodEmpty!.hashCode) +
    (allowPeriodHosts == null ? 0 : allowPeriodHosts!.hashCode) +
    (allowPeriodHostsPeriodRegexp == null ? 0 : allowPeriodHostsPeriodRegexp!.hashCode) +
    (filterPeriodMethods == null ? 0 : filterPeriodMethods!.hashCode) +
    (excludePeriodAgentsPeriodRegexp == null ? 0 : excludePeriodAgentsPeriodRegexp!.hashCode);

  @override
  String toString() => 'OrgApacheSlingSecurityImplReferrerFilterProperties[allowPeriodEmpty=$allowPeriodEmpty, allowPeriodHosts=$allowPeriodHosts, allowPeriodHostsPeriodRegexp=$allowPeriodHostsPeriodRegexp, filterPeriodMethods=$filterPeriodMethods, excludePeriodAgentsPeriodRegexp=$excludePeriodAgentsPeriodRegexp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.allowPeriodEmpty != null) {
      json[r'allow.empty'] = this.allowPeriodEmpty;
    } else {
      json[r'allow.empty'] = null;
    }
    if (this.allowPeriodHosts != null) {
      json[r'allow.hosts'] = this.allowPeriodHosts;
    } else {
      json[r'allow.hosts'] = null;
    }
    if (this.allowPeriodHostsPeriodRegexp != null) {
      json[r'allow.hosts.regexp'] = this.allowPeriodHostsPeriodRegexp;
    } else {
      json[r'allow.hosts.regexp'] = null;
    }
    if (this.filterPeriodMethods != null) {
      json[r'filter.methods'] = this.filterPeriodMethods;
    } else {
      json[r'filter.methods'] = null;
    }
    if (this.excludePeriodAgentsPeriodRegexp != null) {
      json[r'exclude.agents.regexp'] = this.excludePeriodAgentsPeriodRegexp;
    } else {
      json[r'exclude.agents.regexp'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingSecurityImplReferrerFilterProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingSecurityImplReferrerFilterProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingSecurityImplReferrerFilterProperties(
        allowPeriodEmpty: ConfigNodePropertyBoolean.fromJson(json[r'allow.empty']),
        allowPeriodHosts: ConfigNodePropertyArray.fromJson(json[r'allow.hosts']),
        allowPeriodHostsPeriodRegexp: ConfigNodePropertyArray.fromJson(json[r'allow.hosts.regexp']),
        filterPeriodMethods: ConfigNodePropertyArray.fromJson(json[r'filter.methods']),
        excludePeriodAgentsPeriodRegexp: ConfigNodePropertyArray.fromJson(json[r'exclude.agents.regexp']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingSecurityImplReferrerFilterProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingSecurityImplReferrerFilterProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingSecurityImplReferrerFilterProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingSecurityImplReferrerFilterProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingSecurityImplReferrerFilterProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingSecurityImplReferrerFilterProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingSecurityImplReferrerFilterProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingSecurityImplReferrerFilterProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingSecurityImplReferrerFilterProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingSecurityImplReferrerFilterProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

