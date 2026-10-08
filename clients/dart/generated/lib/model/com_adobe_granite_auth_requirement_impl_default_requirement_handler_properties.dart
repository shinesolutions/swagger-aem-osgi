//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
  /// Returns a new [ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] instance.
  ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties({
    this.supportedPaths,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? supportedPaths;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties &&
    other.supportedPaths == supportedPaths;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (supportedPaths == null ? 0 : supportedPaths!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties[supportedPaths=$supportedPaths]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.supportedPaths != null) {
      json[r'supportedPaths'] = this.supportedPaths;
    } else {
      json[r'supportedPaths'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties(
        supportedPaths: ConfigNodePropertyArray.fromJson(json[r'supportedPaths']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

