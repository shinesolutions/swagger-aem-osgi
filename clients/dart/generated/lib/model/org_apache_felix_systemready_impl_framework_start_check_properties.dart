//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {
  /// Returns a new [OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties] instance.
  OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties({
    this.timeout,
    this.targetPeriodStartPeriodLevel,
    this.targetPeriodStartPeriodLevelPeriodPropPeriodName,
    this.type,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? timeout;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? targetPeriodStartPeriodLevel;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? targetPeriodStartPeriodLevelPeriodPropPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties &&
    other.timeout == timeout &&
    other.targetPeriodStartPeriodLevel == targetPeriodStartPeriodLevel &&
    other.targetPeriodStartPeriodLevelPeriodPropPeriodName == targetPeriodStartPeriodLevelPeriodPropPeriodName &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (timeout == null ? 0 : timeout!.hashCode) +
    (targetPeriodStartPeriodLevel == null ? 0 : targetPeriodStartPeriodLevel!.hashCode) +
    (targetPeriodStartPeriodLevelPeriodPropPeriodName == null ? 0 : targetPeriodStartPeriodLevelPeriodPropPeriodName!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties[timeout=$timeout, targetPeriodStartPeriodLevel=$targetPeriodStartPeriodLevel, targetPeriodStartPeriodLevelPeriodPropPeriodName=$targetPeriodStartPeriodLevelPeriodPropPeriodName, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.timeout != null) {
      json[r'timeout'] = this.timeout;
    } else {
      json[r'timeout'] = null;
    }
    if (this.targetPeriodStartPeriodLevel != null) {
      json[r'target.start.level'] = this.targetPeriodStartPeriodLevel;
    } else {
      json[r'target.start.level'] = null;
    }
    if (this.targetPeriodStartPeriodLevelPeriodPropPeriodName != null) {
      json[r'target.start.level.prop.name'] = this.targetPeriodStartPeriodLevelPeriodPropPeriodName;
    } else {
      json[r'target.start.level.prop.name'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties(
        timeout: ConfigNodePropertyInteger.fromJson(json[r'timeout']),
        targetPeriodStartPeriodLevel: ConfigNodePropertyInteger.fromJson(json[r'target.start.level']),
        targetPeriodStartPeriodLevelPeriodPropPeriodName: ConfigNodePropertyString.fromJson(json[r'target.start.level.prop.name']),
        type: ConfigNodePropertyDropDown.fromJson(json[r'type']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

