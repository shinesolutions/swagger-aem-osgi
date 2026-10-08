//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamHandlerStandardPsdPsdHandlerProperties {
  /// Returns a new [ComDayCqDamHandlerStandardPsdPsdHandlerProperties] instance.
  ComDayCqDamHandlerStandardPsdPsdHandlerProperties({
    this.largeFileThreshold,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largeFileThreshold;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamHandlerStandardPsdPsdHandlerProperties &&
    other.largeFileThreshold == largeFileThreshold;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (largeFileThreshold == null ? 0 : largeFileThreshold!.hashCode);

  @override
  String toString() => 'ComDayCqDamHandlerStandardPsdPsdHandlerProperties[largeFileThreshold=$largeFileThreshold]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.largeFileThreshold != null) {
      json[r'large_file_threshold'] = this.largeFileThreshold;
    } else {
      json[r'large_file_threshold'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamHandlerStandardPsdPsdHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamHandlerStandardPsdPsdHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamHandlerStandardPsdPsdHandlerProperties(
        largeFileThreshold: ConfigNodePropertyInteger.fromJson(json[r'large_file_threshold']),
      );
    }
    return null;
  }

  static List<ComDayCqDamHandlerStandardPsdPsdHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamHandlerStandardPsdPsdHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamHandlerStandardPsdPsdHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamHandlerStandardPsdPsdHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamHandlerStandardPsdPsdHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamHandlerStandardPsdPsdHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamHandlerStandardPsdPsdHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamHandlerStandardPsdPsdHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamHandlerStandardPsdPsdHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamHandlerStandardPsdPsdHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

