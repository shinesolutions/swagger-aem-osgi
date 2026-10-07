//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixSystemreadyImplServicesCheckProperties {
  /// Returns a new [OrgApacheFelixSystemreadyImplServicesCheckProperties] instance.
  OrgApacheFelixSystemreadyImplServicesCheckProperties({
    this.servicesPeriodList,
    this.type,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? servicesPeriodList;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyDropDown? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixSystemreadyImplServicesCheckProperties &&
    other.servicesPeriodList == servicesPeriodList &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (servicesPeriodList == null ? 0 : servicesPeriodList!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'OrgApacheFelixSystemreadyImplServicesCheckProperties[servicesPeriodList=$servicesPeriodList, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.servicesPeriodList != null) {
      json[r'services.list'] = this.servicesPeriodList;
    } else {
      json[r'services.list'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixSystemreadyImplServicesCheckProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixSystemreadyImplServicesCheckProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixSystemreadyImplServicesCheckProperties(
        servicesPeriodList: ConfigNodePropertyArray.fromJson(json[r'services.list']),
        type: ConfigNodePropertyDropDown.fromJson(json[r'type']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixSystemreadyImplServicesCheckProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixSystemreadyImplServicesCheckProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixSystemreadyImplServicesCheckProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixSystemreadyImplServicesCheckProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixSystemreadyImplServicesCheckProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixSystemreadyImplServicesCheckProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixSystemreadyImplServicesCheckProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixSystemreadyImplServicesCheckProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixSystemreadyImplServicesCheckProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixSystemreadyImplServicesCheckProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

