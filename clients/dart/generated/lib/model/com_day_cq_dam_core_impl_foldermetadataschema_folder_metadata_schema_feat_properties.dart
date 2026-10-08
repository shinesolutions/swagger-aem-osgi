//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties {
  /// Returns a new [ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties] instance.
  ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties({
    this.isEnabled,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? isEnabled;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties &&
    other.isEnabled == isEnabled;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (isEnabled == null ? 0 : isEnabled!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties[isEnabled=$isEnabled]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.isEnabled != null) {
      json[r'isEnabled'] = this.isEnabled;
    } else {
      json[r'isEnabled'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties(
        isEnabled: ConfigNodePropertyBoolean.fromJson(json[r'isEnabled']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

