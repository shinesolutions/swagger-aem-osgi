//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCommonsHttpclientProperties {
  /// Returns a new [ComDayCommonsHttpclientProperties] instance.
  ComDayCommonsHttpclientProperties({
    this.proxyPeriodEnabled,
    this.proxyPeriodHost,
    this.proxyPeriodUser,
    this.proxyPeriodPassword,
    this.proxyPeriodNtlmPeriodHost,
    this.proxyPeriodNtlmPeriodDomain,
    this.proxyPeriodExceptions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? proxyPeriodEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? proxyPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? proxyPeriodUser;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? proxyPeriodPassword;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? proxyPeriodNtlmPeriodHost;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? proxyPeriodNtlmPeriodDomain;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? proxyPeriodExceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCommonsHttpclientProperties &&
    other.proxyPeriodEnabled == proxyPeriodEnabled &&
    other.proxyPeriodHost == proxyPeriodHost &&
    other.proxyPeriodUser == proxyPeriodUser &&
    other.proxyPeriodPassword == proxyPeriodPassword &&
    other.proxyPeriodNtlmPeriodHost == proxyPeriodNtlmPeriodHost &&
    other.proxyPeriodNtlmPeriodDomain == proxyPeriodNtlmPeriodDomain &&
    other.proxyPeriodExceptions == proxyPeriodExceptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (proxyPeriodEnabled == null ? 0 : proxyPeriodEnabled!.hashCode) +
    (proxyPeriodHost == null ? 0 : proxyPeriodHost!.hashCode) +
    (proxyPeriodUser == null ? 0 : proxyPeriodUser!.hashCode) +
    (proxyPeriodPassword == null ? 0 : proxyPeriodPassword!.hashCode) +
    (proxyPeriodNtlmPeriodHost == null ? 0 : proxyPeriodNtlmPeriodHost!.hashCode) +
    (proxyPeriodNtlmPeriodDomain == null ? 0 : proxyPeriodNtlmPeriodDomain!.hashCode) +
    (proxyPeriodExceptions == null ? 0 : proxyPeriodExceptions!.hashCode);

  @override
  String toString() => 'ComDayCommonsHttpclientProperties[proxyPeriodEnabled=$proxyPeriodEnabled, proxyPeriodHost=$proxyPeriodHost, proxyPeriodUser=$proxyPeriodUser, proxyPeriodPassword=$proxyPeriodPassword, proxyPeriodNtlmPeriodHost=$proxyPeriodNtlmPeriodHost, proxyPeriodNtlmPeriodDomain=$proxyPeriodNtlmPeriodDomain, proxyPeriodExceptions=$proxyPeriodExceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.proxyPeriodEnabled != null) {
      json[r'proxy.enabled'] = this.proxyPeriodEnabled;
    } else {
      json[r'proxy.enabled'] = null;
    }
    if (this.proxyPeriodHost != null) {
      json[r'proxy.host'] = this.proxyPeriodHost;
    } else {
      json[r'proxy.host'] = null;
    }
    if (this.proxyPeriodUser != null) {
      json[r'proxy.user'] = this.proxyPeriodUser;
    } else {
      json[r'proxy.user'] = null;
    }
    if (this.proxyPeriodPassword != null) {
      json[r'proxy.password'] = this.proxyPeriodPassword;
    } else {
      json[r'proxy.password'] = null;
    }
    if (this.proxyPeriodNtlmPeriodHost != null) {
      json[r'proxy.ntlm.host'] = this.proxyPeriodNtlmPeriodHost;
    } else {
      json[r'proxy.ntlm.host'] = null;
    }
    if (this.proxyPeriodNtlmPeriodDomain != null) {
      json[r'proxy.ntlm.domain'] = this.proxyPeriodNtlmPeriodDomain;
    } else {
      json[r'proxy.ntlm.domain'] = null;
    }
    if (this.proxyPeriodExceptions != null) {
      json[r'proxy.exceptions'] = this.proxyPeriodExceptions;
    } else {
      json[r'proxy.exceptions'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCommonsHttpclientProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCommonsHttpclientProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCommonsHttpclientProperties(
        proxyPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'proxy.enabled']),
        proxyPeriodHost: ConfigNodePropertyString.fromJson(json[r'proxy.host']),
        proxyPeriodUser: ConfigNodePropertyString.fromJson(json[r'proxy.user']),
        proxyPeriodPassword: ConfigNodePropertyString.fromJson(json[r'proxy.password']),
        proxyPeriodNtlmPeriodHost: ConfigNodePropertyString.fromJson(json[r'proxy.ntlm.host']),
        proxyPeriodNtlmPeriodDomain: ConfigNodePropertyString.fromJson(json[r'proxy.ntlm.domain']),
        proxyPeriodExceptions: ConfigNodePropertyArray.fromJson(json[r'proxy.exceptions']),
      );
    }
    return null;
  }

  static List<ComDayCommonsHttpclientProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCommonsHttpclientProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCommonsHttpclientProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCommonsHttpclientProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCommonsHttpclientProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCommonsHttpclientProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCommonsHttpclientProperties-objects as value to a dart map
  static Map<String, List<ComDayCommonsHttpclientProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCommonsHttpclientProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCommonsHttpclientProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

