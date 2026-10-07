//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties {
  /// Returns a new [ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties] instance.
  ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties({
    this.createPreviewEnabled,
    this.updatePreviewEnabled,
    this.queueSize,
    this.folderPreviewRenditionRegex,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? createPreviewEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? updatePreviewEnabled;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? queueSize;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? folderPreviewRenditionRegex;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties &&
    other.createPreviewEnabled == createPreviewEnabled &&
    other.updatePreviewEnabled == updatePreviewEnabled &&
    other.queueSize == queueSize &&
    other.folderPreviewRenditionRegex == folderPreviewRenditionRegex;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createPreviewEnabled == null ? 0 : createPreviewEnabled!.hashCode) +
    (updatePreviewEnabled == null ? 0 : updatePreviewEnabled!.hashCode) +
    (queueSize == null ? 0 : queueSize!.hashCode) +
    (folderPreviewRenditionRegex == null ? 0 : folderPreviewRenditionRegex!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties[createPreviewEnabled=$createPreviewEnabled, updatePreviewEnabled=$updatePreviewEnabled, queueSize=$queueSize, folderPreviewRenditionRegex=$folderPreviewRenditionRegex]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.createPreviewEnabled != null) {
      json[r'createPreviewEnabled'] = this.createPreviewEnabled;
    } else {
      json[r'createPreviewEnabled'] = null;
    }
    if (this.updatePreviewEnabled != null) {
      json[r'updatePreviewEnabled'] = this.updatePreviewEnabled;
    } else {
      json[r'updatePreviewEnabled'] = null;
    }
    if (this.queueSize != null) {
      json[r'queueSize'] = this.queueSize;
    } else {
      json[r'queueSize'] = null;
    }
    if (this.folderPreviewRenditionRegex != null) {
      json[r'folderPreviewRenditionRegex'] = this.folderPreviewRenditionRegex;
    } else {
      json[r'folderPreviewRenditionRegex'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties(
        createPreviewEnabled: ConfigNodePropertyBoolean.fromJson(json[r'createPreviewEnabled']),
        updatePreviewEnabled: ConfigNodePropertyBoolean.fromJson(json[r'updatePreviewEnabled']),
        queueSize: ConfigNodePropertyInteger.fromJson(json[r'queueSize']),
        folderPreviewRenditionRegex: ConfigNodePropertyString.fromJson(json[r'folderPreviewRenditionRegex']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

