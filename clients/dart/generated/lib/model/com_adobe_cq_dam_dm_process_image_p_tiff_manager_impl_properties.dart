//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {
  /// Returns a new [ComAdobeCqDamDmProcessImagePTiffManagerImplProperties] instance.
  ComAdobeCqDamDmProcessImagePTiffManagerImplProperties({
    this.maxMemory,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxMemory;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComAdobeCqDamDmProcessImagePTiffManagerImplProperties &&
    other.maxMemory == maxMemory;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxMemory == null ? 0 : maxMemory!.hashCode);

  @override
  String toString() => 'ComAdobeCqDamDmProcessImagePTiffManagerImplProperties[maxMemory=$maxMemory]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxMemory != null) {
      json[r'maxMemory'] = this.maxMemory;
    } else {
      json[r'maxMemory'] = null;
    }
    return json;
  }

  /// Returns a new [ComAdobeCqDamDmProcessImagePTiffManagerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComAdobeCqDamDmProcessImagePTiffManagerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComAdobeCqDamDmProcessImagePTiffManagerImplProperties(
        maxMemory: ConfigNodePropertyInteger.fromJson(json[r'maxMemory']),
      );
    }
    return null;
  }

  static List<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComAdobeCqDamDmProcessImagePTiffManagerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComAdobeCqDamDmProcessImagePTiffManagerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComAdobeCqDamDmProcessImagePTiffManagerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComAdobeCqDamDmProcessImagePTiffManagerImplProperties-objects as value to a dart map
  static Map<String, List<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComAdobeCqDamDmProcessImagePTiffManagerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComAdobeCqDamDmProcessImagePTiffManagerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

