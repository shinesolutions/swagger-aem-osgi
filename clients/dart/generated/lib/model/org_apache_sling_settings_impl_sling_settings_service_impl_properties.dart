//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
  /// Returns a new [OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties] instance.
  OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties({
    this.slingPeriodName,
    this.slingPeriodDescription,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodName;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? slingPeriodDescription;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties &&
    other.slingPeriodName == slingPeriodName &&
    other.slingPeriodDescription == slingPeriodDescription;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (slingPeriodName == null ? 0 : slingPeriodName!.hashCode) +
    (slingPeriodDescription == null ? 0 : slingPeriodDescription!.hashCode);

  @override
  String toString() => 'OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties[slingPeriodName=$slingPeriodName, slingPeriodDescription=$slingPeriodDescription]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.slingPeriodName != null) {
      json[r'sling.name'] = this.slingPeriodName;
    } else {
      json[r'sling.name'] = null;
    }
    if (this.slingPeriodDescription != null) {
      json[r'sling.description'] = this.slingPeriodDescription;
    } else {
      json[r'sling.description'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties(
        slingPeriodName: ConfigNodePropertyString.fromJson(json[r'sling.name']),
        slingPeriodDescription: ConfigNodePropertyString.fromJson(json[r'sling.description']),
      );
    }
    return null;
  }

  static List<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties-objects as value to a dart map
  static Map<String, List<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

