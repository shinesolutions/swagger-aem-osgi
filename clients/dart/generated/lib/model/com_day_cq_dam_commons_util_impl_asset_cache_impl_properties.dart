//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCommonsUtilImplAssetCacheImplProperties {
  /// Returns a new [ComDayCqDamCommonsUtilImplAssetCacheImplProperties] instance.
  ComDayCqDamCommonsUtilImplAssetCacheImplProperties({
    this.largePeriodFilePeriodMin,
    this.cachePeriodApply,
    this.mimePeriodTypes,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? largePeriodFilePeriodMin;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyBoolean? cachePeriodApply;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? mimePeriodTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCommonsUtilImplAssetCacheImplProperties &&
    other.largePeriodFilePeriodMin == largePeriodFilePeriodMin &&
    other.cachePeriodApply == cachePeriodApply &&
    other.mimePeriodTypes == mimePeriodTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (largePeriodFilePeriodMin == null ? 0 : largePeriodFilePeriodMin!.hashCode) +
    (cachePeriodApply == null ? 0 : cachePeriodApply!.hashCode) +
    (mimePeriodTypes == null ? 0 : mimePeriodTypes!.hashCode);

  @override
  String toString() => 'ComDayCqDamCommonsUtilImplAssetCacheImplProperties[largePeriodFilePeriodMin=$largePeriodFilePeriodMin, cachePeriodApply=$cachePeriodApply, mimePeriodTypes=$mimePeriodTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.largePeriodFilePeriodMin != null) {
      json[r'large.file.min'] = this.largePeriodFilePeriodMin;
    } else {
      json[r'large.file.min'] = null;
    }
    if (this.cachePeriodApply != null) {
      json[r'cache.apply'] = this.cachePeriodApply;
    } else {
      json[r'cache.apply'] = null;
    }
    if (this.mimePeriodTypes != null) {
      json[r'mime.types'] = this.mimePeriodTypes;
    } else {
      json[r'mime.types'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCommonsUtilImplAssetCacheImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCommonsUtilImplAssetCacheImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCommonsUtilImplAssetCacheImplProperties(
        largePeriodFilePeriodMin: ConfigNodePropertyInteger.fromJson(json[r'large.file.min']),
        cachePeriodApply: ConfigNodePropertyBoolean.fromJson(json[r'cache.apply']),
        mimePeriodTypes: ConfigNodePropertyArray.fromJson(json[r'mime.types']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCommonsUtilImplAssetCacheImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCommonsUtilImplAssetCacheImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCommonsUtilImplAssetCacheImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCommonsUtilImplAssetCacheImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCommonsUtilImplAssetCacheImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCommonsUtilImplAssetCacheImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCommonsUtilImplAssetCacheImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCommonsUtilImplAssetCacheImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCommonsUtilImplAssetCacheImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCommonsUtilImplAssetCacheImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

