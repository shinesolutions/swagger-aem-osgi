//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {
  /// Returns a new [OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties] instance.
  OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties({
    this.usersPath,
    this.groupsPath,
    this.systemRelativePath,
    this.defaultDepth,
    this.importBehavior,
    this.passwordHashAlgorithm,
    this.passwordHashIterations,
    this.passwordSaltSize,
    this.omitAdminPw,
    this.supportAutoSave,
    this.passwordMaxAge,
    this.initialPasswordChange,
    this.passwordHistorySize,
    this.passwordExpiryForAdmin,
    this.cacheExpiration,
    this.enableRFC7613UsercaseMappedProfile,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? usersPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? groupsPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? systemRelativePath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? defaultDepth;

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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? omitAdminPw;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? supportAutoSave;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? passwordMaxAge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? initialPasswordChange;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? passwordHistorySize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? passwordExpiryForAdmin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cacheExpiration;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? enableRFC7613UsercaseMappedProfile;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties &&
    other.usersPath == usersPath &&
    other.groupsPath == groupsPath &&
    other.systemRelativePath == systemRelativePath &&
    other.defaultDepth == defaultDepth &&
    other.importBehavior == importBehavior &&
    other.passwordHashAlgorithm == passwordHashAlgorithm &&
    other.passwordHashIterations == passwordHashIterations &&
    other.passwordSaltSize == passwordSaltSize &&
    other.omitAdminPw == omitAdminPw &&
    other.supportAutoSave == supportAutoSave &&
    other.passwordMaxAge == passwordMaxAge &&
    other.initialPasswordChange == initialPasswordChange &&
    other.passwordHistorySize == passwordHistorySize &&
    other.passwordExpiryForAdmin == passwordExpiryForAdmin &&
    other.cacheExpiration == cacheExpiration &&
    other.enableRFC7613UsercaseMappedProfile == enableRFC7613UsercaseMappedProfile;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (usersPath == null ? 0 : usersPath!.hashCode) +
    (groupsPath == null ? 0 : groupsPath!.hashCode) +
    (systemRelativePath == null ? 0 : systemRelativePath!.hashCode) +
    (defaultDepth == null ? 0 : defaultDepth!.hashCode) +
    (importBehavior == null ? 0 : importBehavior!.hashCode) +
    (passwordHashAlgorithm == null ? 0 : passwordHashAlgorithm!.hashCode) +
    (passwordHashIterations == null ? 0 : passwordHashIterations!.hashCode) +
    (passwordSaltSize == null ? 0 : passwordSaltSize!.hashCode) +
    (omitAdminPw == null ? 0 : omitAdminPw!.hashCode) +
    (supportAutoSave == null ? 0 : supportAutoSave!.hashCode) +
    (passwordMaxAge == null ? 0 : passwordMaxAge!.hashCode) +
    (initialPasswordChange == null ? 0 : initialPasswordChange!.hashCode) +
    (passwordHistorySize == null ? 0 : passwordHistorySize!.hashCode) +
    (passwordExpiryForAdmin == null ? 0 : passwordExpiryForAdmin!.hashCode) +
    (cacheExpiration == null ? 0 : cacheExpiration!.hashCode) +
    (enableRFC7613UsercaseMappedProfile == null ? 0 : enableRFC7613UsercaseMappedProfile!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties[usersPath=$usersPath, groupsPath=$groupsPath, systemRelativePath=$systemRelativePath, defaultDepth=$defaultDepth, importBehavior=$importBehavior, passwordHashAlgorithm=$passwordHashAlgorithm, passwordHashIterations=$passwordHashIterations, passwordSaltSize=$passwordSaltSize, omitAdminPw=$omitAdminPw, supportAutoSave=$supportAutoSave, passwordMaxAge=$passwordMaxAge, initialPasswordChange=$initialPasswordChange, passwordHistorySize=$passwordHistorySize, passwordExpiryForAdmin=$passwordExpiryForAdmin, cacheExpiration=$cacheExpiration, enableRFC7613UsercaseMappedProfile=$enableRFC7613UsercaseMappedProfile]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.usersPath != null) {
      json[r'usersPath'] = this.usersPath;
    } else {
      json[r'usersPath'] = null;
    }
    if (this.groupsPath != null) {
      json[r'groupsPath'] = this.groupsPath;
    } else {
      json[r'groupsPath'] = null;
    }
    if (this.systemRelativePath != null) {
      json[r'systemRelativePath'] = this.systemRelativePath;
    } else {
      json[r'systemRelativePath'] = null;
    }
    if (this.defaultDepth != null) {
      json[r'defaultDepth'] = this.defaultDepth;
    } else {
      json[r'defaultDepth'] = null;
    }
    if (this.importBehavior != null) {
      json[r'importBehavior'] = this.importBehavior;
    } else {
      json[r'importBehavior'] = null;
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
    if (this.omitAdminPw != null) {
      json[r'omitAdminPw'] = this.omitAdminPw;
    } else {
      json[r'omitAdminPw'] = null;
    }
    if (this.supportAutoSave != null) {
      json[r'supportAutoSave'] = this.supportAutoSave;
    } else {
      json[r'supportAutoSave'] = null;
    }
    if (this.passwordMaxAge != null) {
      json[r'passwordMaxAge'] = this.passwordMaxAge;
    } else {
      json[r'passwordMaxAge'] = null;
    }
    if (this.initialPasswordChange != null) {
      json[r'initialPasswordChange'] = this.initialPasswordChange;
    } else {
      json[r'initialPasswordChange'] = null;
    }
    if (this.passwordHistorySize != null) {
      json[r'passwordHistorySize'] = this.passwordHistorySize;
    } else {
      json[r'passwordHistorySize'] = null;
    }
    if (this.passwordExpiryForAdmin != null) {
      json[r'passwordExpiryForAdmin'] = this.passwordExpiryForAdmin;
    } else {
      json[r'passwordExpiryForAdmin'] = null;
    }
    if (this.cacheExpiration != null) {
      json[r'cacheExpiration'] = this.cacheExpiration;
    } else {
      json[r'cacheExpiration'] = null;
    }
    if (this.enableRFC7613UsercaseMappedProfile != null) {
      json[r'enableRFC7613UsercaseMappedProfile'] = this.enableRFC7613UsercaseMappedProfile;
    } else {
      json[r'enableRFC7613UsercaseMappedProfile'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties(
        usersPath: ConfigNodePropertyString.fromJson(json[r'usersPath']),
        groupsPath: ConfigNodePropertyString.fromJson(json[r'groupsPath']),
        systemRelativePath: ConfigNodePropertyString.fromJson(json[r'systemRelativePath']),
        defaultDepth: ConfigNodePropertyInteger.fromJson(json[r'defaultDepth']),
        importBehavior: ConfigNodePropertyDropDown.fromJson(json[r'importBehavior']),
        passwordHashAlgorithm: ConfigNodePropertyString.fromJson(json[r'passwordHashAlgorithm']),
        passwordHashIterations: ConfigNodePropertyInteger.fromJson(json[r'passwordHashIterations']),
        passwordSaltSize: ConfigNodePropertyInteger.fromJson(json[r'passwordSaltSize']),
        omitAdminPw: ConfigNodePropertyBoolean.fromJson(json[r'omitAdminPw']),
        supportAutoSave: ConfigNodePropertyBoolean.fromJson(json[r'supportAutoSave']),
        passwordMaxAge: ConfigNodePropertyInteger.fromJson(json[r'passwordMaxAge']),
        initialPasswordChange: ConfigNodePropertyBoolean.fromJson(json[r'initialPasswordChange']),
        passwordHistorySize: ConfigNodePropertyInteger.fromJson(json[r'passwordHistorySize']),
        passwordExpiryForAdmin: ConfigNodePropertyBoolean.fromJson(json[r'passwordExpiryForAdmin']),
        cacheExpiration: ConfigNodePropertyInteger.fromJson(json[r'cacheExpiration']),
        enableRFC7613UsercaseMappedProfile: ConfigNodePropertyBoolean.fromJson(json[r'enableRFC7613UsercaseMappedProfile']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

