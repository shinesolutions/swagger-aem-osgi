//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeGraniteCompatrouterImplRoutingConfigProperties {
  /// Returns a new [ComAdobeGraniteCompatrouterImplRoutingConfigProperties] instance.
  ComAdobeGraniteCompatrouterImplRoutingConfigProperties({
    this.id,
    this.compatPath,
    this.newPath,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? compatPath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? newPath;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeGraniteCompatrouterImplRoutingConfigProperties &&
    other.id == id &&
    other.compatPath == compatPath &&
    other.newPath == newPath;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (compatPath == null ? 0 : compatPath!.hashCode) +
    (newPath == null ? 0 : newPath!.hashCode);

  @override
  String toString() => 'ComAdobeGraniteCompatrouterImplRoutingConfigProperties[id=$id, compatPath=$compatPath, newPath=$newPath]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.compatPath != null) {
      json[r'compatPath'] = this.compatPath;
    } else {
      json[r'compatPath'] = null;
    }
    if (this.newPath != null) {
      json[r'newPath'] = this.newPath;
    } else {
      json[r'newPath'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeGraniteCompatrouterImplRoutingConfigProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeGraniteCompatrouterImplRoutingConfigProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeGraniteCompatrouterImplRoutingConfigProperties(
        id: ConfigNodePropertyString.fromJson(json[r'id']),
        compatPath: ConfigNodePropertyString.fromJson(json[r'compatPath']),
        newPath: ConfigNodePropertyString.fromJson(json[r'newPath']),
      );
    }
    return null;
  }

  static List<ComAdobeGraniteCompatrouterImplRoutingConfigProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeGraniteCompatrouterImplRoutingConfigProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeGraniteCompatrouterImplRoutingConfigProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeGraniteCompatrouterImplRoutingConfigProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeGraniteCompatrouterImplRoutingConfigProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeGraniteCompatrouterImplRoutingConfigProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeGraniteCompatrouterImplRoutingConfigProperties-objects as value to a dart map
  static Map<String, List<ComAdobeGraniteCompatrouterImplRoutingConfigProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeGraniteCompatrouterImplRoutingConfigProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeGraniteCompatrouterImplRoutingConfigProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

