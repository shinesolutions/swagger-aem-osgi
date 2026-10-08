//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties {
  /// Returns a new [ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties] instance.
  ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties({
    this.hcPeriodTags,
    this.accountPeriodLogins,
    this.consolePeriodLogins,
  });

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
  ConfigNodePropertyArray? accountPeriodLogins;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? consolePeriodLogins;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties &&
    other.hcPeriodTags == hcPeriodTags &&
    other.accountPeriodLogins == accountPeriodLogins &&
    other.consolePeriodLogins == consolePeriodLogins;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hcPeriodTags == null ? 0 : hcPeriodTags!.hashCode) +
    (accountPeriodLogins == null ? 0 : accountPeriodLogins!.hashCode) +
    (consolePeriodLogins == null ? 0 : consolePeriodLogins!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties[hcPeriodTags=$hcPeriodTags, accountPeriodLogins=$accountPeriodLogins, consolePeriodLogins=$consolePeriodLogins]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.hcPeriodTags != null) {
      json[r'hc.tags'] = this.hcPeriodTags;
    } else {
      json[r'hc.tags'] = null;
    }
    if (this.accountPeriodLogins != null) {
      json[r'account.logins'] = this.accountPeriodLogins;
    } else {
      json[r'account.logins'] = null;
    }
    if (this.consolePeriodLogins != null) {
      json[r'console.logins'] = this.consolePeriodLogins;
    } else {
      json[r'console.logins'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties(
        hcPeriodTags: ConfigNodePropertyArray.fromJson(json[r'hc.tags']),
        accountPeriodLogins: ConfigNodePropertyArray.fromJson(json[r'account.logins']),
        consolePeriodLogins: ConfigNodePropertyArray.fromJson(json[r'console.logins']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

