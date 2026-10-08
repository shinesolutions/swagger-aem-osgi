//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletCollectionServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletCollectionServletProperties] instance.
  ComDayCqDamCoreImplServletCollectionServletProperties({
    this.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties,
    this.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletCollectionServletProperties &&
    other.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties == cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties &&
    other.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections == cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties == null ? 0 : cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties!.hashCode) +
    (cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections == null ? 0 : cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletCollectionServletProperties[cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties=$cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties, cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections=$cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties != null) {
      json[r'cq.dam.batch.collection.properties'] = this.cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties;
    } else {
      json[r'cq.dam.batch.collection.properties'] = null;
    }
    if (this.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections != null) {
      json[r'cq.dam.batch.collection.maxcollections'] = this.cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections;
    } else {
      json[r'cq.dam.batch.collection.maxcollections'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletCollectionServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletCollectionServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletCollectionServletProperties(
        cqPeriodDamPeriodBatchPeriodCollectionPeriodProperties: ConfigNodePropertyArray.fromJson(json[r'cq.dam.batch.collection.properties']),
        cqPeriodDamPeriodBatchPeriodCollectionPeriodMaxcollections: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.batch.collection.maxcollections']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletCollectionServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletCollectionServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletCollectionServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletCollectionServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletCollectionServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletCollectionServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletCollectionServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletCollectionServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletCollectionServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletCollectionServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

