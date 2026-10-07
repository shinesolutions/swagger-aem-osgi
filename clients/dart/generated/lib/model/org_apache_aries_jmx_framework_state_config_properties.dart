//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheAriesJmxFrameworkStateConfigProperties {
  /// Returns a new [OrgApacheAriesJmxFrameworkStateConfigProperties] instance.
  OrgApacheAriesJmxFrameworkStateConfigProperties({
    this.attributeChangeNotificationEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? attributeChangeNotificationEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheAriesJmxFrameworkStateConfigProperties &&
    other.attributeChangeNotificationEnabled == attributeChangeNotificationEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributeChangeNotificationEnabled == null ? 0 : attributeChangeNotificationEnabled!.hashCode);

  @override
  String toString() => 'OrgApacheAriesJmxFrameworkStateConfigProperties[attributeChangeNotificationEnabled=$attributeChangeNotificationEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributeChangeNotificationEnabled != null) {
      json[r'attributeChangeNotificationEnabled'] = this.attributeChangeNotificationEnabled;
    } else {
      json[r'attributeChangeNotificationEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheAriesJmxFrameworkStateConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheAriesJmxFrameworkStateConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheAriesJmxFrameworkStateConfigProperties(
        attributeChangeNotificationEnabled: ConfigNodePropertyBoolean.fromJson(json[r'attributeChangeNotificationEnabled']),
      );
    }
    return null;
  }

  static List<OrgApacheAriesJmxFrameworkStateConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheAriesJmxFrameworkStateConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheAriesJmxFrameworkStateConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheAriesJmxFrameworkStateConfigProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheAriesJmxFrameworkStateConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheAriesJmxFrameworkStateConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheAriesJmxFrameworkStateConfigProperties-objects as value to a dart map
  static Map<String, List<OrgApacheAriesJmxFrameworkStateConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheAriesJmxFrameworkStateConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheAriesJmxFrameworkStateConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

