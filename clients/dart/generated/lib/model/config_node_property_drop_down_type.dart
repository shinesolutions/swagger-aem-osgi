//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConfigNodePropertyDropDownType {
  /// Returns a new [ConfigNodePropertyDropDownType] instance.
  ConfigNodePropertyDropDownType({
    this.labels,
    this.values,
  });

  /// Drop Down label
  Object? labels;

  /// Drown Down value
  Object? values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConfigNodePropertyDropDownType &&
    other.labels == labels &&
    other.values == values;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (labels == null ? 0 : labels!.hashCode) +
    (values == null ? 0 : values!.hashCode);

  @override
  String toString() => 'ConfigNodePropertyDropDownType[labels=$labels, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.labels != null) {
      json[r'labels'] = this.labels;
    } else {
      json[r'labels'] = null;
    }
    if (this.values != null) {
      json[r'values'] = this.values;
    } else {
      json[r'values'] = null;
    }
    return json;
  }

  /// Returns a new [ConfigNodePropertyDropDownType] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConfigNodePropertyDropDownType? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ConfigNodePropertyDropDownType(
        labels: mapValueOfType<Object>(json, r'labels'),
        values: mapValueOfType<Object>(json, r'values'),
      );
    }
    return null;
  }

  static List<ConfigNodePropertyDropDownType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConfigNodePropertyDropDownType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConfigNodePropertyDropDownType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConfigNodePropertyDropDownType> mapFromJson(dynamic json) {
    final map = <String, ConfigNodePropertyDropDownType>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConfigNodePropertyDropDownType.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConfigNodePropertyDropDownType-objects as value to a dart map
  static Map<String, List<ConfigNodePropertyDropDownType>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConfigNodePropertyDropDownType>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConfigNodePropertyDropDownType.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

