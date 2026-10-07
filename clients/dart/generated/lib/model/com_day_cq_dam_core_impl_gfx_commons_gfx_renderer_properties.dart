//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {
  /// Returns a new [ComDayCqDamCoreImplGfxCommonsGfxRendererProperties] instance.
  ComDayCqDamCoreImplGfxCommonsGfxRendererProperties({
    this.skipPeriodBufferedcache,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? skipPeriodBufferedcache;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplGfxCommonsGfxRendererProperties &&
    other.skipPeriodBufferedcache == skipPeriodBufferedcache;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (skipPeriodBufferedcache == null ? 0 : skipPeriodBufferedcache!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplGfxCommonsGfxRendererProperties[skipPeriodBufferedcache=$skipPeriodBufferedcache]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.skipPeriodBufferedcache != null) {
      json[r'skip.bufferedcache'] = this.skipPeriodBufferedcache;
    } else {
      json[r'skip.bufferedcache'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplGfxCommonsGfxRendererProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplGfxCommonsGfxRendererProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(
        skipPeriodBufferedcache: ConfigNodePropertyBoolean.fromJson(json[r'skip.bufferedcache']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplGfxCommonsGfxRendererProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplGfxCommonsGfxRendererProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplGfxCommonsGfxRendererProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplGfxCommonsGfxRendererProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplGfxCommonsGfxRendererProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

