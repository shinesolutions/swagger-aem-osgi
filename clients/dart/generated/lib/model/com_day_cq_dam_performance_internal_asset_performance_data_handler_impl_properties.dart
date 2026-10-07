//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties {
  /// Returns a new [ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties] instance.
  ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties({
    this.batchPeriodCommitPeriodSize,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConfigNodePropertyInteger? batchPeriodCommitPeriodSize;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties &&
    other.batchPeriodCommitPeriodSize == batchPeriodCommitPeriodSize;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (batchPeriodCommitPeriodSize == null ? 0 : batchPeriodCommitPeriodSize!.hashCode);

  @override
  String toString() => 'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties[batchPeriodCommitPeriodSize=$batchPeriodCommitPeriodSize]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.batchPeriodCommitPeriodSize != null) {
      json[r'batch.commit.size'] = this.batchPeriodCommitPeriodSize;
    } else {
      json[r'batch.commit.size'] = null;
    }
    return json;
  }

  /// Returns a new [ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties(
        batchPeriodCommitPeriodSize: ConfigNodePropertyInteger.fromJson(json[r'batch.commit.size']),
      );
    }
    return null;
  }

  static List<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties> mapFromJson(dynamic json) {
    final map = <String, ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties-objects as value to a dart map
  static Map<String, List<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

