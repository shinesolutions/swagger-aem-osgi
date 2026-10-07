//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties {
  /// Returns a new [OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties] instance.
  OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties({
    this.maxPeriodSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxPeriodSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties &&
    other.maxPeriodSize == maxPeriodSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxPeriodSize == null ? 0 : maxPeriodSize!.hashCode);

  @override
  String toString() => 'OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties[maxPeriodSize=$maxPeriodSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxPeriodSize != null) {
      json[r'max.size'] = this.maxPeriodSize;
    } else {
      json[r'max.size'] = null;
    }
    return json;
  }

  /// Returns a new [OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties(
        maxPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'max.size']),
      );
    }
    return null;
  }

  static List<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties> mapFromJson(dynamic json) {
    final map = <String, OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties-objects as value to a dart map
  static Map<String, List<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

