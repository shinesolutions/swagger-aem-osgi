//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamCoreImplServletBatchMetadataServletProperties {
  /// Returns a new [ComDayCqDamCoreImplServletBatchMetadataServletProperties] instance.
  ComDayCqDamCoreImplServletBatchMetadataServletProperties({
    this.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault,
    this.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault,
    this.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyArray? cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamCoreImplServletBatchMetadataServletProperties &&
    other.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault == cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault &&
    other.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault == cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault &&
    other.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources == cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault == null ? 0 : cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault!.hashCode) +
    (cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault == null ? 0 : cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault!.hashCode) +
    (cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources == null ? 0 : cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources!.hashCode);

  @override
  String toString() => 'ComDayCqDamCoreImplServletBatchMetadataServletProperties[cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault=$cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault, cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault=$cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault, cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources=$cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault != null) {
      json[r'cq.dam.batch.metadata.asset.default'] = this.cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault;
    } else {
      json[r'cq.dam.batch.metadata.asset.default'] = null;
    }
    if (this.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault != null) {
      json[r'cq.dam.batch.metadata.collection.default'] = this.cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault;
    } else {
      json[r'cq.dam.batch.metadata.collection.default'] = null;
    }
    if (this.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources != null) {
      json[r'cq.dam.batch.metadata.maxresources'] = this.cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources;
    } else {
      json[r'cq.dam.batch.metadata.maxresources'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamCoreImplServletBatchMetadataServletProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamCoreImplServletBatchMetadataServletProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamCoreImplServletBatchMetadataServletProperties(
        cqPeriodDamPeriodBatchPeriodMetadataPeriodAssetPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'cq.dam.batch.metadata.asset.default']),
        cqPeriodDamPeriodBatchPeriodMetadataPeriodCollectionPeriodDefault: ConfigNodePropertyArray.fromJson(json[r'cq.dam.batch.metadata.collection.default']),
        cqPeriodDamPeriodBatchPeriodMetadataPeriodMaxresources: ConfigNodePropertyInteger.fromJson(json[r'cq.dam.batch.metadata.maxresources']),
      );
    }
    return null;
  }

  static List<ComDayCqDamCoreImplServletBatchMetadataServletProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamCoreImplServletBatchMetadataServletProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamCoreImplServletBatchMetadataServletProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamCoreImplServletBatchMetadataServletProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamCoreImplServletBatchMetadataServletProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamCoreImplServletBatchMetadataServletProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamCoreImplServletBatchMetadataServletProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamCoreImplServletBatchMetadataServletProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamCoreImplServletBatchMetadataServletProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamCoreImplServletBatchMetadataServletProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

