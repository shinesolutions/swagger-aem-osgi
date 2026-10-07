//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {
  /// Returns a new [OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties] instance.
  OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties({
    this.jaasPeriodRanking,
    this.jaasPeriodControlFlag,
    this.jaasPeriodRealmName,
    this.idpPeriodName,
    this.syncPeriodHandlerName,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? jaasPeriodRanking;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodControlFlag;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodRealmName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? idpPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? syncPeriodHandlerName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties &&
    other.jaasPeriodRanking == jaasPeriodRanking &&
    other.jaasPeriodControlFlag == jaasPeriodControlFlag &&
    other.jaasPeriodRealmName == jaasPeriodRealmName &&
    other.idpPeriodName == idpPeriodName &&
    other.syncPeriodHandlerName == syncPeriodHandlerName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jaasPeriodRanking == null ? 0 : jaasPeriodRanking!.hashCode) +
    (jaasPeriodControlFlag == null ? 0 : jaasPeriodControlFlag!.hashCode) +
    (jaasPeriodRealmName == null ? 0 : jaasPeriodRealmName!.hashCode) +
    (idpPeriodName == null ? 0 : idpPeriodName!.hashCode) +
    (syncPeriodHandlerName == null ? 0 : syncPeriodHandlerName!.hashCode);

  @override
  String toString() => 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties[jaasPeriodRanking=$jaasPeriodRanking, jaasPeriodControlFlag=$jaasPeriodControlFlag, jaasPeriodRealmName=$jaasPeriodRealmName, idpPeriodName=$idpPeriodName, syncPeriodHandlerName=$syncPeriodHandlerName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jaasPeriodRanking != null) {
      json[r'jaas.ranking'] = this.jaasPeriodRanking;
    } else {
      json[r'jaas.ranking'] = null;
    }
    if (this.jaasPeriodControlFlag != null) {
      json[r'jaas.controlFlag'] = this.jaasPeriodControlFlag;
    } else {
      json[r'jaas.controlFlag'] = null;
    }
    if (this.jaasPeriodRealmName != null) {
      json[r'jaas.realmName'] = this.jaasPeriodRealmName;
    } else {
      json[r'jaas.realmName'] = null;
    }
    if (this.idpPeriodName != null) {
      json[r'idp.name'] = this.idpPeriodName;
    } else {
      json[r'idp.name'] = null;
    }
    if (this.syncPeriodHandlerName != null) {
      json[r'sync.handlerName'] = this.syncPeriodHandlerName;
    } else {
      json[r'sync.handlerName'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
        jaasPeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'jaas.ranking']),
        jaasPeriodControlFlag: ConfigNodePropertyString.fromJson(json[r'jaas.controlFlag']),
        jaasPeriodRealmName: ConfigNodePropertyString.fromJson(json[r'jaas.realmName']),
        idpPeriodName: ConfigNodePropertyString.fromJson(json[r'idp.name']),
        syncPeriodHandlerName: ConfigNodePropertyString.fromJson(json[r'sync.handlerName']),
      );
    }
    return null;
  }

  static List<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties-objects as value to a dart map
  static Map<String, List<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

