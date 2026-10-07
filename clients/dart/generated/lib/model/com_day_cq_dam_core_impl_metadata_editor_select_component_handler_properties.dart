//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties {
  /// Returns a new [ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties] instance.
  ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties({
    this.graniteColonData,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? graniteColonData;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties &&
    other.graniteColonData == graniteColonData;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (graniteColonData == null ? 0 : graniteColonData!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties[graniteColonData=$graniteColonData]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.graniteColonData != null) {
      json[r'granite:data'] = this.graniteColonData;
    } else {
      json[r'granite:data'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties(
        graniteColonData: ConfigNodePropertyArray.fromJson(json[r'granite:data']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

