//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixJaasConfigurationFactoryProperties {
  /// Returns a new [OrgApacheFelixJaasConfigurationFactoryProperties] instance.
  OrgApacheFelixJaasConfigurationFactoryProperties({
    this.jaasPeriodControlFlag,
    this.jaasPeriodRanking,
    this.jaasPeriodRealmName,
    this.jaasPeriodClassname,
    this.jaasPeriodOptions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? jaasPeriodControlFlag;

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
  ConfigNodePropertyString? jaasPeriodRealmName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? jaasPeriodClassname;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? jaasPeriodOptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixJaasConfigurationFactoryProperties &&
    other.jaasPeriodControlFlag == jaasPeriodControlFlag &&
    other.jaasPeriodRanking == jaasPeriodRanking &&
    other.jaasPeriodRealmName == jaasPeriodRealmName &&
    other.jaasPeriodClassname == jaasPeriodClassname &&
    other.jaasPeriodOptions == jaasPeriodOptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (jaasPeriodControlFlag == null ? 0 : jaasPeriodControlFlag!.hashCode) +
    (jaasPeriodRanking == null ? 0 : jaasPeriodRanking!.hashCode) +
    (jaasPeriodRealmName == null ? 0 : jaasPeriodRealmName!.hashCode) +
    (jaasPeriodClassname == null ? 0 : jaasPeriodClassname!.hashCode) +
    (jaasPeriodOptions == null ? 0 : jaasPeriodOptions!.hashCode);

  @override
  String toString() => 'OrgApacheFelixJaasConfigurationFactoryProperties[jaasPeriodControlFlag=$jaasPeriodControlFlag, jaasPeriodRanking=$jaasPeriodRanking, jaasPeriodRealmName=$jaasPeriodRealmName, jaasPeriodClassname=$jaasPeriodClassname, jaasPeriodOptions=$jaasPeriodOptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.jaasPeriodControlFlag != null) {
      json[r'jaas.controlFlag'] = this.jaasPeriodControlFlag;
    } else {
      json[r'jaas.controlFlag'] = null;
    }
    if (this.jaasPeriodRanking != null) {
      json[r'jaas.ranking'] = this.jaasPeriodRanking;
    } else {
      json[r'jaas.ranking'] = null;
    }
    if (this.jaasPeriodRealmName != null) {
      json[r'jaas.realmName'] = this.jaasPeriodRealmName;
    } else {
      json[r'jaas.realmName'] = null;
    }
    if (this.jaasPeriodClassname != null) {
      json[r'jaas.classname'] = this.jaasPeriodClassname;
    } else {
      json[r'jaas.classname'] = null;
    }
    if (this.jaasPeriodOptions != null) {
      json[r'jaas.options'] = this.jaasPeriodOptions;
    } else {
      json[r'jaas.options'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixJaasConfigurationFactoryProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixJaasConfigurationFactoryProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixJaasConfigurationFactoryProperties(
        jaasPeriodControlFlag: ConfigNodePropertyDropDown.fromJson(json[r'jaas.controlFlag']),
        jaasPeriodRanking: ConfigNodePropertyInteger.fromJson(json[r'jaas.ranking']),
        jaasPeriodRealmName: ConfigNodePropertyString.fromJson(json[r'jaas.realmName']),
        jaasPeriodClassname: ConfigNodePropertyString.fromJson(json[r'jaas.classname']),
        jaasPeriodOptions: ConfigNodePropertyArray.fromJson(json[r'jaas.options']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixJaasConfigurationFactoryProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixJaasConfigurationFactoryProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixJaasConfigurationFactoryProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixJaasConfigurationFactoryProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixJaasConfigurationFactoryProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixJaasConfigurationFactoryProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixJaasConfigurationFactoryProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixJaasConfigurationFactoryProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixJaasConfigurationFactoryProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixJaasConfigurationFactoryProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

