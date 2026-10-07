//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties {
  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties] instance.
  OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties({
    this.asyncConfigs,
    this.leaseTimeOutMinutes,
    this.failingIndexTimeoutSeconds,
    this.errorWarnIntervalSeconds,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? asyncConfigs;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? leaseTimeOutMinutes;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? failingIndexTimeoutSeconds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? errorWarnIntervalSeconds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties &&
    other.asyncConfigs == asyncConfigs &&
    other.leaseTimeOutMinutes == leaseTimeOutMinutes &&
    other.failingIndexTimeoutSeconds == failingIndexTimeoutSeconds &&
    other.errorWarnIntervalSeconds == errorWarnIntervalSeconds;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (asyncConfigs == null ? 0 : asyncConfigs!.hashCode) +
    (leaseTimeOutMinutes == null ? 0 : leaseTimeOutMinutes!.hashCode) +
    (failingIndexTimeoutSeconds == null ? 0 : failingIndexTimeoutSeconds!.hashCode) +
    (errorWarnIntervalSeconds == null ? 0 : errorWarnIntervalSeconds!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties[asyncConfigs=$asyncConfigs, leaseTimeOutMinutes=$leaseTimeOutMinutes, failingIndexTimeoutSeconds=$failingIndexTimeoutSeconds, errorWarnIntervalSeconds=$errorWarnIntervalSeconds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.asyncConfigs != null) {
      json[r'asyncConfigs'] = this.asyncConfigs;
    } else {
      json[r'asyncConfigs'] = null;
    }
    if (this.leaseTimeOutMinutes != null) {
      json[r'leaseTimeOutMinutes'] = this.leaseTimeOutMinutes;
    } else {
      json[r'leaseTimeOutMinutes'] = null;
    }
    if (this.failingIndexTimeoutSeconds != null) {
      json[r'failingIndexTimeoutSeconds'] = this.failingIndexTimeoutSeconds;
    } else {
      json[r'failingIndexTimeoutSeconds'] = null;
    }
    if (this.errorWarnIntervalSeconds != null) {
      json[r'errorWarnIntervalSeconds'] = this.errorWarnIntervalSeconds;
    } else {
      json[r'errorWarnIntervalSeconds'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties(
        asyncConfigs: ConfigNodePropertyArray.fromJson(json[r'asyncConfigs']),
        leaseTimeOutMinutes: ConfigNodePropertyInteger.fromJson(json[r'leaseTimeOutMinutes']),
        failingIndexTimeoutSeconds: ConfigNodePropertyInteger.fromJson(json[r'failingIndexTimeoutSeconds']),
        errorWarnIntervalSeconds: ConfigNodePropertyInteger.fromJson(json[r'errorWarnIntervalSeconds']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

