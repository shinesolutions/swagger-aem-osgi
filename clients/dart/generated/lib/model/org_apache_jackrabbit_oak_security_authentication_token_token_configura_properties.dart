//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties {
  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties] instance.
  OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties({
    this.tokenExpiration,
    this.tokenLength,
    this.tokenRefresh,
    this.tokenCleanupThreshold,
    this.passwordHashAlgorithm,
    this.passwordHashIterations,
    this.passwordSaltSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tokenExpiration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? tokenLength;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? tokenRefresh;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? tokenCleanupThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? passwordHashAlgorithm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? passwordHashIterations;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? passwordSaltSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties &&
    other.tokenExpiration == tokenExpiration &&
    other.tokenLength == tokenLength &&
    other.tokenRefresh == tokenRefresh &&
    other.tokenCleanupThreshold == tokenCleanupThreshold &&
    other.passwordHashAlgorithm == passwordHashAlgorithm &&
    other.passwordHashIterations == passwordHashIterations &&
    other.passwordSaltSize == passwordSaltSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (tokenExpiration == null ? 0 : tokenExpiration!.hashCode) +
    (tokenLength == null ? 0 : tokenLength!.hashCode) +
    (tokenRefresh == null ? 0 : tokenRefresh!.hashCode) +
    (tokenCleanupThreshold == null ? 0 : tokenCleanupThreshold!.hashCode) +
    (passwordHashAlgorithm == null ? 0 : passwordHashAlgorithm!.hashCode) +
    (passwordHashIterations == null ? 0 : passwordHashIterations!.hashCode) +
    (passwordSaltSize == null ? 0 : passwordSaltSize!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties[tokenExpiration=$tokenExpiration, tokenLength=$tokenLength, tokenRefresh=$tokenRefresh, tokenCleanupThreshold=$tokenCleanupThreshold, passwordHashAlgorithm=$passwordHashAlgorithm, passwordHashIterations=$passwordHashIterations, passwordSaltSize=$passwordSaltSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.tokenExpiration != null) {
      json[r'tokenExpiration'] = this.tokenExpiration;
    } else {
      json[r'tokenExpiration'] = null;
    }
    if (this.tokenLength != null) {
      json[r'tokenLength'] = this.tokenLength;
    } else {
      json[r'tokenLength'] = null;
    }
    if (this.tokenRefresh != null) {
      json[r'tokenRefresh'] = this.tokenRefresh;
    } else {
      json[r'tokenRefresh'] = null;
    }
    if (this.tokenCleanupThreshold != null) {
      json[r'tokenCleanupThreshold'] = this.tokenCleanupThreshold;
    } else {
      json[r'tokenCleanupThreshold'] = null;
    }
    if (this.passwordHashAlgorithm != null) {
      json[r'passwordHashAlgorithm'] = this.passwordHashAlgorithm;
    } else {
      json[r'passwordHashAlgorithm'] = null;
    }
    if (this.passwordHashIterations != null) {
      json[r'passwordHashIterations'] = this.passwordHashIterations;
    } else {
      json[r'passwordHashIterations'] = null;
    }
    if (this.passwordSaltSize != null) {
      json[r'passwordSaltSize'] = this.passwordSaltSize;
    } else {
      json[r'passwordSaltSize'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties(
        tokenExpiration: ConfigNodePropertyString.fromJson(json[r'tokenExpiration']),
        tokenLength: ConfigNodePropertyString.fromJson(json[r'tokenLength']),
        tokenRefresh: ConfigNodePropertyBoolean.fromJson(json[r'tokenRefresh']),
        tokenCleanupThreshold: ConfigNodePropertyInteger.fromJson(json[r'tokenCleanupThreshold']),
        passwordHashAlgorithm: ConfigNodePropertyString.fromJson(json[r'passwordHashAlgorithm']),
        passwordHashIterations: ConfigNodePropertyInteger.fromJson(json[r'passwordHashIterations']),
        passwordSaltSize: ConfigNodePropertyInteger.fromJson(json[r'passwordSaltSize']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

