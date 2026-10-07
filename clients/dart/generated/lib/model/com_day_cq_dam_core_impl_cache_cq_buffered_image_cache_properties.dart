//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties {
  /// Returns a new [ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties] instance.
  ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties({
    this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory,
    this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge,
    this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyString? cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties &&
    other.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory == cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory &&
    other.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge == cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge &&
    other.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension == cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory == null ? 0 : cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory!.hashCode) +
    (cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge == null ? 0 : cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge!.hashCode) +
    (cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension == null ? 0 : cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties[cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory=$cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory, cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge=$cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge, cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension=$cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory != null) {
      json[r'cq.dam.image.cache.max.memory'] = this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory;
    } else {
      json[r'cq.dam.image.cache.max.memory'] = null;
    }
    if (this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge != null) {
      json[r'cq.dam.image.cache.max.age'] = this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge;
    } else {
      json[r'cq.dam.image.cache.max.age'] = null;
    }
    if (this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension != null) {
      json[r'cq.dam.image.cache.max.dimension'] = this.cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension;
    } else {
      json[r'cq.dam.image.cache.max.dimension'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties(
        cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodMemory: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.image.cache.max.memory']),
        cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodAge: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.image.cache.max.age']),
        cqPeriodDamPeriodImagePeriodCachePeriodMaxPeriodDimension: ConfigNodePropertyString.fromJson(json[r'cq.dam.image.cache.max.dimension']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

