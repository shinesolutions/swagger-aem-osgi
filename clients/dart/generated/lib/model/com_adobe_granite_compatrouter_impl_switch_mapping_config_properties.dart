//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties {
  /// Returns a new [ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties] instance.
  ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties({
    this.group,
    this.ids,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? group;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? ids;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties &&
    other.group == group &&
    other.ids == ids;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (group == null ? 0 : group!.hashCode) +
    (ids == null ? 0 : ids!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties[group=$group, ids=$ids]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.group != null) {
      json[r'group'] = this.group;
    } else {
      json[r'group'] = null;
    }
    if (this.ids != null) {
      json[r'ids'] = this.ids;
    } else {
      json[r'ids'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties(
        group: ConfigNodePropertyString.fromJson(json[r'group']),
        ids: ConfigNodePropertyArray.fromJson(json[r'ids']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

