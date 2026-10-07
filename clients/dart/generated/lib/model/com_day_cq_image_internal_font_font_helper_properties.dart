//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqImageInternalFontFontHelperProperties {
  /// Returns a new [ComDayCqImageInternalFontFontHelperProperties] instance.
  ComDayCqImageInternalFontFontHelperProperties({
    this.fontpath,
    this.oversamplingFactor,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? fontpath;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? oversamplingFactor;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqImageInternalFontFontHelperProperties &&
    other.fontpath == fontpath &&
    other.oversamplingFactor == oversamplingFactor;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fontpath == null ? 0 : fontpath!.hashCode) +
    (oversamplingFactor == null ? 0 : oversamplingFactor!.hashCode);

  @override
  String toString() => 'ComDayCqImageInternalFontFontHelperProperties[fontpath=$fontpath, oversamplingFactor=$oversamplingFactor]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.fontpath != null) {
      json[r'fontpath'] = this.fontpath;
    } else {
      json[r'fontpath'] = null;
    }
    if (this.oversamplingFactor != null) {
      json[r'oversamplingFactor'] = this.oversamplingFactor;
    } else {
      json[r'oversamplingFactor'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqImageInternalFontFontHelperProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqImageInternalFontFontHelperProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqImageInternalFontFontHelperProperties(
        fontpath: ConfigNodePropertyArray.fromJson(json[r'fontpath']),
        oversamplingFactor: ConfigNodePropertyInteger.fromJson(json[r'oversamplingFactor']),
      );
    }
    return null;
  }

  static List<ComDayCqImageInternalFontFontHelperProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqImageInternalFontFontHelperProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqImageInternalFontFontHelperProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqImageInternalFontFontHelperProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqImageInternalFontFontHelperProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqImageInternalFontFontHelperProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqImageInternalFontFontHelperProperties-objects as value to a dart map
  static Map<String, List<ComDayCqImageInternalFontFontHelperProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqImageInternalFontFontHelperProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqImageInternalFontFontHelperProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

