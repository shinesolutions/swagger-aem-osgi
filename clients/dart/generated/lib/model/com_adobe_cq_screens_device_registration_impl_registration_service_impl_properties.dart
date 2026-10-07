//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {
  /// Returns a new [ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties] instance.
  ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties({
    this.deviceRegistrationTimeout,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? deviceRegistrationTimeout;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties &&
    other.deviceRegistrationTimeout == deviceRegistrationTimeout;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deviceRegistrationTimeout == null ? 0 : deviceRegistrationTimeout!.hashCode);

  @override
  String toString() => 'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties[deviceRegistrationTimeout=$deviceRegistrationTimeout]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.deviceRegistrationTimeout != null) {
      json[r'deviceRegistrationTimeout'] = this.deviceRegistrationTimeout;
    } else {
      json[r'deviceRegistrationTimeout'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(
        deviceRegistrationTimeout: ConfigNodePropertyInteger.fromJson(json[r'deviceRegistrationTimeout']),
      );
    }
    return null;
  }

  static List<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

