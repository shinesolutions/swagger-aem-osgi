//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties {
  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties] instance.
  OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties({
    this.permissionsJr2,
    this.importBehavior,
    this.readPaths,
    this.administrativePrincipals,
    this.configurationRanking,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? permissionsJr2;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? importBehavior;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? readPaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? administrativePrincipals;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? configurationRanking;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties &&
    other.permissionsJr2 == permissionsJr2 &&
    other.importBehavior == importBehavior &&
    other.readPaths == readPaths &&
    other.administrativePrincipals == administrativePrincipals &&
    other.configurationRanking == configurationRanking;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (permissionsJr2 == null ? 0 : permissionsJr2!.hashCode) +
    (importBehavior == null ? 0 : importBehavior!.hashCode) +
    (readPaths == null ? 0 : readPaths!.hashCode) +
    (administrativePrincipals == null ? 0 : administrativePrincipals!.hashCode) +
    (configurationRanking == null ? 0 : configurationRanking!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties[permissionsJr2=$permissionsJr2, importBehavior=$importBehavior, readPaths=$readPaths, administrativePrincipals=$administrativePrincipals, configurationRanking=$configurationRanking]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.permissionsJr2 != null) {
      json[r'permissionsJr2'] = this.permissionsJr2;
    } else {
      json[r'permissionsJr2'] = null;
    }
    if (this.importBehavior != null) {
      json[r'importBehavior'] = this.importBehavior;
    } else {
      json[r'importBehavior'] = null;
    }
    if (this.readPaths != null) {
      json[r'readPaths'] = this.readPaths;
    } else {
      json[r'readPaths'] = null;
    }
    if (this.administrativePrincipals != null) {
      json[r'administrativePrincipals'] = this.administrativePrincipals;
    } else {
      json[r'administrativePrincipals'] = null;
    }
    if (this.configurationRanking != null) {
      json[r'configurationRanking'] = this.configurationRanking;
    } else {
      json[r'configurationRanking'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties(
        permissionsJr2: ConfigNodePropertyDropDown.fromJson(json[r'permissionsJr2']),
        importBehavior: ConfigNodePropertyDropDown.fromJson(json[r'importBehavior']),
        readPaths: ConfigNodePropertyArray.fromJson(json[r'readPaths']),
        administrativePrincipals: ConfigNodePropertyArray.fromJson(json[r'administrativePrincipals']),
        configurationRanking: ConfigNodePropertyInteger.fromJson(json[r'configurationRanking']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

