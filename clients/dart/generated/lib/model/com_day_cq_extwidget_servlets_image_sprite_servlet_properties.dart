//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqExtwidgetServletsImageSpriteServletProperties {
  /// Returns a new [ComDayCqExtwidgetServletsImageSpriteServletProperties] instance.
  ComDayCqExtwidgetServletsImageSpriteServletProperties({
    this.maxWidth,
    this.maxHeight,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxWidth;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? maxHeight;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqExtwidgetServletsImageSpriteServletProperties &&
    other.maxWidth == maxWidth &&
    other.maxHeight == maxHeight;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxWidth == null ? 0 : maxWidth!.hashCode) +
    (maxHeight == null ? 0 : maxHeight!.hashCode);

  @override
  String toString() => 'ComDayCqExtwidgetServletsImageSpriteServletProperties[maxWidth=$maxWidth, maxHeight=$maxHeight]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxWidth != null) {
      json[r'maxWidth'] = this.maxWidth;
    } else {
      json[r'maxWidth'] = null;
    }
    if (this.maxHeight != null) {
      json[r'maxHeight'] = this.maxHeight;
    } else {
      json[r'maxHeight'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqExtwidgetServletsImageSpriteServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqExtwidgetServletsImageSpriteServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqExtwidgetServletsImageSpriteServletProperties(
        maxWidth: ConfigNodePropertyInteger.fromJson(json[r'maxWidth']),
        maxHeight: ConfigNodePropertyInteger.fromJson(json[r'maxHeight']),
      );
    }
    return null;
  }

  static List<ComDayCqExtwidgetServletsImageSpriteServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqExtwidgetServletsImageSpriteServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqExtwidgetServletsImageSpriteServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqExtwidgetServletsImageSpriteServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqExtwidgetServletsImageSpriteServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqExtwidgetServletsImageSpriteServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqExtwidgetServletsImageSpriteServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqExtwidgetServletsImageSpriteServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqExtwidgetServletsImageSpriteServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqExtwidgetServletsImageSpriteServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

