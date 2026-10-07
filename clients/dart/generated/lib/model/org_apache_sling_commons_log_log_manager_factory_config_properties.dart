//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
  /// Returns a new [OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties] instance.
  OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties({
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames,
    this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames &&
    other.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv == orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames!.hashCode) +
    (orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv == null ? 0 : orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv!.hashCode);

  @override
  String toString() => 'OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties[orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames, orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv=$orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel != null) {
      json[r'org.apache.sling.commons.log.level'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel;
    } else {
      json[r'org.apache.sling.commons.log.level'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile != null) {
      json[r'org.apache.sling.commons.log.file'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile;
    } else {
      json[r'org.apache.sling.commons.log.file'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern != null) {
      json[r'org.apache.sling.commons.log.pattern'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern;
    } else {
      json[r'org.apache.sling.commons.log.pattern'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames != null) {
      json[r'org.apache.sling.commons.log.names'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames;
    } else {
      json[r'org.apache.sling.commons.log.names'] = null;
    }
    if (this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv != null) {
      json[r'org.apache.sling.commons.log.additiv'] = this.orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv;
    } else {
      json[r'org.apache.sling.commons.log.additiv'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodLevel: ConfigNodePropertyDropDown.fromJson(json[r'org.apache.sling.commons.log.level']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodFile: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.commons.log.file']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodPattern: ConfigNodePropertyString.fromJson(json[r'org.apache.sling.commons.log.pattern']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodNames: ConfigNodePropertyArray.fromJson(json[r'org.apache.sling.commons.log.names']),
        orgPeriodApachePeriodSlingPeriodCommonsPeriodLogPeriodAdditiv: ConfigNodePropertyBoolean.fromJson(json[r'org.apache.sling.commons.log.additiv']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

