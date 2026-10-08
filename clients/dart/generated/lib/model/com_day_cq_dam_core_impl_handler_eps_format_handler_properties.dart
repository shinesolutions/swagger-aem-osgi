//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties {
  /// Returns a new [ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties] instance.
  ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties({
    this.mimetype,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? mimetype;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties &&
    other.mimetype == mimetype;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mimetype == null ? 0 : mimetype!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties[mimetype=$mimetype]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.mimetype != null) {
      json[r'mimetype'] = this.mimetype;
    } else {
      json[r'mimetype'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(
        mimetype: ConfigNodePropertyString.fromJson(json[r'mimetype']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

