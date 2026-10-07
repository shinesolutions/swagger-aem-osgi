//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqWcmCoreImplServletsThumbnailServletProperties {
  /// Returns a new [ComDayCqWcmCoreImplServletsThumbnailServletProperties] instance.
  ComDayCqWcmCoreImplServletsThumbnailServletProperties({
    this.workspace,
    this.dimensions,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? workspace;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? dimensions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqWcmCoreImplServletsThumbnailServletProperties &&
    other.workspace == workspace &&
    other.dimensions == dimensions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (workspace == null ? 0 : workspace!.hashCode) +
    (dimensions == null ? 0 : dimensions!.hashCode);

  @override
  String toString() => 'ComDayCqWcmCoreImplServletsThumbnailServletProperties[workspace=$workspace, dimensions=$dimensions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.workspace != null) {
      json[r'workspace'] = this.workspace;
    } else {
      json[r'workspace'] = null;
    }
    if (this.dimensions != null) {
      json[r'dimensions'] = this.dimensions;
    } else {
      json[r'dimensions'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqWcmCoreImplServletsThumbnailServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqWcmCoreImplServletsThumbnailServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqWcmCoreImplServletsThumbnailServletProperties(
        workspace: ConfigNodePropertyString.fromJson(json[r'workspace']),
        dimensions: ConfigNodePropertyArray.fromJson(json[r'dimensions']),
      );
    }
    return null;
  }

  static List<ComDayCqWcmCoreImplServletsThumbnailServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqWcmCoreImplServletsThumbnailServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqWcmCoreImplServletsThumbnailServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqWcmCoreImplServletsThumbnailServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqWcmCoreImplServletsThumbnailServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqWcmCoreImplServletsThumbnailServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqWcmCoreImplServletsThumbnailServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqWcmCoreImplServletsThumbnailServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqWcmCoreImplServletsThumbnailServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqWcmCoreImplServletsThumbnailServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

