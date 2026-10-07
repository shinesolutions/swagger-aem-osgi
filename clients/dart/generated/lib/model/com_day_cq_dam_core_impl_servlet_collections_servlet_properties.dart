//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletCollectionsServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletCollectionsServletProperties] instance.
  ComDayCqDamCoreImplServletCollectionsServletProperties({
    this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties,
    this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletCollectionsServletProperties &&
    other.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties == cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties &&
    other.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit == cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties == null ? 0 : cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties!.hashCode) +
    (cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit == null ? 0 : cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletCollectionsServletProperties[cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties=$cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties, cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit=$cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties != null) {
      json[r'cq.dam.batch.collections.properties'] = this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties;
    } else {
      json[r'cq.dam.batch.collections.properties'] = null;
    }
    if (this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit != null) {
      json[r'cq.dam.batch.collections.limit'] = this.cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit;
    } else {
      json[r'cq.dam.batch.collections.limit'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletCollectionsServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletCollectionsServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletCollectionsServletProperties(
        cqPeriodDamPeriodBatchPeriodCollectionsPeriodProperties: ConfigNodePropertyArray.fromJson(json[r'cq.dam.batch.collections.properties']),
        cqPeriodDamPeriodBatchPeriodCollectionsPeriodLimit: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.batch.collections.limit']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletCollectionsServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletCollectionsServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletCollectionsServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletCollectionsServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletCollectionsServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletCollectionsServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletCollectionsServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletCollectionsServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletCollectionsServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletCollectionsServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

