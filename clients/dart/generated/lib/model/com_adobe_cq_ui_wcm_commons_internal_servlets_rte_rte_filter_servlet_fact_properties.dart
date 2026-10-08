//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {
  /// Returns a new [ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties] instance.
  ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties({
    this.resourcePeriodTypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? resourcePeriodTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties &&
    other.resourcePeriodTypes == resourcePeriodTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (resourcePeriodTypes == null ? 0 : resourcePeriodTypes!.hashCode);

  @override
  String toString() => 'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties[resourcePeriodTypes=$resourcePeriodTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.resourcePeriodTypes != null) {
      json[r'resource.types'] = this.resourcePeriodTypes;
    } else {
      json[r'resource.types'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties(
        resourcePeriodTypes: ConfigNodePropertyArray.fromJson(json[r'resource.types']),
      );
    }
    return null;
  }

  static List<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

