//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingHapiImplHApiUtilImplProperties {
  /// Returns a new [OrgApacheSlingHapiImplHApiUtilImplProperties] instance.
  OrgApacheSlingHapiImplHApiUtilImplProperties({
    this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype,
    this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype,
    this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths,
    this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl,
    this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingHapiImplHApiUtilImplProperties &&
    other.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype == orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype &&
    other.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype == orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype &&
    other.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths == orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths &&
    other.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl == orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl &&
    other.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled == orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype == null ? 0 : orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype == null ? 0 : orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths == null ? 0 : orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl == null ? 0 : orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled == null ? 0 : orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled!.hashCode);

  @override
  String toString() => 'OrgApacheSlingHapiImplHApiUtilImplProperties[orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype=$orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype, orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype=$orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype, orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths=$orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths, orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl=$orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl, orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled=$orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype != null) {
      json[r'org.apache.sling.hapi.tools.resourcetype'] = this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype;
    } else {
      json[r'org.apache.sling.hapi.tools.resourcetype'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype != null) {
      json[r'org.apache.sling.hapi.tools.collectionresourcetype'] = this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype;
    } else {
      json[r'org.apache.sling.hapi.tools.collectionresourcetype'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths != null) {
      json[r'org.apache.sling.hapi.tools.searchpaths'] = this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths;
    } else {
      json[r'org.apache.sling.hapi.tools.searchpaths'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl != null) {
      json[r'org.apache.sling.hapi.tools.externalurl'] = this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl;
    } else {
      json[r'org.apache.sling.hapi.tools.externalurl'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled != null) {
      json[r'org.apache.sling.hapi.tools.enabled'] = this.orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled;
    } else {
      json[r'org.apache.sling.hapi.tools.enabled'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingHapiImplHApiUtilImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingHapiImplHApiUtilImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingHapiImplHApiUtilImplProperties(
        orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodResourcetype: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.hapi.tools.resourcetype']),
        orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodCollectionresourcetype: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.hapi.tools.collectionresourcetype']),
        orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodSearchpaths: ConfigNodePropertyArray.fromJson(json[r'org.apache.sling.hapi.tools.searchpaths']),
        orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodExternalurl: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.hapi.tools.externalurl']),
        orgPeriodApachePeriodSlingPeriodHapiPeriodToolsPeriodEnabled: ConfigNodePropertyBoolean.fromJson(json[r'org.apache.sling.hapi.tools.enabled']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingHapiImplHApiUtilImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingHapiImplHApiUtilImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingHapiImplHApiUtilImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingHapiImplHApiUtilImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingHapiImplHApiUtilImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingHapiImplHApiUtilImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingHapiImplHApiUtilImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingHapiImplHApiUtilImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingHapiImplHApiUtilImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingHapiImplHApiUtilImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

