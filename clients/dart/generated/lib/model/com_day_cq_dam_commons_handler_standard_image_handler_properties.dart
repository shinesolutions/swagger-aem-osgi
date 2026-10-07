//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
  /// Returns a new [ComDayCqDamCommonsHandlerStandardImageHandlerProperties] instance.
  ComDayCqDamCommonsHandlerStandardImageHandlerProperties({
    this.largeFileThreshold,
    this.largeCommentThreshold,
    this.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largeFileThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largeCommentThreshold;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCommonsHandlerStandardImageHandlerProperties &&
    other.largeFileThreshold == largeFileThreshold &&
    other.largeCommentThreshold == largeCommentThreshold &&
    other.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction == cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (largeFileThreshold == null ? 0 : largeFileThreshold!.hashCode) +
    (largeCommentThreshold == null ? 0 : largeCommentThreshold!.hashCode) +
    (cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction == null ? 0 : cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction!.hashCode);

  @override
  String toString() => 'ComDayCqDamCommonsHandlerStandardImageHandlerProperties[largeFileThreshold=$largeFileThreshold, largeCommentThreshold=$largeCommentThreshold, cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction=$cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.largeFileThreshold != null) {
      json[r'large_file_threshold'] = this.largeFileThreshold;
    } else {
      json[r'large_file_threshold'] = null;
    }
    if (this.largeCommentThreshold != null) {
      json[r'large_comment_threshold'] = this.largeCommentThreshold;
    } else {
      json[r'large_comment_threshold'] = null;
    }
    if (this.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction != null) {
      json[r'cq.dam.enable.ext.meta.extraction'] = this.cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction;
    } else {
      json[r'cq.dam.enable.ext.meta.extraction'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCommonsHandlerStandardImageHandlerProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCommonsHandlerStandardImageHandlerProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCommonsHandlerStandardImageHandlerProperties(
        largeFileThreshold: ConfigNodePropertyInteger.fromJson(json[r'large_file_threshold']),
        largeCommentThreshold: ConfigNodePropertyInteger.fromJson(json[r'large_comment_threshold']),
        cqPeriodDamPeriodEnablePeriodExtPeriodMetaPeriodExtraction: ConfigNodePropertyBoolean.fromJson(json[r'cq.dam.enable.ext.meta.extraction']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCommonsHandlerStandardImageHandlerProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCommonsHandlerStandardImageHandlerProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCommonsHandlerStandardImageHandlerProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCommonsHandlerStandardImageHandlerProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCommonsHandlerStandardImageHandlerProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCommonsHandlerStandardImageHandlerProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCommonsHandlerStandardImageHandlerProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCommonsHandlerStandardImageHandlerProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCommonsHandlerStandardImageHandlerProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCommonsHandlerStandardImageHandlerProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

