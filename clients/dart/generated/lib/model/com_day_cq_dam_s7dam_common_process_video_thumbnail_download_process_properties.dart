//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties {
  /// Returns a new [ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties] instance.
  ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties({
    this.processPeriodLabel,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? processPeriodLabel;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties &&
    other.processPeriodLabel == processPeriodLabel;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (processPeriodLabel == null ? 0 : processPeriodLabel!.hashCode);

  @override
  String toString() => 'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties[processPeriodLabel=$processPeriodLabel]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.processPeriodLabel != null) {
      json[r'process.label'] = this.processPeriodLabel;
    } else {
      json[r'process.label'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties(
        processPeriodLabel: ConfigNodePropertyString.fromJson(json[r'process.label']),
      );
    }
    return null;
  }

  static List<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

